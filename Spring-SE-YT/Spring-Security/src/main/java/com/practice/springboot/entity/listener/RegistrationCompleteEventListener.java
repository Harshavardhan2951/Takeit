package com.practice.springboot.entity.listener;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;

import com.practice.springboot.entity.User;
import com.practice.springboot.event.RegistrationCompleteEvent;
import com.practice.springboot.service.UserService;

public class RegistrationCompleteEventListener implements ApplicationListener<RegistrationCompleteEvent>{
	@Autowired
	private UserService userService;
	@Override
	public void onApplicationEvent(RegistrationCompleteEvent event) {
		/*Create the Verification token for the user with the link*/
		/*Send mail to user*/
		User user = event.getUser();
		String token = UUID.randomUUID().toString();
		userService.saveVerificationTokenForUser(token, user);
		
	}

}
