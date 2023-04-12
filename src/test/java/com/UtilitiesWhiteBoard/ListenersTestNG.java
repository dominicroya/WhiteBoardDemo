package com.UtilitiesWhiteBoard;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.IAnnotationTransformer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.ITestAnnotation;
import com.TestCaseWhiteBoard.BaseClass;

public class ListenersTestNG extends BaseClass implements ITestListener, IAnnotationTransformer {
	public WebDriver driver;
	
	//added
	public String getTestMethodName(ITestResult iTestResult) {
        return iTestResult.getMethod().getConstructorOrMethod().getName();
    }

	public void onStart(ITestContext context) {
		//Log.info("I am in onStart method " + context.getName());
		//context.setAttribute("WebDriver", this.driver);
		System.out.println("onStart method started" + context.getName());
	}

	public void onFinish(ITestContext context) {
		// Log.info("I am in onFinish method " + context.getName());
	     //Do tier down operations for ExtentReports reporting!
	    // ExtentManager.extentReports.flush();
		System.out.println("onFinish method started");
	}

	public void onTestStart(ITestResult result) {
		//Log.info(getTestMethodName(result) + " test is starting.");
		Reporter.log("New Test Started" + result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		 //Log.info(getTestMethodName(result) + " test is succeed.");
	     //ExtentReports log operation for passed tests.
	     //getTest().log(Status.PASS, "Test passed");
		System.out.println("onTestSuccess Method " + result.getName());
	}

	public void onTestFailure(ITestResult result) {
		//Log.info(getTestMethodName(result) + " test is failed.");
		
		System.out.println("onTestFailure Method" + result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		//Log.info(getTestMethodName(result) + " test is skipped.");
		System.out.println("onTestSkipped Method" + result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		//Log.info("Test failed but it is in defined success ratio " + getTestMethodName(result));
		System.out.println("onTestFailedButWithinSuccessPercentage" + result.getName());
	}
	@Override
	public void transform(ITestAnnotation annotation, Class testClass,

			Constructor testConstructor, Method testMethod) {

		annotation.setRetryAnalyzer(RetryFailTestCase.class);
	}

}