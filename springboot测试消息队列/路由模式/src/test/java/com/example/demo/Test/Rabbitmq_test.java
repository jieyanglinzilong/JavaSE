package com.example.demo.Test;

import com.example.demo.domin.User;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Rabbitmq_test {
    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Test
    public void psubPublisher(){
        User user=new User();
        user.setName("周可凡");
        user.setId(1);
        user.setAddress("广州");
        user.setDate(new Date());
        user.setSex("女");
        rabbitTemplate.convertAndSend("lin","",user);
    }
    @Test
    public void routingPublisher() {
        rabbitTemplate.convertAndSend("routing_exchange","error_routing_key","routing send  error message");
    }
}
