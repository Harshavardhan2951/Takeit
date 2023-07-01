package com.Practice.Exercise;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

/*Pojo*/
@Component

public class Alien {
	private String aname;
	private int aid;
	private String tech;
	@Autowired
	private Laptop laptop;
	
	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public Alien() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Object is created");
	}

	public String getAname() {
		return aname;
	}
	
	public void setAname(String aname) {
		this.aname = aname;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	public void setup() {
	    System.out.println("Heyy Bro, could you please help me to print");
	    laptop.setBrand("blue");
	    laptop.compile();
	}

}
