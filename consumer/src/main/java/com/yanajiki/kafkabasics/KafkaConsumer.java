package com.yanajiki.kafkabasics;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "send-mail", containerFactory = "newSendMailListenerContainerFactory")
    public void consume(String message) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        SendMailDTO send = objectMapper.readValue(message, SendMailDTO.class);

        System.out.println(send);
    }

}

