package testngdiscus;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationInTestng2 
{
	
	@AfterTest
	public void test2()
	{
		System.out.println("after test2");
	}
	@BeforeClass
	public void beforeClass2()
	{
		System.out.println("before class");
	}
	
	@AfterClass
	public void afterClass2()
	{
		System.out.println("after class");
	}
	
	@Test
	public void testCase2()
	{
	System.out.println("test case2");	
	}

}
