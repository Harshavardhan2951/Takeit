package com.practice.springboot.model;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
public class UserModel {
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMatchingpassword() {
		return matchingpassword;
	}
	public void setMatchingpassword(String matchingpassword) {
		this.matchingpassword = matchingpassword;
	}
	private Long id;
	private String firstName;
	private String email;
	private String lastName;
	private String password;
	private String matchingpassword;
	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}
}
