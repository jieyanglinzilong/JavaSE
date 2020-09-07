package com.example.demo.Services;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;


@Service
public class RabbitServices2 {
    @RabbitListener(queues = "fanout_quque_eamil")
    public void psubConsumerEmail(Message message){
        byte[] bytes=message.getBody();
        String s=new String(bytes);
        System.out.println("邮件服务"+s);
    }
}
