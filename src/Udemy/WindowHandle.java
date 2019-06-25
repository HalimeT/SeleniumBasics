package Udemy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/betul/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://uitestpractice.com/");
		driver.findElement(By.partialLinkText("Switch to")).click();
		driver.findElement(By.linkText("Opens in a new window")).click();
		
		//System.out.println(driver.getTitle());
	    Set<String>ids=driver.getWindowHandles();
	    Iterator<String>it=ids.iterator();
	    String parent=it.next();
	    String child=it.next();
	    System.out.println(driver.switchTo().window(parent).getTitle());
	    System.out.println(driver.switchTo().window(child).getTitle());
	
		
		driver.quit();
	}

}
