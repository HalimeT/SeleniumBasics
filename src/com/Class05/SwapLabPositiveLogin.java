package com.Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwapLabPositiveLogin {
public static void main(String[] args) throws InterruptedException {
	String Name="standard_user";
	String passsword="secret_sauce";
		System.setProperty("webdriver.chrome.driver", "/Users/betul/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.saucedemo.com/");
		//login to the application
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
	    driver.findElement(By.cssSelector("input[type^='pass']")).sendKeys("secret_sauce");
        driver.findElement(By.className("btn_action")).click();
        //logo verification
        boolean logo = driver.findElement(By.cssSelector("div.peek")).isDisplayed();
       
		if (logo) {
			System.out.println("SwapLab logo is displayed");
		} else {
			System.out.println("SwapLab logo is NOT displayed");
		}//verify product text
		 WebElement product=driver.findElement(By.xpath("//div[text()='Products']"));
		 boolean displayP=product.isDisplayed();
	     String productText=product.getText();
	     String expectedText="Products";
	     if(displayP&& productText.equals(expectedText)) {
	    	 System.out.println("Element  is displayed and text is"+productText);
	     }else {
	    	 System.out.println("Element is Not displayed or text is Not "+productText);
	     }
	    	 
	    	 
		Thread.sleep(3000);
		driver.quit();

		
	}

}
