package com.practice.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.practice.springboot.entity.User;
import com.practice.springboot.entity.VerificationToken;
import com.practice.springboot.model.UserModel;
import com.practice.springboot.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Override
	public User registerUser(UserModel userModel) {
		User user = new User();
		user.setEmail(userModel.getEmail());
		user.setFirstName(userModel.getFirstName());
		user.setLastName(userModel.getLastName());
		user.setPassword(passwordEncoder.encode(userModel.getPassword()));
		user.setRole("USER");
		
		userRepository.save(user);
		
		// TODO Auto-generated method stub
		return user;
	}
	@Override
	public void saveVerificationTokenForUser(String token, User user) {
		// TODO Auto-generated method stub
		VerificationToken verificationToken = new VerificationToken(user,  token);
	}

}
