package testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import extentlistners.Listners;

public class GetQuoteTest extends Listners{
	
	
	@Test(priority=3)
	public void titleValidation()
	{
		boolean returnval = gq.verifyTitle();
		
		Assert.assertEquals(returnval, true);
	}
	
	@Test(priority=4)
	public void submit() throws InterruptedException
	{
		gq.enterData();
		gq.submitData();
	}
}
