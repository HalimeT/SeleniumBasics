package com.Class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.CommonMethods;

public class TaskDragDrop extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
//		Ahead to https://jqueryui.com/droppable/
//			handle the frame
//			drag and drop
//			close browser

		 CommonMethods.setUpDriver("chrome", "https://jqueryui.com/droppable/");
		 driver.switchTo().frame(0);
		 WebElement drag=driver.findElement(By.id("draggable"));
	      WebElement drop=driver.findElement(By.id("droppable"));
	      Actions act=new Actions(driver);
	      act.dragAndDrop(drag, drop).build().perform();
	      Thread.sleep(3000);
	      driver.close();
	}
	

}
