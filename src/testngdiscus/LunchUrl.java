package testngdiscus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class LunchUrl {
	@org.testng.annotations.Parameters("ulrlounch")
	@Test
	public void launchUrl(String url)
	{
		System.setProperty("webdriver.chrome.driver",
				"G:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		if(url.contains("facebook"))
		{
			driver.get(url);
		}
		else 
		{
			driver.get("https://www.google.com");
		}
		
	}
	
	  @org.testng.annotations.Parameters({"environment","version"})
	  
	  //@Parameters({"environment", "version"})
	  
	  @Test
	  public void buildInfo(String env, String version)
	  {
	  System.out.println("Environment used is "+env);
	  
	  System.out.println("Build version is "+version);
	  
	  }
	 
}



