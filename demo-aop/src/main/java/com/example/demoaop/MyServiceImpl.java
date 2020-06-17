package com.example.demoaop;

import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService {
    @Override
    public String test1() {
        return "1";
    }
}
