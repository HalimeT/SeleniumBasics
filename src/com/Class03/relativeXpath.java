package com.Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class relativeXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/betul/Selenium/chromedriver");
	     WebDriver driver= new ChromeDriver();
	     driver.get("https://www.saucedemo.com/");
	     
	     driver.findElement(By.xpath("//input[@data-test='username']")).sendKeys("standard_user");
	     
        driver.findElement(By.xpath("//input[@data-test='password']")).sendKeys("secret_sauce");
        
        driver.findElement(By.xpath("//input[@class='btn_action']")).click();
	
       
// driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
// Thread.sleep(2000);
// driver.findElement(By.xpath("//input[@data-test='password']")).sendKeys("secret_sauce");
// Thread.sleep(2000);
// driver.findElement(By.xpath("//input[@value='LOGIN']")).click();

    	}
	}

}
