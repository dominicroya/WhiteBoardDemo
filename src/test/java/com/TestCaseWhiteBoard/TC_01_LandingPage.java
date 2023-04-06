package com.TestCaseWhiteBoard;

import org.testng.annotations.Test;

import com.POMWhiteBoard.LandingPagePOM;

public class TC_01_LandingPage extends BaseClass {	
	
	@Test(priority=1)
	public void getToCanvas() throws InterruptedException {
		System.out.println("getocanvas started");
		LandingPagePOM lp=new LandingPagePOM(driver);
		lp.popupNo();		
		lp.collaborateOption();
		Thread.sleep(20000);
		//lp.simpleClick();
		lp.skipforGood();
		System.out.println("geto canvas  Done");	
	}
	
	
}
