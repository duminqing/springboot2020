package com.example.demoaop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/my")
public class MyController {
    @RequestMapping("/1")
    public String test1() {
        log.info("test 1");

        return "1";
    }

    @RequestMapping("/11")
    public void test11() {
        log.info("test 11");
        throw new RuntimeException("1/0");
    }

    @RequestMapping("/2")
    public void test2() {
        log.info("test 2");
    }
}
