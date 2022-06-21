package testclasses;

import org.testng.annotations.Test;

import extentlistners.Listners;

public class HomeTest extends Listners {
	
	@Test(priority=1)
	public void selectInsuranceType()
	{
		test.info("Selecting the insurance");

		hp.selectInsurance("Health");
	}

}
