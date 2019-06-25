package com.Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1withTheLocators {
	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * Open chrome browser Go to “https://www.facebook.com/”
		 *  Enter valid username and valid password and 
		 *  click login 
		 *  User successfully logged in
		 *"
		 */
		//test.rasmi@gmail.com
       //Syntax123
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/betul/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("test.rasmi@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("pass")).sendKeys("Syntax123");
		driver.findElement(By.partialLinkText("Forgot")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.name("pass")).sendKeys("Syntax123");
		Thread.sleep(1000);
		driver.findElement(By.id("u_0_2")).click();
		driver.close();
		
		
		

	}



}
