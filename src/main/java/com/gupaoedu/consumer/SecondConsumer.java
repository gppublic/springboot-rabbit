package com.gupaoedu.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "SECOND_QUEUE")
public class SecondConsumer {

    @RabbitHandler
    public void process(String msg){
        System.out.println(" second queue received msg : " + msg);
    }
}
