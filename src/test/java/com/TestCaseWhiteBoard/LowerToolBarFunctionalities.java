package com.TestCaseWhiteBoard;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.POMWhiteBoard.DrawingToolsPom;
import com.POMWhiteBoard.LoginPOM;
import com.POMWhiteBoard.LowerToolBarPOM;
import com.POMWhiteBoard.TopToolBarPOM;
import com.aventstack.extentreports.Status;

public class LowerToolBarFunctionalities extends BaseClass{
	
	@Test(priority=20)
	public void Login() throws InterruptedException {
		test=extentReport.createTest("TC_20_Login");  
		test.log(Status.INFO, "Login Started");
		System.out.println("Login Started");
		LoginPOM lp = new LoginPOM(driver);
		lp.Settings();
		Thread.sleep(5000);

		lp.enterEmail();
		Thread.sleep(2000);
		lp.enterPassword();
		Thread.sleep(2000);
		lp.sigIn();
		Thread.sleep(10000);
		System.out.println("Logged in Successfull");
		Thread.sleep(10000);
		lp.RemovePopUP();
		
		Thread.sleep(10000);
		lp.remindMeAgain();
		Thread.sleep(5000);
		System.out.println("Login Success");
	}
	@Test(priority=21)
	public void PageNation() throws InterruptedException{
		test=extentReport.createTest("TC_21_PageNation");  
		test.log(Status.INFO, "Changing the pages of the Board name Started");
		System.out.println("Changing the pages of the Board name Started");
		DrawingToolsPom dt=new DrawingToolsPom(driver);
		System.out.println("Shape Triangle started");
		dt.drawingBtnClick();
		dt.shapesClick();
		dt.triangleClick();
		dt.sendAngles();
		dt.trianglePositioning();
		Thread.sleep(3000);
		
		LowerToolBarPOM ltb = new LowerToolBarPOM(driver);
		System.out.println("Click on next page");
		ltb.nextPageClick();
		Thread.sleep(3000);

		System.out.println("Free hand drawing started");
		Thread.sleep(3000);
		dt.drawingBtnClick();
		Thread.sleep(3000);
		dt.drawingPenClick();
		Thread.sleep(3000);
		dt.canvasClick();
		dt.clickAndHold();
		Thread.sleep(3000);
		System.out.println("Free Hand Draw successful");		
		Thread.sleep(3000);
		System.out.println("Click on next page");
		ltb.nextPageClick();
		Thread.sleep(3000);

		System.out.println("ClickNType Started");
		dt.writeClick();
		Thread.sleep(3000);
		dt.clickType();
		Thread.sleep(3000);
		dt.clickAndType();	
		System.out.println("ClickNType Success");

		System.out.println("Click back to previous page");
		ltb.previousPageClick();
		Thread.sleep(3000);

		System.out.println("Click back to previous Page");
		ltb.previousPageClick();
		Thread.sleep(3000);

		System.out.println("Click on Thumbnail");
		ltb.thumbNailClick();
		Thread.sleep(3000);
		System.out.println("Changing the pages of the Board name Success");
	}
	@Test(priority=22)
	public void RenameBoard() throws InterruptedException{
		test=extentReport.createTest("TC_22_RenameBoard");  
		test.log(Status.INFO, "Re-nameing the Board name Started");
		System.out.println("Re-nameing the Board name Started");
		TopToolBarPOM t1 = new TopToolBarPOM(driver);
		t1.singleBoardName();
		LoginPOM lp = new LoginPOM(driver);
		System.out.println("Click on Save button");
		//LoginPOM l3 = new LoginPOM(driver);
		lp.Settings();
		Thread.sleep(3000);
		lp.SaveName();
		driver.navigate().refresh();
		Thread.sleep(5000);
		LowerToolBarPOM ltb = new LowerToolBarPOM(driver);
		System.out.println("Click on manage boards");
		ltb.manageBoardsClick();
		Thread.sleep(5000);
		ltb.viewBoardClick();
		System.out.println("Re-nameing the Board name Success");

	}
	
	@Test(priority=19)
	//@Test(enabled=false)
	public void InvalidUser() throws InterruptedException,AssertionError{
		test=extentReport.createTest("TC_19_InvalidUser");  
		test.log(Status.INFO, "Logging in with Invalid Credentials");
		LoginPOM l1 = new LoginPOM(driver);
		l1.Settings();
		Thread.sleep(3000);
		l1.enterInvalidEmail();
		l1.enterInvalidPassword();
		l1.sigIn();	
		test.log(Status.INFO, "Current Mode:"+l1.getToastMessage());
		Thread.sleep(2000); ////div[contains(text(),'User does not exist.')]
		l1.closeBtnClick();
		/*if(l1.getToastMessage().equals("Loggedin successfully")) {
			test.log(Status.PASS, "Successfully Logged In");
		}else if(l1.getToastMessage().equals("User does not exist.")){
			test.log(Status.FAIL, "User does not exist.");	
		}*/
		String ExpError="Logged in Succesfull";
		String ActError=l1.getToastMessage();
		Assert.assertEquals(ExpError, ActError);
		System.out.println("invalid done");
		//Assert.assertEquals("User does not exist.", ActError);
		
	}
		
	

}
