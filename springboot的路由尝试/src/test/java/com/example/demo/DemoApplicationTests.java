package com.example.demo;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    private AmqpAdmin amqpAdmin;

    @Test
   public void contextLoads() {
        amqpAdmin.declareExchange(new FanoutExchange("fan"));
        amqpAdmin.declareQueue(new Queue("email"));
        amqpAdmin.declareBinding(new Binding("email",Binding.DestinationType.QUEUE,"fan"," ",null));

    }

}
