package testngdiscus;

import org.testng.annotations.Test;

public class DependsOnMethod2 {

	@Test(priority=5, dependsOnMethods="testngdiscus.DependsOnMethod.dashBoard")
	public void mySelf()
	{
		System.out.println("My information");
	}
	
	@Test(priority=6)
	public void chechBox()
	{
		System.out.println("check Box");
	}
}
