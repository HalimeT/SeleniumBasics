package com.Class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","/Users/betul/Selenium/chromedriver");
//	   WebDriver driver= new ChromeDriver();
//	    driver.get("http://google.com");
//	    System.out.println(driver.getTitle());
//	    String title=driver.getTitle();
//	    if(title.equalsIgnoreCase("google")) {
//	    	System.out.println("this is the right title");
//	    }else {
//	    	System.out.println("sorry this is not the title");
//	    }
	    WebDriver driver= new ChromeDriver();
	    driver.get("http://facebook.com");
	    System.out.println(driver.getTitle());
	    String title1=driver.getTitle();
	    
	    if(title1.equalsIgnoreCase("Facebook - Log In or Sign Up")) {
	    	System.out.println(title1+" is correct title");
	    	
	    }else {
	    	System.out.println(title1+" is not correct title");
	    }
	    
	}

}
