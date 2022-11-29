package testngdiscus;

import org.testng.annotations.Test;

public class SequenceTestCase {
	
	@Test(priority=1)
	public void login()
	{
		System.out.println("login to page");
	}
	
	@Test(priority=2)
	public void home()
	{
		System.out.println("home to page");
	}
	
	
	@Test(priority=3)
	public void dashboard()
	{
		System.out.println("dashboard to page");
	}
	
	@Test(priority=4)
	public void profile()
	{
		System.out.println("profile to page");
	}
	
}
