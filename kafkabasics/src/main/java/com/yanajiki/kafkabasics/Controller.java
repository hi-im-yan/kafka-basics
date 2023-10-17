package com.yanajiki.kafkabasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    Producer producer;

    @PostMapping("/send-mail")
    public void sendMail(@RequestBody SendMailDTO sendMailDTO) {
        producer.sendMessage("send-mail", sendMailDTO);
    }
}
