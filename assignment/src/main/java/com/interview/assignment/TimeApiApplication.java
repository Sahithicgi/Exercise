package com.interview.assignment;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;

@SpringBootApplication
@RestController
public class TimeApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(com.interview.assignment.TimeApiApplication.class, args);
	}

	@GetMapping("/")
	public String getTime() {
		LocalDateTime currentTime = LocalDateTime.now();
		String message = "Automate All The Things";
		return "Current Time: " + currentTime + "\nMessage: " + message;
	}
}
