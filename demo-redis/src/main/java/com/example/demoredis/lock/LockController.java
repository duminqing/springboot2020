package com.example.demoredis.lock;

import org.redisson.RedissonLock;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@RestController
public class LockController {

    private Lock lock = new RedissonLock(null, "");
}
