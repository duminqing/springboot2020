package com.example.cloudeurekaclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Resource
    private FeignProxy feignProxy;

    @GetMapping("/1")
    public String test1() {
        return "from client 1 test1" + feignProxy.server1();
    }
}
