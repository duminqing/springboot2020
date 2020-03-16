package com.example.demostartertest;

import com.example.demostarter.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoStarterTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoStarterTestApplication.class, args);
    }
    @Autowired
    private ExampleService exampleService;

    @GetMapping("/input")
    public String input(String word){
        return exampleService.wrap(word);
    }
}
