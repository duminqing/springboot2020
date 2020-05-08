package com.example.demoredis.cache;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Stock {
    private String stkId;
    private String stkName;
    private BigDecimal settlementPrice;
}
