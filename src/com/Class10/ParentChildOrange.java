package com.Class10;

import org.openqa.selenium.By;

import util.CommonMethods;
public class ParentChildOrange extends CommonMethods{

	public static void main(String[] args) {
		
        setUpDriver("chrome", "https://opensource-demo.orangehrmlive.com/");
        
        driver.findElement(By.xpath("//div[@id='divUsername']/input")).sendKeys("Admin");
        if(driver.findElement(By.xpath("//input[@id='txtPassword']/..")).isDisplayed()) {
            System.out.println("Element is displayed");
        }else {
            System.out.println("None");
        }
        //find preceding/previous sibling from current WebElement
        driver.findElement(By.xpath("//span[text()='Password']/preceding-sibling::input")).sendKeys("admin123");
        
        //find following/next sibling from current WebElement
        driver.findElement(By.xpath("//div[@id='divLoginHelpLink']/following-sibling::div/input")).click();
}
}