package com.yanajiki.kafkabasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class KafkaBasicsConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaBasicsConsumerApplication.class, args);
	}

}
