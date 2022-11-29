package testngdiscus;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActualAnnotationExample 
{
	
	@BeforeSuite
	public void openBrowser()
	{
		System.out.println("open browser");
	}
	
	@AfterSuite
	public void closeBrowser()
	{
		System.out.println("Quite Browser");
	}
	
	@BeforeTest
	public void navUrl1()
	{
		System.out.println("navigate url 1");
	}
	
	
	@AfterTest
	public void navToOriginalUrl()
	{
		System.out.println("original url");
	}
	
	@BeforeClass
	public void loginToApp()
	{
		System.out.println("login to app");
	}
	
	@AfterClass
	public void logoutToapp()
	{
		System.out.println("log off from application");
	}
	
	@BeforeMethod
	public void navToTestCaseSection()
	{
		System.out.println("navigate to test case");
	}
		
		@AfterMethod
		public void navBackToOriginal()
		{
			System.out.println("back to original");
		}
		
		@Test
		public void testCase()
		{
			System.out.println("test case");
		}
	}


