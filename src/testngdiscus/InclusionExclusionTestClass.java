package testngdiscus;

import org.testng.annotations.Test;

public class InclusionExclusionTestClass {


	@Test(priority=1)
	public void login()
	{
		System.out.println("login to application");
		throw new NullPointerException();
	}
	
	@Test(priority=2)
	public void dashBoard()
	{
		System.out.println("dashboard");
	}
	

	@Test(priority=3)
	public void profile()
	{
		System.out.println("profile");
	}
	
	@Test(priority=4)
	public void logout()
	{
		System.out.println("logout");
	}
	
}
