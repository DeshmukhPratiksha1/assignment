package testngdiscus;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationTestng {

	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before suit");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("after suit");
	}
	
	@BeforeTest
	public void test1()
	{
		System.out.println("before test1");
	}
	
	@AfterTest
	public void test2()
	{
		System.out.println("after test2");
	}
	
	@Test
	public void testCase1()
	{
		System.out.println("Test Case 1");
	}
	
	@Test
	public void testCase2()
	{
		System.out.println("Test Case 2");
	}
	
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before method");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after method");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before class");
	}
	
	@AfterClass
	
	public void afterClass()
	{
		System.out.println("after class");
	}
	
	
}
