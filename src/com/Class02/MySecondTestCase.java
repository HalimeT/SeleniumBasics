package com.Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MySecondTestCase {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "/Users/betul/Selenium/chromedriver");
//		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "/Users/betul/Selenium/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
		//driver.navigate().to("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("wnhgdfd");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.lastName")).sendKeys("ikiddhjdjd");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.address.street")).sendKeys("980 winston street");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.address.city")).sendKeys("baltimore");
        driver.findElement(By.id("customer.address.state")).sendKeys("virginia");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("000000");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("000-000-d0000");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.ssn")).sendKeys("012 345 6787");
        driver.findElement(By.id("customer.username")).sendKeys("enhdufhj");
        driver.findElement(By.id("customer.password")).sendKeys("45678okhg");
        driver.findElement(By.id("repeatedPassword")).sendKeys("45678okhg");
        Thread.sleep(2000);
        driver.findElement(By.className("button")).click();
        
	}

}
