package com.UtilitiesWhiteBoard;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
	static ExtentSparkReporter reporter;
	static ExtentReports extentReports; 
	ExtentTest test;
	
	
	public synchronized static ExtentReports createExtentReports() {
		
		reporter = new ExtentSparkReporter("./Extent-reports/ExtentReportWBD.html");
		extentReports= new ExtentReports();
		extentReports.attachReporter(reporter);
		//Add Environment Details
		extentReports.setSystemInfo("OS", "Windows");
		extentReports.setSystemInfo("Browser", "Chrome");
		//Configuration to change the look and feel
		reporter.config().setDocumentTitle("Demo Extent Report");
		reporter.config().setReportName("Test Report");
		reporter.config().setTheme(Theme.STANDARD);
		reporter.config().setTimeStampFormat("EEEE,MMMM dd, yyyy, hh:mm a '('zzz ')'");
		
		return extentReports;
	}

}
