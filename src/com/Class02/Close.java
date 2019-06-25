package com.Class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","/Users/betul/Selenium/chromedriver");
	     WebDriver driver= new ChromeDriver();
	     driver.get("http://cnn.com");
	   //  driver.close(); //close the one window.
         driver.quit(); //close the entire browser.
	}

}
