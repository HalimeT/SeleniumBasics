package com.Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFacebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/betul/Selenium/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/");
        //by Xpath contains  and starts-with
        driver.findElement(By.xpath("//input[contains(@name,'firs')]")).sendKeys("john");
        driver.findElement(By.xpath("//input[starts-with(@id,'pas')]")).sendKeys("1123mjhff");
        //by the attribute
        driver.findElement(By.name("websubmit")).click();
	
	}

}
