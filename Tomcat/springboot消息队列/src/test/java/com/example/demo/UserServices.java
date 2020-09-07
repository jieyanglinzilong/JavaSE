package com.example.demo;

import com.example.demo.domin.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServices {
    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Test
    public void psublish(){
        User user=new User();
        user.setAge(12);
        user.setName("小红");
        user.setId(1);
        rabbitTemplate.convertAndSend("fanout_exchange"," ",user);
    }
}
