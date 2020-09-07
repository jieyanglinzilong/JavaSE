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
        amqpAdmin.declareExchange(new FanoutExchange("fanout_exchange"));
        amqpAdmin.declareQueue(new Queue("fanout_quque_eamil"));
        amqpAdmin.declareQueue(new Queue("fanout_quque_sms"));
        amqpAdmin.declareBinding(new Binding("fanout_quque_eamil",Binding.DestinationType.QUEUE,"fanout_exchange"," ",null));
        amqpAdmin.declareBinding(new Binding("fanout_quque_sms",Binding.DestinationType.QUEUE,"fanout_exchange"," ",null));
    }

}
