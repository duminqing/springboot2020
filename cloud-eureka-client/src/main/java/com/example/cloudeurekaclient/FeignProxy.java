package com.example.cloudeurekaclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "server1", fallback = FeignFallback.class)
public interface FeignProxy {

    @GetMapping("/server/1")
    String server1();

}
