package com.Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryTours {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/betul/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("john");
		driver.findElement(By.name("lastName")).sendKeys("john");
		driver.findElement(By.name("phone")).sendKeys("234523456");
		driver.findElement(By.id("userName")).sendKeys("");
		driver.findElement(By.name("address1")).sendKeys("Va");
		

	}

}
