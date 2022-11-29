package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MockMukulProg {

	public static void main(String[] args) {
		
		   System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		   
		   WebDriver driver = new ChromeDriver();
		   
		   driver.manage().window().maximize();
		   
		   driver.get("https://itera-qa.azurewebsites.net/home/automation");
		   
		    List<WebElement> checkall = driver.findElements(By.xpath("//*[contains(@class,'form-check-input')]"));
		    
		 WebElement monele = driver.findElement(By.xpath("//*[@id='monday']"));
		 
		 WebElement sunele = driver.findElement(By.xpath("//*[@id='sunday']"));

		   
		for(WebElement val:checkall)
			   
		   {
			  if(val.equals(monele)||val.equals(sunele))
			  {
				  val.click();
			  }
		   }
   }
}
