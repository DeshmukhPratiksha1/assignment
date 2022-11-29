package testngdiscus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MoMukulProgS {
	
	@Parameters("browser")
	@Test
	public void crossChrome(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
	
	}
		else if(browser.equalsIgnoreCase("edge"))
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\user\\Downloads\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://web.whatsapp.com/");
	}
	}
}
	

