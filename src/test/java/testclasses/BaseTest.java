
package testclasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.BuyOnlinePlan;
import pages.GetQuote;
import pages.HomePage;

public class BaseTest {
	public static WebDriver driver;
	public BuyOnlinePlan buyonline;
	public HomePage hp;
	public GetQuote gq;
	
	@BeforeSuite
	public void initDriver() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--start-maximized");
		option.addArguments("--disable-notifications");
		//option.addArguments("--incognito");
		//option.addArguments("--headless");

		 driver = new ChromeDriver(option);
		
	//	driver.manage().window().maximize();
		
        Properties prop = new Properties();
		
		String path = System.getProperty("user.dir")+"\\config.properties";
		
		FileInputStream fis = new FileInputStream(path);
		
		prop.load(fis);
		
		String url = prop.getProperty("testsiteurl");
		
		driver.get(url);
	}
	
		@BeforeClass
		public void createObject() throws IOException
		{
			// buyonline = new BuyOnlinePlan(driver);
			 
			 hp=new HomePage(driver);
			 
			 gq = new GetQuote(driver);
		}
		
	}


