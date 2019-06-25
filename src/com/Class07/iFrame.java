package com.Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.CommonMethods;

public class iFrame extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");
		//one way
		//driver.switchTo().frame("iframe_a");
		//second way
		//WebElement element=driver.findElement(By.xpath("//iframe[@name='iframe_a]"));
		//driver.switchTo().frame(element);
		//WAY 3
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#name")).sendKeys("betul");
         driver.close();
	}

}
