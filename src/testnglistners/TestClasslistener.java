package testnglistners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClasslistener {
	static WebDriver driver;
	@Test
	public void loginWithIncorrectCred()
	{
	    System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		
			 driver = new ChromeDriver();
			
			driver.manage().window().maximize();// maximize the window of the browser
			
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
			
			//xpath
			
		    WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		    
		    username.sendKeys("Admin");
		    
		    driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin1232");//wrong pass pass bcz i want loginpanel text print
		    
		    driver.findElement(By.xpath("//input[@type='submit']")).click();
		    
		   String urlofpage = driver.getCurrentUrl();
		  boolean actualcon = urlofpage.contains("Dashboard");
		  
		  boolean expectcond = true;
		  
		  Assert.assertEquals(actualcon, expectcond);
		  
		   
	}

}
