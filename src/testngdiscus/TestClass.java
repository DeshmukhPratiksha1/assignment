package testngdiscus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass {
	
	@Test
	public void firstTestCase()
	{

		   System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
			
		//	driver.findElement(By.xpath("jhgrrth"));//just chech for fail test case
	}
	
	@Test
	public void secondTestCase()
	{
		System.out.println("second test case");
	}

}
