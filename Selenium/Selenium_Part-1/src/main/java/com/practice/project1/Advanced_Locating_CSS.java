package com.practice.project1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Advanced_Locating_CSS {

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

		System.out.println("inputAdminElements has " + inputAdminElements.size());//3
		
		// Same as above but using CSS selectors
		List<WebElement> inputAdminElementsUsingCSSSelectors = driver.findElements(By.cssSelector("input[id*='admin']"));
		System.out.println("inputAdminElementsUsingCSSSelectors has " + inputAdminElementsUsingCSSSelectors.size());//3
		
		List<WebElement> inputAdminElementsUsingCSSSelectors2 = driver.findElements(By.cssSelector("input[id$='xyz']"));
		System.out.println("input  whose ids end with xyz " + inputAdminElementsUsingCSSSelectors2.size()); //2
		
		WebElement h4SecondChildInsideDiv = driver.findElement(By.cssSelector("div[id='eCommerce'] h4:nth-child(2)"));
		System.out.println("h4SecondChildInsideDiv text is " + h4SecondChildInsideDiv.getText()); // h4 second
		
		// Locate and Process multi select list
		WebElement selectMonthElement = driver.findElement(By.id("month"));
		Select selectMonth =  new Select(selectMonthElement);
		
		System.out.printf("\n selectMonth.isMultiple() = %s", selectMonth.isMultiple());
		
		
		selectMonth.selectByIndex(0);
		selectMonth.selectByIndex(3);
		selectMonth.selectByIndex(6);
		
		List<WebElement>  allMonthsSelected = selectMonth.getAllSelectedOptions();
		for(WebElement monthOption: allMonthsSelected) {
			System.out.printf("\n option selected = %s", monthOption.getText());
		}
		
		
		
	}
	
	

}