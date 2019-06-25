package com.Class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.CommonMethods;

public class TaskAction extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
//		Navigate to https://www.toolsqa.com
//          Hover over the Tutorial menu
//          Click on Software Testing Tutorial
//          Close the browser
      CommonMethods.setUpDriver("chrome", "https://www.toolsqa.com");
      WebElement element=driver.findElement(By.xpath("//span[text()='Tutorial']"));
      Actions act=new Actions(driver);
      act.moveToElement(element).click().perform();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//span[text()='Software Testing Tutorial']")).click();
      Thread.sleep(2000);
      driver.close();
      
	}

}
