package com.Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConstructPartialXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/betul/Selenium/chromedriver");
         WebDriver driver=new ChromeDriver();
         driver.get("https://www.saucedemo.com/");
         driver.findElement(By.xpath("//input[starts-with(@id,'u')]")).sendKeys("");
	}

}
