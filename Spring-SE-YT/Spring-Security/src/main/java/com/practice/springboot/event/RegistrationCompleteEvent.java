package com.practice.springboot.event;

import org.springframework.context.ApplicationEvent;

import com.practice.springboot.entity.User;


public class RegistrationCompleteEvent extends ApplicationEvent{

	public String getApplicationurl() {
		return applicationurl;
	}
	public void setApplicationurl(String applicationurl) {
		this.applicationurl = applicationurl;
	}
	public void setUser(User user) {
		this.user = user;
	}
	private User user;
	private String applicationurl;
	public RegistrationCompleteEvent(User user, String applicationurl) {
		super(user);
		// TODO Auto-generated constructor stub
		this.user=user;
		this.applicationurl=applicationurl;
	}
	public User getUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
