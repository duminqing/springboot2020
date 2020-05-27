package com.example.cloudeurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


/***
 * 这里配置了服务注册与发现
 * feign负载均衡
 * 熔断器在yml文件里
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class CloudEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaClientApplication.class, args);
    }

}
