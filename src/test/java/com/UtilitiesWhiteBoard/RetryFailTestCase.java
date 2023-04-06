package com.UtilitiesWhiteBoard;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailTestCase implements IRetryAnalyzer {

	private int retryCount = 0;

	//Max number of times you want to re-execute a test case
	private static final int maxRetryCount = 0;


	public boolean retry(ITestResult result) {
		if (retryCount < maxRetryCount) {
			System.out.println("Retrying test " + result.getName() + " with status "
					+ getResultStatus(result.getStatus()) + " for " + (retryCount+1) + " time(s).");
			retryCount++;
			return true;
		}
		return false;

	}

	//Get the result status
	public String getResultStatus(int status) {
		String result = null;
		if(status==1)
			result = "SUCCESS";
		if(status==2)
			result = "FAILURE";
		if(status==3)
			result = "SKIP";
		return result;
	}

}
