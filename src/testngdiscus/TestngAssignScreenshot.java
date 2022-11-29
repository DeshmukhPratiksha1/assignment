package testngdiscus;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import utility.SceenShot;

public class TestngAssignScreenshot {
	
	@Test
	public void screenShotTestNG() throws IOException
	{
		
		  System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();// maximize the window of the browser
			
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
			
			//xpath
			
		    WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		    
		    username.sendKeys("Admin");
		    
		    driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin1232");//wrong pass pass bcz i want loginpanel text print
		    
		    driver.findElement(By.xpath("//input[@type='submit']")).click();
		    
		 String actualres = driver.findElement(By.xpath("//*[@id='spanMessage']")).getText();
		 
		 String expecres = "Invalidd credentials";
		try {
		 Assert.assertEquals(actualres, expecres);
		 }
		 catch(AssertionError ae)
		 {
			 SceenShot.captureScreenShot(driver, "screen2");
		}
		 
		 System.out.println("Test msg comparision then executed");
		
	}

}
