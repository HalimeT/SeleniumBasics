package com.Class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1Amazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/betul/Selenium/chromedriver");
	     WebDriver driver= new ChromeDriver();
	     driver.navigate().to("https://www.amazon.com/");
        System.out.println(driver.getTitle());
        String title=driver.getTitle();
        boolean flag=false;
        if(title.equalsIgnoreCase("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more")) {
        	flag=true;
        }
        System.out.println(flag);
	}

}
