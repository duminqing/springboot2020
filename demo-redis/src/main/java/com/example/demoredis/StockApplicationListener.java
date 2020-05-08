package com.example.demoredis;

import lombok.extern.slf4j.Slf4j;
import org.redisson.api.RTopic;
import org.redisson.api.RedissonClient;
import org.redisson.api.listener.MessageListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 清算监听
 *
 * @author Administrator
 */
@Slf4j
@Component
public class StockApplicationListener implements ApplicationListener<ContextRefreshedEvent> {
    @Autowired
    private RedissonClient redissonClient;
    private final AtomicInteger index = new AtomicInteger(0);

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        log.info("接收到ContextStartedEvent，启动清算线程");
        RTopic topic = redissonClient.getTopic("Stock_My");

        MessageListener listener = new MessageListener() {
            @Override
            public void onMessage(CharSequence channel, Object msg) {
                log.info("Stock1:" + msg + " index = " + index.getAndIncrement());
            }
        };
        topic.addListenerAsync(String.class, listener);
    }
}
