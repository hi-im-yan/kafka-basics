package com.yanajiki.kafkabasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableKafka
public class KafkaBasicsProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaBasicsProducerApplication.class, args);
	}

	@GetMapping("/health")
	public ResponseEntity<String> healthCheck() {
		return ResponseEntity.ok("I'm alive");
	}
}
