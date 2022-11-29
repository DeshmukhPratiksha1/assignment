package testngdiscus;

import org.testng.annotations.Test;

public class InvocationCountCase {
	
	@Test(invocationCount= 5, priority= -1, timeOut=1)
	public void login() throws InterruptedException
	{
		System.out.println("login test case");
	}
	
	@Test
	public void dashboard()
	{
		System.out.println("dashboard test case");

	}


}
