

package testngdiscus;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class MoUmesh {
	
	@BeforeSuite
	public void navUrl()
	{
		System.out.println("hit url");
	}
	
	@BeforeClass
	public void loginApll()
	{
		System.out.println("login aplication");
	}
	@AfterClass
	public void logoutApll()
	{
		System.out.println("logout aplication");
	}
	@BeforeMethod
	public void navToTestCase()
	{
		System.out.println("nav to test case");
	}
	@AfterMethod
	public void navToOriginal()
	{
		System.out.println("nav to test original");
	}
	
	@Test
	public void testCase1()
	{
		System.out.println("test case1 ");
	}
	 @Test
	 public void testCase2()
	 {
		 System.out.println("test case2");
	 }

}
