package com.Class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.CommonMethods;

public class RightClick extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
	setUpDriver("chrome","https://www.saucedemo.com" );
	WebElement element=driver.findElement(By.cssSelector("input#password"));
	Actions act=new Actions(driver);
	act.contextClick(element).perform();
	Thread.sleep(3000);
	driver.close();
	

	}

}
