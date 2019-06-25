package com.Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/betul/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.name("firstname")).sendKeys("john");
		driver.findElement(By.id("u_0_e")).sendKeys("Ozcan");
		driver.findElement(By.id("u_0_h")).sendKeys("27832691981");
		driver.findElement(By.id("u_0_o")).sendKeys("123edvghf");
		driver.findElement(By.name("birthday_month")).sendKeys("June");
        driver.findElement(By.name("birthday_day")).sendKeys("19");
        driver.findElement(By.id("year")).sendKeys("1990");
        driver.findElement(By.id("u_0_9")).click();
        driver.findElement(By.name("websubmit")).click();
	}

}
