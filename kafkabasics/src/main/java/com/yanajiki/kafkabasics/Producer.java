package com.yanajiki.kafkabasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class Producer {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public void sendMessage(String destinationTopic, Object message) {
        kafkaTemplate.send(destinationTopic, message);
    }
}
