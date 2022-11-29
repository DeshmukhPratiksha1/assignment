package multipleclassexecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class login {
	
	@Test()
	public void urlLogin()
	{
		System.out.println("TestCase 1");
		
		Reporter.log("Test case 1", true);
	}
	
	@Test()
	public void loginWithCorrectCred()
	{
		System.out.println("TestCase 2");
		
		Reporter.log("Test case 2", true);
	}


}
