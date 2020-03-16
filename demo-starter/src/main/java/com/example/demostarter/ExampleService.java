package com.example.demostarter;

import lombok.Data;

@Data
public class ExampleService {
    public ExampleService(String prefix, String suffix) {
        this.prefix = prefix;
        this.suffix = suffix;
    }

    private String prefix;
    private String suffix;


    public String wrap(String word) {
        return prefix + word + suffix;
    }
}
