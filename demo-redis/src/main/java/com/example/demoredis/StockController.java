package com.example.demoredis;


import lombok.extern.slf4j.Slf4j;
import org.redisson.api.RLock;
import org.redisson.api.RTopic;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 */
@Slf4j
@RestController
@RequestMapping("/stock")
public class StockController {
    @Autowired
    private RedissonClient redissonClient;

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @GetMapping("/A")
    public void getA() {
        log.info("hello stock");
        RLock lock = redissonClient.getLock("DMQ");
        try {
            lock.lock();

            redisTemplate.opsForList().leftPush("DMQList", "测试1");
            redisTemplate.opsForList().leftPush("DMQList", "测试2");
            redisTemplate.opsForList().leftPush("DMQList", "测试3");
        } finally {
            lock.unlock();
        }
    }

    @GetMapping("/B/{stkId}")
    public void getB(@PathVariable("stkId") String stkId) {
        System.out.println("hehe");
        RTopic topic = redissonClient.getTopic("Stock_My");
        topic.publish(stkId);
        System.out.println("heh  end");

    }
}
