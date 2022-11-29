package testngdiscus;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReporterClass {

	@Test
	public void tc1()
	{
		System.out.println("testcase 1");
		Reporter.log("This is Test case 1", true);
	}
}
