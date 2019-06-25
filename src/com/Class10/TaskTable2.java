package com.Class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.CommonMethods;

public class TaskTable2 extends CommonMethods{

	public static void main(String[] args) {
		String url="https://the-internet.herokuapp.com/";
		setUpDriver("chrome",url);
		driver.findElement(By.xpath("//a[text()='Sortable Data Tables']")).click();
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='table2']/tbody/tr"));
		System.out.println(rows.size());
		List<WebElement> cols=driver.findElements(By.xpath("//table[@id='table2']/thead/tr/th"));
		System.out.println(cols.size());
		
		
		for(int i=1; i<rows.size(); i++) {
			for(int j=1; j<cols.size(); j++) {
			WebElement element=driver.findElement(By.xpath("//table[@id='table2']/tbody/tr["+i+"]/td["+j+"]"));
			System.out.println(element.getText());	
				
			}
		}
		
		List<WebElement>cells=driver.findElements(By.xpath("//table[@id='table2']/tbody/tr/td"));
		for(WebElement cell:cells) {
			System.out.println(cell.getText());
		}
	}

}
