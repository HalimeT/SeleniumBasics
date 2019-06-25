package Udemy;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class DropDownSpiceJet {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/betul/Selenium/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://book.spicejet.com/");
	
		WebElement currency=driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency"));
		 Select select=new Select(currency); 
		 select.selectByValue("USD");
	     select.selectByVisibleText("INR");
	     
	     //List<WebElement>  list=driver.findElements(By.name("ControlGroupSearchView$AvailabilitySearchInputSearchView$DropDownListCurrency"));
        List<WebElement> list=select.getOptions();
	     System.out.println(list);
		for(int i=0; i<list.size(); i++ ) {
        	select.selectByIndex(i);
        	 }
		
		for(WebElement money:list) {
			System.out.println(money.getText());
			
		}
		
		Iterator<WebElement> it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().getText());
		}
      
       
		driver.quit();
	}

}
