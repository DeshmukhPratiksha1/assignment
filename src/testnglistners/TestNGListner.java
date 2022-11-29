package testnglistners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGListner {

	@Test
	public void testCase1()
	{
		System.out.println("first line");
		
		System.out.println("second line");

		int i=10;
		int j=20;
		boolean value = i>j;
		
		Assert.assertTrue(value);
		System.out.println("third line");

		System.out.println("fourth line");

	}
	
	@Test
	public void testCase2()
	{
		System.out.println("first line");
		
		System.out.println("second line");
		
		Assert.assertTrue(true);
	
	}
	
	@Test(dependsOnMethods = "testCase1")
	public void testCase3()
	{
		System.out.println("first line");
		
		System.out.println("second line");
		
		Assert.assertTrue(true);
	
	}
}

