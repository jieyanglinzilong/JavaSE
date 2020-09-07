package com.example.demo;

import com.example.demo.domin.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@SpringBootTest
@RunWith(SpringRunner.class)
public class test1 {
    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Test
    public void push(){
        User user=new User();
        user.setId(12);
        user.setName("小明");
        user.setAge(12);

        rabbitTemplate.convertAndSend("fan"," ",user);
    }
    @Test
    public  void run(){

     rabbitTemplate.convertAndSend("route_exchange","error_key","routing and error");
    }
}
