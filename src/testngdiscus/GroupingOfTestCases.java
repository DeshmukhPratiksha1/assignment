package testngdiscus;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupingOfTestCases {
	
	@BeforeGroups({"sanity","Regression"})
	public void beforeGroup()
	{
		System.out.println("sanity and regression before group ");
	}
	
	@AfterGroups("Regression")
	public void afterGroup()
	{
		System.out.println("regression before group ");
	}
	
	
	@Test(priority=1, groups="sanity")
	public void login()
	{
		System.out.println("login to application");
		throw new NullPointerException();
	}
	
	@Test(priority=2,groups={"functionality","sanity"})
	public void dashBoard()
	{
		System.out.println("dashboard");
	}
	

	@Test(priority=3, groups="Regression")
	public void profile()
	{
		System.out.println("profile");
	}
	
	@Test(priority=4, alwaysRun=true)
	public void logout()
	{
		System.out.println("logout");
	}
	

}
