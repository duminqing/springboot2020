package com.example.cloudeurekaclient;

import org.springframework.stereotype.Component;

@Component
public class FeignFallback implements FeignProxy {
    @Override
    public String server1() {
        return "feign请求失败啦";
    }
}
