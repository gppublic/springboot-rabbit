package com.gupaoedu.provider;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyProvider {

    @Autowired
    AmqpTemplate amqpTemplate;

    public void send(){
        // 发送4条消息

        amqpTemplate.convertAndSend("","FIRST_QUEUE","-------- a direct msg");

        amqpTemplate.convertAndSend("TOPIC_EXCHANGE","shanghai.gupao.teacher","-------- a topic msg : shanghai.gupao.teacher");
        amqpTemplate.convertAndSend("TOPIC_EXCHANGE","changsha.gupao.student","-------- a topic msg : changsha.gupao.student");

        amqpTemplate.convertAndSend("FANOUT_EXCHANGE","","-------- a fanout msg");

    }

}
