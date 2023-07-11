package com.practice.springboot.service;

import com.practice.springboot.entity.User;

import com.practice.springboot.model.UserModel;

public interface UserService {

	public User registerUser(UserModel userModel);

	public void saveVerificationTokenForUser(String token, User user);

}
