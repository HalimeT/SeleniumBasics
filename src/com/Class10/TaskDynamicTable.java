package com.Class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.CommonMethods;

public class TaskDynamicTable extends CommonMethods{

	public static void main(String[] args) {
	
		String url="http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
		setUpDriver("chrome", url);
		sendText(driver.findElement(By.id("ctl00_MainContent_username")), "Tester");
		sendText(driver.findElement(By.cssSelector("#ctl00_MainContent_password")), "test");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		List<WebElement> rows=driver.findElements(By.cssSelector("table[id$='_orderGrid'] tbody tr"));
		System.out.println(rows.size());
		List<WebElement> cols=driver.findElements(By.xpath("//table[contains(@id, 'orderGrid')]/tbody/tr[1]/th"));
		System.out.println(cols.size());
		String expectedValue="Susan McLaren";
		for(int i=1; i<rows.size(); i++) {
			 String text=driver.findElement(By.xpath("//table[contains(@id,'orderGrid')]/tbody/tr["+i+"]")).getText();
	            if(text.contains(expectedValue)) {
	                System.out.println("Present");
	            }
			
		}
	}

}
