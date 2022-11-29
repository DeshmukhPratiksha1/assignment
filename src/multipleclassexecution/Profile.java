package multipleclassexecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Profile {

	@Test()
	public void logout()
	{
		
		Reporter.log("log out test case", true);
	}

}
