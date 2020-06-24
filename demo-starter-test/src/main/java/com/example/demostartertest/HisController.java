package com.example.demostartertest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/his")
public class HisController {

    @Autowired
    private HisService hisService;
    @Autowired
    private HerService herService;
    @Autowired
    private MyService myService;
    @GetMapping("/1")
    public String test1() {
        throw new RuntimeException("lalalallala");
    }

    @GetMapping("/2")
    public String test2() {
        return "his2";
    }


    @GetMapping("/3")
    public String test3() {
        myService.test();
        return "3";
    }


    @GetMapping("/4")
    public String test4() {
        hisService.test();
        return "4";
    }



    @GetMapping("/5")
    public String test5() {
        herService.test();
        return "5";
    }
}
