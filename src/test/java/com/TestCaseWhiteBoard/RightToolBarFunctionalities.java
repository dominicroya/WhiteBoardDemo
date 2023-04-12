package com.TestCaseWhiteBoard;

import org.testng.annotations.Test;

import com.POMWhiteBoard.RightToolBarPOM;
import com.UtilitiesWhiteBoard.LoggerLoad;
import com.aventstack.extentreports.Status;

public class RightToolBarFunctionalities extends BaseClass {
	
	@Test(priority=17)
	public void GizmosTool() throws InterruptedException{
		RightToolBarPOM g1 = new RightToolBarPOM(driver);
		test=extentReport.createTest("TC_17_GizmosTool"); 
		test.assignCategory("Right Tool Bar");
		System.out.println("Gizmos Started");
		LoggerLoad.info("Gizmos Started");
		test.log(Status.INFO, "Gizmos Started");
		g1.ClickOnGizmos();
		Thread.sleep(3000);
		g1.ClickOnGizmosDropdown();
		g1.ScrollUp();
		Thread.sleep(3000);
		g1.SelectEnglish();
		Thread.sleep(3000);
		g1.SelectAlphabetA();
		g1.SelectAlphabetB();
		g1.SelectAlphabetC();
		g1.SelectAlphabetD();
		g1.WidgetClose();
		System.out.println("Alphabets selected successfully");
		LoggerLoad.info("GizmosTool Success");
		test.log(Status.INFO, "GizmosTool Success");
	}
    
	@Test(priority=18)
	public void WidgetYouTube() throws InterruptedException{
		/*System.out.println("Goto Main canvas started");
		LandingPagePOM lp=new LandingPagePOM(driver);
		lp.popupNo();		
		lp.collaborateOption();
		Thread.sleep(20000);
		//lp.simpleClick();
		lp.skipforGood();
		System.out.println("Canvas Launched Successful");*/
		test=extentReport.createTest("TC_18_WidgetYouTube");  
		test.assignCategory("Right Tool Bar");
		System.out.println("YouTube widgets Started");
		LoggerLoad.info("YouTube widgets Started");
		test.log(Status.INFO, "YouTube widgets Started");
		System.out.println("YouTube widgets Started");
		RightToolBarPOM w1 = new RightToolBarPOM(driver);
		w1.ClickOnWidgets();
		Thread.sleep(3000);
		w1.ScrollDown();
		Thread.sleep(3000);
		w1.ClickOnYouTube();
		Thread.sleep(3000);
		w1.EnterURL();
		w1.ClickOnLoadVideoButton();
		Thread.sleep(8000);
		w1.ClickOnPlay();
		Thread.sleep(15000);
//		w1.CloseYouTube();
		System.out.println("YouTube widgets success");
		LoggerLoad.info("YouTube widgets success");
		test.log(Status.INFO, "YouTube widgets success");
	}

}
