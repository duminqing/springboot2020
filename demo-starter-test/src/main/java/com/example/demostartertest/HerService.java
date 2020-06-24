package com.example.demostartertest;

import org.springframework.stereotype.Service;

@Service
public class HerService extends HisService{

    @Override
    void test() {
        System.out.println("her");
    }
}
