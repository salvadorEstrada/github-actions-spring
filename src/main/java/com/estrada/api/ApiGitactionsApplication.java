package com.estrada.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApiGitactionsApplication {

	@GetMapping("/greet")
	public String great() {
		return "Hello from Spring Boot!";
	}
	@GetMapping("/greet1")
	public String great1() {
		return "Hello from Spring Boot!";
	}

	public static void main(String[] args) {
		SpringApplication.run(ApiGitactionsApplication.class, args);
	}

}
