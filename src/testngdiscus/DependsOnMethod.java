package testngdiscus;

import org.testng.annotations.Test;

public class DependsOnMethod {

	@Test(priority=1)
	public void login()
	{
		System.out.println("login to application");
		throw new NullPointerException();
	}
	
	@Test(priority=2, dependsOnMethods= "login", alwaysRun=true)
	public void dashBoard()
	{
		System.out.println("dashboard");
	}
	

	@Test
	public void profile()
	{
		System.out.println("profile");
	}
	
	@Test(priority=3, dependsOnMethods= {"dashBoard","profile"})
	public void logout()
	{
		System.out.println("logout");
	}
	
	
	
}
