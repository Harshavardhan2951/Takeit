package com.Practice.Exercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootAuroWiringPrtApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext spring = SpringApplication.run(SpringBootAuroWiringPrtApplication.class, args);
		Vehicle veh = spring.getBean(Vehicle.class);
		veh.simple_setup();
		veh.setYear(1);
	}
}
