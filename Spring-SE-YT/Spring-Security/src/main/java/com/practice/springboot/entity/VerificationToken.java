package com.practice.springboot.entity;

import java.sql.Date;
import java.util.Calendar;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class VerificationToken {
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Date getExpirationTime1() {
		return expirationTime;
	}

	public void setExpirationTime(Date expirationTime) {
		this.expirationTime = expirationTime;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public static int getExpirationTime() {
		return EXPIRATION_TIME;
	}
	private static final int EXPIRATION_TIME = 10;  
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String token;
	private Date expirationTime;
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="user id", nullable = false, foreignKey = @ForeignKey(name = "FK_USER_VERIFY_TOKEN"))
	private User user;
	public VerificationToken(Long id, String token, Date expirationTime, User user) {
		super();
		this.id = id;
		this.token = token;
		this.expirationTime = calculateExpirationDate(EXPIRATION_TIME);
		this.user = user;
	}
	
	public VerificationToken(String token) {
		super();
		this.token = token;
		this.expirationTime = calculateExpirationDate(EXPIRATION_TIME);
	}
	private Date calculateExpirationDate(int expirationTime) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(new Date(expirationTime).getTime());
		calendar.add(Calendar.MINUTE, expirationTime);
		return new Date(calendar.getTime().getTime());
	}
	
	
	
	
}
