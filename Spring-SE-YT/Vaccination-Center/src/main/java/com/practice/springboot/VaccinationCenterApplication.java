package com.practice.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class VaccinationCenterApplication {
	@GetMapping("//")
	public static void main(String[] args) {
		SpringApplication.run(VaccinationCenterApplication.class, args);
		System.out.println("ljhvkjhvjh");
		
	}

}
