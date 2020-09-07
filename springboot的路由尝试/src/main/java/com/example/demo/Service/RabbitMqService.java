package com.example.demo.Service;


import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMqService {
    @RabbitListener(bindings =@QueueBinding(value = @Queue("route_error"),exchange = @Exchange(value="route_exchange",type = "direct"),key="error_key"))
    public void psubConsumerEmail(String message){

        System.out.println("接受错误信息"+message);

    }
    @RabbitListener(bindings = @QueueBinding(value = @Queue("routing"),exchange = @Exchange(value = "rounting_exchange",type = "direct"),key = {"error_routing_key",
    "info_routing_key","waring_routing_error"}))
    public void routing(String message){
            System.out.println("接受info信息"+message);
    }

}
