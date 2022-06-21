package extentlistners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import testclasses.BaseTest;
import utility.SceenShot;

public class Listners extends BaseTest implements ITestListener {
	
	ExtentReports extent = ExtentReportGen.extentReportGenerator();

	public static ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {
	System.out.println("test case started: "+result.getMethod());
	 test = extent.createTest(result.getName());

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("test case success: "+result.getName());
		test.log(Status.PASS, "Test case is passed");

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test case fail: "+result.getName());
		
		test.fail(result.getThrowable());
		
		try {
			SceenShot.captureScreenShot(driver,result.getName());
			test.addScreenCaptureFromPath(SceenShot.captureScreenShot(driver, result.getName()));

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
        extent.flush();
	}
	

}
