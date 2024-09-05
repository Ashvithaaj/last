package com.example.finaltest.finalcoding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class FinalcodingApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinalcodingApplication.class, args);
	}
	@GetMapping("/welcome")
	public String welcome() {
		return "welcome to spring boot greeting app";
	}
	@GetMapping("/greeting")
	public String greeting() {
		return "greetings from spring boot greeting app";
	}
	@GetMapping("/hello")
	public String hello() {
		return "hello from spring boot greeting app";
	}

}
