package com.yanajiki.kafkabasics;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class SendMailDTO {

    private String receiver;
    private String subject;
    private String message;
}
