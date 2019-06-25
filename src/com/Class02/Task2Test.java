package com.Class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2Test {

	public static void main(String[] args) {
//		TC 2: Syntax Page URL Verification:
//			Open chrome browser
//			Navigate to “https://www.syntaxtechs.com/”
//			Navigate to “https://www.google.com/”
//			Navigate back to Syntax Technologies Page
//			Refresh current page
//			Verify url contains “Syntax”
		
		System.setProperty("webdriver.chrome.driver","/Users/betul/Selenium/chromedriver");
	     WebDriver driver= new ChromeDriver();
	     driver.navigate().to("https://www.syntaxtechs.com/");
	     driver.navigate().to("https://www.google.com/");
	     driver.navigate().back();
	     driver.navigate().refresh();
	     String url=driver.getCurrentUrl();
	     if(url.contains("Syntax")) {
	    	 System.out.println(url+" contains Syntax");
	    	 
	     }else {
	    	 System.out.println(url+" does not contain Syntax");
	     }
	     

	}

}
