package com.TestCaseWhiteBoard;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.POMWhiteBoard.LandingPagePOM;
import com.UtilitiesWhiteBoard.LoggerLoad;
import com.UtilitiesWhiteBoard.ReadConfig;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BaseClass {

	public WebDriver driver;
	ReadConfig readconfig= new ReadConfig();
	public static ExtentReports extentReport;
	public static ExtentSparkReporter report;
	public static ExtentTest test;
	//TakesScreenshot screenShot= (TakesScreenshot) driver;
	//File sourceFile=screenShot.getScreenshotAs(OutputType.FILE);
	//File destinationFile= new File("Sample.png");
	//FileHandler.copy ( sourceFile,destinationFile);
	
	 @BeforeSuite
	    public void ExtentReport()
	    {
		 	report = new ExtentSparkReporter("./Extent-reports/ExtentReportWBD.html");
		 	extentReport = new ExtentReports();
		 	extentReport.attachReporter(report);
	         
		 	extentReport.setSystemInfo("OS", "Edge");
		 	extentReport.setSystemInfo("Environment", "QA");
		 	
	         
	        
	        report.config().setDocumentTitle("Test Execution Report");
	        report.config().setReportName("WhiteBoardDemo");
	        report.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
	        report.config().setTheme(Theme.STANDARD);
	    }
	     
	
	@Parameters("browser")
	@BeforeClass
	public void SetUp(String browser) throws InterruptedException {	
		//extentReport= new ExtentReports();
		//report=new ExtentSparkReporter("./Extent-reports/ExtentReportWBD.html");
		//extentReport.attachReporter(report);
		/*System.setProperty("webdriver.chrome.driver",readconfig.getChromepath());
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");		
		ChromeDriver driver = new ChromeDriver(options);
		this.driver=driver;
		driver =new ChromeDriver();*/
		if(browser.equalsIgnoreCase("chrome")) {
			//Initialize the chrome driver
			System.setProperty("webdriver.chrome.driver",readconfig.getChromepath());
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");	
			driver = new ChromeDriver(options);
		}
		else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",readconfig.getedgepath());
			driver = new EdgeDriver();
		} 
		
		driver.manage().window().maximize();
		driver.get(readconfig.getApplicationURL());
		LoggerLoad.info("Broswer is opened");
		LoggerLoad.info("Verified that the user landed on Home Page.");
		System.out.println("Goto Main canvas started");
		LoggerLoad.info("Goto Main Canvas Started");
		LandingPagePOM lp=new LandingPagePOM(driver);
		Thread.sleep(2000);
		lp.popupNo();		
		lp.collaborateOption();
		Thread.sleep(20000);
		lp.skipforGood();
		LoggerLoad.info("Main Canvas Landed Successful");	
	}


	@AfterMethod
	public void screenShot(ITestResult result){
		if(ITestResult.FAILURE==result.getStatus()){
			try{
				TakesScreenshot screenshot=(TakesScreenshot)driver;
				File src=screenshot.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src, new File("./Screenshots\\"+result.getName()+".png"));
				System.out.println("Successfully captured a screenshot");
				driver.navigate().refresh();
			}catch (Exception e){
				System.out.println("Exception while taking screenshot "+e.getMessage());
			}
		}
	}
	/*public void screenShot(ITestResult result){
		if(ITestResult.FAILURE==result.getStatus()){
			try{
				System.out.println("------------"+result.getStatus());
				TakesScreenshot screenshot=(TakesScreenshot)driver;
				File src=screenshot.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src, new File("./Screenshots\\"+result.getName()+".png"));
				test.addScreenCaptureFromPath("./Screenshots\\"+result.getName()+".png");
				test.log(Status.INFO, "Successfully captured a screenshot");
				LoggerLoad.info("Successfully captured a screenshot");
				test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" Test case FAILED due to below issues:", ExtentColor.RED));
				driver.navigate().refresh();
			}catch (Exception e){
				System.out.println("Exception while taking screenshot "+e.getMessage());
			}
		}
		else if(result.getStatus() == ITestResult.SUCCESS)
		{
			System.out.println("------------"+result.getStatus());
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" Test Case PASSED", ExtentColor.GREEN));
		}
		else
		{
			test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" Test Case SKIPPED", ExtentColor.ORANGE));
			test.skip(result.getThrowable());
		}
		extentReport.flush();
	}*/

	@AfterClass
	public void tearDown() {
		driver.quit();
		extentReport.flush();
	}



}