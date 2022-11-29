package testngdiscus;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import utility.SceenShot;

public class Assignment {
 @Test(priority=1)
 
 public void verifywiki() throws IOException
 {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\chromedriver.exe");
	 
	 WebDriver driver = new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.get("https://en.wikipedia.org/wiki/Pushpa%3A_The_Rise");
	 
		
       JavascriptExecutor js = (JavascriptExecutor)driver;
		 
	  js.executeScript("window.scrollBy(0,800)");

	  WebElement date = driver.findElement(By.xpath("(//*[@class='infobox-label'])[10]"));
	  
	  String actualdate = date.getText();
	  
	  String expectdate = "17nov2018";
	  
	  try 
		  { 
			  
			  Assert.assertEquals(actualdate, expectdate);
		  }
		  
		 catch(AssertionError ae) 
		  { 
			  
			  SceenShot.captureScreenShot(driver, "src222"); 
		  }
		  WebElement country = driver.findElement(By.xpath("(//*[@class='infobox-data'])[12]"));
		  
		     String actualcountry = country.getText();
		  
		     System.out.println(actualcountry);
		  
		
 } 
	 
	
	  @Test(priority=2)
	  public void verifyImdb() throws IOException 
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\chromedriver.exe");
			 
			 WebDriver driver = new ChromeDriver();
			 
			 driver.manage().window().maximize();
			 
			 driver.get("https://www.imdb.com/title/tt9389998/");
			 
				
		       JavascriptExecutor js = (JavascriptExecutor)driver;
				 
			  js.executeScript("window.scrollBy(0,6000)");

			  WebElement date = driver.findElement(By.xpath("(//*[@class='ipc-metadata-list-item__label ipc-metadata-list-item__label--link'])[14]"));
			  
			  String actualdate = date.getText();
			  
			  String expectdate = "17nov2018";
			  
			  try 
				  { 
					  
					  Assert.assertEquals(actualdate, expectdate);
				  }
				  
				 catch(AssertionError ae) 
				  { 
					  
					  SceenShot.captureScreenShot(driver, "src44"); 
				  }
				  WebElement country = driver.findElement(By.xpath("(//*[@class='ipc-inline-list__item'])[52]"));
				  
				     String actualcountry = country.getText();
				  
				     System.out.println(actualcountry);
				  
		  
		  
	  }
}
