package com.Class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//   System.setProperty("webdriver.chrome.driver","/Users/betul/Selenium/chromedriver");
//   WebDriver driver= new ChromeDriver();
//   
//   driver.get("http://google.com");
//   driver.get("http://amazon.com");
//   driver.get("http://facebook.com");
		
		System.setProperty("webdriver.gecko.driver", "/Users/betul/Selenium/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
	}

}
