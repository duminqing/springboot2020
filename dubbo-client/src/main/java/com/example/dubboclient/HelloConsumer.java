package com.example.dubboclient;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.dubbo.IHelloService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class HelloConsumer {
    @Reference(url = "dubbo://127.0.0.1:20880")
    private IHelloService iHelloService;

    public String getWhat() {
        return iHelloService.sayHello();
    }
}
