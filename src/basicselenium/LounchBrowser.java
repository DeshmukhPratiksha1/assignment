package basicselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LounchBrowser {
	public static void main(String[] args)
	{
		WebDriver d;
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe" );
		
		ChromeDriver driver = new ChromeDriver();
		ChromeDriver driver1 = new ChromeDriver();
		
		String browsername = "Chrome";
		
		RemoteWebDriver driver2 = new ChromeDriver();
		
		WebDriver driver3 = new ChromeDriver();
		
		
		FirefoxDriver driver4= new FirefoxDriver();
		
		if(browsername.equals("Chrome"))
				{
			d=new ChromeDriver();
				}
		else if(browsername.equals("firefox"))
		{
			d= new FirefoxDriver();
		}
			
		
		
		
	}
	}


