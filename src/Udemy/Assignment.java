package Udemy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.qaclickacademy.com/");
        driver.findElement(By.xpath("//a[text()='Practice']")).click();
        
        List<WebElement>rows=driver.findElements(By.xpath("//table[@id='product']/tbody/tr"));
        System.out.println("Number of row present  in the table is "+rows.size());
        
        List<WebElement> colls =driver.findElements(By.xpath("//table[@id='product']/tbody/tr/th"));
        System.out.println("Number of coll present in the table is "+colls.size());
        
        String SecondRow=driver.findElement(By.xpath("//table[@id='product']/tbody/tr[3]")).getText();
        System.out.println(SecondRow);
        driver.close();
	}

}
