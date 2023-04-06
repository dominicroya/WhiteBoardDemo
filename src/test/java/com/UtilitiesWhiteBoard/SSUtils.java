package com.UtilitiesWhiteBoard;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.TestCaseWhiteBoard.BaseClass;


public class SSUtils extends BaseClass{
	public static int testCaseID;
	WebDriver driver;

	@Test
	public static void captureScreenshot(WebDriver driver, int testCaseID)
	{
		try
		{
			TakesScreenshot ts=(TakesScreenshot)driver;
			File scr=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scr,new File ("./Screenshots/"+".png"));
		}
		catch(Exception e)
		{
			System.out.println("Exception while taking screenshot : "+e.getMessage());
		}
	}

}
