package com.yanajiki.kafkabasics;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@ToString
public class SendMailDTO {

    private String receiver;
    private String subject;
    private String message;
}
