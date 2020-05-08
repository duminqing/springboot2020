package com.example.demoredis.cache;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @author Administrator
 */
@RestController
@RequestMapping("/cache")
@Slf4j
public class CacheController {
    @Autowired
    private RedisTemplate<String, Stock> stockTemplate;

    @RequestMapping("/stock/save")
    public boolean saveStock() {
        Stock stock = new Stock();
        stock.setStkId("000016");
        stock.setStkName("上证50");
        stock.setSettlementPrice(BigDecimal.TEN);
        stockTemplate.opsForValue().setIfAbsent("000016", stock);
        return true;
    }

    @RequestMapping("/stock/get")
    public Stock getStock() {
        return stockTemplate.opsForValue().get("000016");
    }
}
