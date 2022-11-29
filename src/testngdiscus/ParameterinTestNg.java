package testngdiscus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParameterinTestNg {
	
	@Test
	public void launchurl(String url)
	{
		
        System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();// maximize the window of the browser
		
		if(url.contains("facebook"))
		{
           driver.get(url);		
	     }
		else
	   {
		driver.get("https://www.facebook.com/signup");
	   }
	}
}
