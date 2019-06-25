package com.Class12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import util.CommonMethods;

public class task1 extends CommonMethods{
//	TC 1: OrangeHRM Login
//
//	Navigate to “https://opensource-demo.orangehrmlive.com/”
//	Login to the application
//	Verify user is successfully logged in
//
//	Note: must use properties file
 Properties prop;
 @Test
 public void login() {
	 String filePath="src/configs/credentials.properties";
		
		try {
		FileInputStream fis=new FileInputStream(filePath);
	    prop=new Properties();
		prop.load(fis);
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		 String browser=prop.getProperty("browser1");
	        String url=prop.getProperty("url1");
	        String login=prop.getProperty("login");
	        String password=prop.getProperty("password");
	        
	        setUpDriver(browser, url);
	        sendText(driver.findElement(By.cssSelector("input#txtUsername")),login);
	        sendText(driver.findElement(By.cssSelector("input#txtPassword")),password);
	        driver.findElement(By.cssSelector("input#btnLogin")).click();
	        driver.close();
	 

		
 }
}
