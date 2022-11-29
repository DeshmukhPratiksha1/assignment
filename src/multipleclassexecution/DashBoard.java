package multipleclassexecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DashBoard {
	
	@Test()
	public void handlingPopUp()
	{
		System.out.println("pop up handling");
		
		Reporter.log("pop up test case", true);
	}

	@Test()
	public void checkBox()
	{
		System.out.println("check box test case");
		
		Reporter.log("check box test case", true);
	}


}
