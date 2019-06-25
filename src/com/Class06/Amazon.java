package com.Class06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

	public static void main(String[] args) {
//		TC 1: Amazon Department List Verification
//		Open chrome browser
//		Go to “http://amazon.com/”
//		Verify how many department options available.
//		Print each department
//		Select Computers
//		Quit browser
//		----------------------
		System.setProperty("webdriver.gecko.driver", "/Users/betul/Selenium/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://amazon.com/");
		Select obj;
		List<WebElement> options;
		WebElement search=driver.findElement(By.cssSelector("#searchDropdownBox"));
		obj=new Select(search);
		options=obj.getOptions();
		System.out.println(options.size());
		for(WebElement depart:options) {
			String department=depart.getText();
			System.out.println(department);
			
		}
		obj.selectByVisibleText("Computers");
		driver.quit();

	}

}
