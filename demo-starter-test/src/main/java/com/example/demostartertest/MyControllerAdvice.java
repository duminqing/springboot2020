package com.example.demostartertest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author Administrator
 */
@Slf4j
@RestControllerAdvice(assignableTypes = MyController.class)
public class MyControllerAdvice {

    @ExceptionHandler(RuntimeException.class)
    public String e1(RuntimeException ex) {
        log.info("", ex);
        return "runtime1";
    }
}
