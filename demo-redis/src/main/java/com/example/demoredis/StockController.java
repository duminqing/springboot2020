package com.example.demoredis;


import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 */
@RestController
@RequestMapping("/stock")
public class StockController {
    @Autowired
    private RedissonClient redissonClient;

    @GetMapping("/stock")
    public void getA() {
        RLock lock = redissonClient.getLock("DMQ");
        try {
            lock.lock();
        } finally {
            lock.unlock();
        }
    }
}
