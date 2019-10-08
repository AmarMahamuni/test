package com.stock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestingApplication {
	@GetMapping("/")
	public String show()
	{
		return "welcome";
	}
	public static void main(String[] args) {
		SpringApplication.run(TestingApplication.class, args);
	}

}
