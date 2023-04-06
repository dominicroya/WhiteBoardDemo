package com.TestCaseWhiteBoard;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.POMWhiteBoard.DrawingToolsPom;

public class TC_02_FreeHandDraw extends BaseClass {

	Actions act;
	@Test(priority=2)
	public void penDraw() throws InterruptedException{
		DrawingToolsPom dt=new DrawingToolsPom(driver);	
		Thread.sleep(3000);
		dt.drawingBtnClick();
		Thread.sleep(3000);
		dt.drawingPenClick();
		Thread.sleep(3000);
		dt.canvasClick();
		dt.clickAndHold();
	}
}
