package com.example.demo.Service;

import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class service {
    @RabbitListener(bindings =@QueueBinding(value =@Queue("routing_queue_error"),exchange =@Exchange(value = "routing_exchange",type = "direct"),key = "error_routing_key"))
    public void routingConsumerError(String message) {
        System.out.println("接收到error级别日志消息： "+message);
    }
    /**
     *  2.2、路由模式消息接收，处理info、error、warning级别日志信息
     * @param message
     */
    @RabbitListener(bindings =@QueueBinding(value =@Queue("routing_queue_all"),exchange =@Exchange(value = "routing_exchange",type = "direct"),key = {"error_routing_key","info_routing_key","warning_routing_key"}))
    public void routingConsumerAll(String message) {
        System.out.println("接收到info、error、warning等级别日志消息： "+message);
    }
}
