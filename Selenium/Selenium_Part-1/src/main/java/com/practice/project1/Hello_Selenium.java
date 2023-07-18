package com.practice.project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Hello_Selenium {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		String baseUrl = "https://github.com/";
		driver.get(baseUrl);
		System.out.printf("The name of the Website is : %s", driver.getTitle());
	}
}
