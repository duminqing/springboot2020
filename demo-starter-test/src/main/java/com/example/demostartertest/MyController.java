package com.example.demostartertest;

import com.example.demostarter.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hi")
public class MyController {

    @Autowired
    private ExampleService exampleService;

    @GetMapping("/input/{word}")
    public String input(@PathVariable("word") String word) {
        return exampleService.wrap(word);
    }
}
