package com.example.demorabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/1")
public class Controller {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @RequestMapping("/1")
    public String test1() {
        amqpTemplate.convertAndSend("exchangeA", "2A1", "messageA1");
        amqpTemplate.convertAndSend("exchangeA", "2A2", "messageA2");
        return "1";
    }

    @RequestMapping("/2")
    public String test2() {
        amqpTemplate.convertAndSend("exchangeB", "", "广播消息");
        return "2";
    }

    @RequestMapping("/3")
    public String test3() {
        Object x = amqpTemplate.convertSendAndReceive("exchangeC", "2C1", 18);

        return x.toString();
    }

    @RabbitListener(queues = "queueC1")
    public int processMessage(int i) {
        System.out.println("服务器收到：" + i);
        return i * 10;
    }

    @RabbitListener(queues = "queueA1")
    public void processMessage(String content) {
        System.out.println("From 1 :" + content);
    }

    @RabbitListener(queues = "queueA2")
    public void processMessage2(String content) {
        System.out.println("From 2 :" + content);
    }

}
