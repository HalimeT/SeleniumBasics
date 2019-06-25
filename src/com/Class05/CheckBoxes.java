package com.Class05;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/betul/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		List<WebElement>checkbox=driver.findElements(By.name("exp"));
		System.out.println(checkbox.size());
       String year="5";
		for (WebElement yearsOfExp :checkbox) {
			
			if (yearsOfExp.isEnabled()) {
				
				String value = yearsOfExp.getAttribute("value");
		    if (value.equals(year)) {
					yearsOfExp.click();
				}
			}
		}
		Thread.sleep(3000);
		List<WebElement> tools=driver.findElements(By.name("tool"));
		Iterator<WebElement> it=tools.iterator();
		while(it.hasNext()) {
			WebElement t=it.next();
			String tool=t.getAttribute("value");
			System.out.println(tool);
			if(tool.equals("Selenium Webdriver")) {
				t.click();
					
			}
		}
		 
		Thread.sleep(3000);
		driver.quit();

	}

}
