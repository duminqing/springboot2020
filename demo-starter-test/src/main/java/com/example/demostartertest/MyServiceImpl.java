package com.example.demostartertest;

import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService{
    @Override
    public void test() {
        System.out.println("test!!");
    }
}
