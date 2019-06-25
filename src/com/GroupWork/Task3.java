package com.GroupWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.CommonMethods;

public class Task3 extends CommonMethods{

	
// TC 1: Table headers and rows verification
//		1.Open chrome browser
//		2.Go to “https://jqueryui.com/”
//		3.Click on “Datepicker”
//		4.Select August 10 of 2019
//		Verify date “08/10/2019” has been entered succesfully
//		6.Close browser
		
		public static void main(String[] args) {
	        setUpDriver("chrome", "https://jqueryui.com/");
	        driver.findElement(By.xpath("//a[text()='Datepicker']")).click();
	        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
	        driver.findElement(By.cssSelector("input#datepicker")).click();
	    
	        while (!driver.findElement(By.cssSelector("[class='ui-datepicker-title']")).getText().contains("August 2019")) {
	            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
	        }
	        List<WebElement> cells = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
	        for (WebElement cell : cells) {
	            String day = cell.getText();
	            if (day.equals("10")) {
	                cell.click();
	            }
	        }
	       
		String verify=driver.findElement(By.id("datepicker")).getAttribute("value");
        if(verify.equals("08/10/2019")) {
			System.out.println("date has been entered succesfully");
	    }else {
			System.out.println("check it again!");
		}
		
		driver.quit();
	
	
		
		

	}

}
