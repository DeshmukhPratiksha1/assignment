

package testngdiscus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDisc {
	
	@Test
	public void testCase()
	{
		System.out.println("test case 1");
		
		System.out.println("test case 2");
		
		int i=10;
		int j=20;
		boolean value = i>j;
		
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(value);
		
		System.out.println("test case 3");
		System.out.println("test case 4");

		sa.assertAll();
		}
	
	@Test
	public void verifyMessage1()
	{
        System.setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();// maximize the window of the browser
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		//xpath
		
	    WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
	    
	    username.sendKeys("Admin");
	    
	    driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin1232");//wrong pass pass bcz i want loginpanel text print
	    
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    
	 String actualres = driver.findElement(By.xpath("//*[@id='spanMessage']")).getText();
	 
	 String expecres = "Invalid credentials";//assertion fail test case mark as fail 
	 SoftAssert sa = new SoftAssert();
	 
	 sa.assertEquals(actualres, expecres);
	 
	 System.out.println("Test msg comparision then executed");
	 
	 sa.assertAll();
	}

}
