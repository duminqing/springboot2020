package com.example.dubbo;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Component
@Service(interfaceClass = IHelloService.class)
public class HelloServiceImpl implements IHelloService {
    @Override
    public String sayHello() {
        return "hello";
    }
}
