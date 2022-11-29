package testngdiscus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTestExec1 {
	
	@Test
	public void facebbok()
	{
		   System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
				
			driver.manage().window().maximize();// maximize the window of the browser
				
			driver.get("https://www.facebook.com/signup");
		
	}
	
	@Test
	public void google()
	{
		   System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
				
			driver.manage().window().maximize();// maximize the window of the browser
				
			driver.get("https://www.google.com");
		
	}
	
	

}
