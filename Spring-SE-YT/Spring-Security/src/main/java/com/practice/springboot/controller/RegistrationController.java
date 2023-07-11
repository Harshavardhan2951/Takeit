package com.practice.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.springboot.entity.User;
import com.practice.springboot.event.RegistrationCompleteEvent;
import com.practice.springboot.model.UserModel;
import com.practice.springboot.service.UserService;

@RestController
public class RegistrationController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@PostMapping("/register")
	public String registerUser(@RequestBody UserModel userModel) {
		User user = userService.registerUser(userModel);
		publisher.publishEvent(new RegistrationCompleteEvent(user,"url"));
		return "Success";
	}
}
