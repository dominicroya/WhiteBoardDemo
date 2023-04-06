package com.TestCaseWhiteBoard;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
public class Listeners extends BaseClass implements ITestListener
{
	public void onTestStart(ITestResult result) {}

	public void onTestSuccess(ITestResult result) {}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test failed - Screenshot captured");
	//	failedTC(result.getMethod().getMethodName());
	}

	
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
}
