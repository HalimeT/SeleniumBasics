package com.Class10;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.CommonMethods;

public class TaskTable1 extends CommonMethods {

	public static void main(String[] args) {
//		Open chrome browser
//		Go to “https://the-internet.herokuapp.com/”
//		Click on “Click on the “Sortable Data Tables” link
//		Verify tables consist of 4 rows and 6 columns
//		Print name of all column headers
//		Print data of all rows
		String url="https://the-internet.herokuapp.com/";
		setUpDriver("chrome",url);
		driver.findElement(By.xpath("//a[text()='Sortable Data Tables']")).click();
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		System.out.println(rows.size());
		for(WebElement row:rows) {
			System.out.println(row.getText());
		}
		
		List<WebElement> cols=driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
		System.out.println(cols.size());
		Iterator<WebElement>it=cols.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().getText());
			
		}//To execute cell by cell...for table it is preferrable
		for(int i=1; i<rows.size(); i++) {
			for(int j=1; j<cols.size(); j++) {
			WebElement element=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td["+j+"]"));
			System.out.println(element.getText());	
				
			}
			
		}//2nd way  is preferrable for calender
		List<WebElement>cells=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td"));
		for(WebElement cell:cells) {
			System.out.println(cell.getText());
			
		}
	//	driver.quit();

	}

}
