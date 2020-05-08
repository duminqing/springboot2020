package com.example.demostartertest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/his")
public class HisController {
    @GetMapping("/1")
    public String test1() {
        throw new RuntimeException("lalalallala");
    }

    @GetMapping("/2")
    public String test2() {
        return "his2";
    }
}
