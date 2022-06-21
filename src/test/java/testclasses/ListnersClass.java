package testclasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utility.SceenShot;

public class ListnersClass extends BaseTest implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
	System.out.println("test case started: "+result.getMethod());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("test case success: "+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test case fail: "+result.getName());
		
		try {
			SceenShot.captureScreenShot(driver,result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("test case skipped: "+result.getName());

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}

	@Override
	public void onStart(ITestContext context) {
		
		System.out.println("test tag start: "+context.getName());

	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("test tag fail: "+context.getName());

	}
	


}
