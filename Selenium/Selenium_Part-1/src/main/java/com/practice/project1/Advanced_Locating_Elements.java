package com.practice.project1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Advanced_Locating_Elements {

	public static void main(String[] args) throws InterruptedException {
		// Basic configuration
				WebDriver driver = new ChromeDriver();
				
				demoAdvancedXPathCSSSelector(driver);

	}
	
	static void demoAdvancedXPathCSSSelector(WebDriver driver) {
		
		String baseUrl = "File:///D:\\\\Selenium\\\\Selenium_Part-1\\\\src\\\\main\\\\resources\\\\test.html";
		//String baseUrl = "https://github.com/awtraining1/sl/blob/main/PHASE5/afternoon/hello-selenium/src/main/resources/test.html";
		
		driver.get(baseUrl);
		
		
		List<WebElement> inputAdminElements = driver.findElements(By.xpath("//input[contains(@id, 'admin')]"));

		System.out.println("inputAdminElements has " + inputAdminElements.size());		
		
	}
	
	

}