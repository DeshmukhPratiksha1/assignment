package testclasses;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class onlinePlanVerificationTest extends BaseTest {
	
	@Test(priority=1)
	public void buyOnlinePlan()
	{
		buyonline.selectPlan();
	}
	
	@Test(priority=2)
	public void verifyUrl()
	{
		String actualurl = buyonline.getUrl();
		
		String expecurl = "retirement";
		
		boolean ispresent = actualurl.contains(expecurl);
		
		Assert.assertTrue(ispresent);
		Assert.fail("deliberately fail test case");
	}

}
