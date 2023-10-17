package com.yanajiki.kafkabasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KafkaBasicsApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaBasicsApplication.class, args);
	}

	@GetMapping("/health")
	public ResponseEntity<String> healthCheck() {
		return ResponseEntity.ok("I'm alive");
	}
}
