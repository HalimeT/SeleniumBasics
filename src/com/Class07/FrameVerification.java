package com.Class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.CommonMethods;

public class FrameVerification extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		// TC 1: ToolsQA Frame verification
//		Open chrome browser
//		Go to “https://www.toolsqa.com/iframe-practice-page/”
//		Click on “Blogs” link inside first frame
//		Verify element “Interactions” is present in second frame.
//		Navigate to Home Page
//		Quit browser

		CommonMethods.setUpDriver("chrome", "https://www.toolsqa.com/iframe-practice-page/");
		driver.switchTo().frame("IF1");
		driver.findElement(By.xpath("//a[text()='Git Log']")).click();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("iframe2");
		boolean inter = driver.findElement(By.xpath("//h3[text()='Interactions']")).isDisplayed();
		if(inter==true) {
			driver.switchTo().defaultContent();
			driver.close();
		}
	}}

