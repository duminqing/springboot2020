package com.example.dubboclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DubboController {
    @Autowired
    HelloConsumer helloConsumer;

    @GetMapping("/1")
    public String getString() {
        return helloConsumer.getWhat();
    }
}
