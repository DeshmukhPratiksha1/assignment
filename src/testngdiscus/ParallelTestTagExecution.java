package testngdiscus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTestTagExecution {
	@Parameters("url")
	@Test
	public void getUrl(String value)
	{
		  System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
				
			driver.manage().window().maximize();// maximize the window of the browser
				
			driver.get(value);
			
			String fb = driver.getCurrentUrl();
			
			System.out.println(fb);
	}

}
