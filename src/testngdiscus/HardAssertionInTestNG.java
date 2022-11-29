package testngdiscus;

import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionInTestNG {

	@Test
	public void testCase1()
	{
		System.out.println("first line");
		
		System.out.println("second line");
		
		int i=10;
		int j=20;
		
		boolean value = i>j;
		Assert.assertTrue(value);
		System.out.println("third line");
		System.out.println("fourth line");
}
	
	@Test
	public void testCase2()
	{
		System.out.println("fifth line");
		
		System.out.println("sixth line");
		
		int i=10;
		int j=20;
		
		boolean value = i<j;
		
		Assert.assertTrue(true);//condition match
		
		System.out.println("seventh line");
		System.out.println("eight line");
		
		Assert.assertTrue(value);//fail
}
	
	//@Test(enabled =false)when we have not executed test case
	public void verifyMessage()
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
	 
	 String expecres = "Invalid credentials";//assertion fail test case mark as fail 
	 
	 Assert.assertEquals(actualres, expecres);
	 
	 System.out.println("Test msg comparision then executed");
	}
	
	@Test
	public void testCase4()
	{
		Assert.fail("test case fail deliberately");
	}
}
