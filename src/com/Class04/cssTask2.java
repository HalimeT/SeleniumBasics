package com.Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssTask2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/betul/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
    driver.navigate().to("http://newtours.demoaut.com/");
	driver.findElement(By.cssSelector("a[href*='yregis']")).click();
	driver.findElement(By.cssSelector("input[name^='f']")).sendKeys("john");
	driver.findElement(By.cssSelector("input[name^='las']")).sendKeys("Doe");
	driver.findElement(By.cssSelector("input[name$='ne']")).sendKeys("911");
	driver.findElement(By.cssSelector("input[id*='erNa']")).sendKeys("test123@gmail.com");
	driver.findElement(By.cssSelector("input[name$='ss1']")).sendKeys("123 main street");
	driver.findElement(By.cssSelector("input[name$='ity']")).sendKeys("Ashburn");
	driver.findElement(By.cssSelector("input[name^='sta']")).sendKeys("VA");
	driver.findElement(By.cssSelector("input[name*='alCo']")).sendKeys("00000");
	driver.findElement(By.cssSelector("input[id*='ail']")).sendKeys("test123");
	driver.findElement(By.cssSelector("input[name*='pass']")).sendKeys("123");
	driver.findElement(By.cssSelector("input[name*='onfirm']")).sendKeys("123");
	driver.findElement(By.cssSelector("input[name^='regis']")).click();
	driver.close();
				
	}

}
