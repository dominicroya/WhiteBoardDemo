package com.TestCaseWhiteBoard;

import com.POMWhiteBoard.DrawingToolsPom;

public class TC_05_ClickAndType extends BaseClass{
	
	public void Click_Type() throws InterruptedException {
		DrawingToolsPom dt=new DrawingToolsPom(driver);
		System.out.println("ClickNType Started");
		dt.writeClick();
		Thread.sleep(3000);
		dt.clickType();
		Thread.sleep(3000);
		dt.clickAndType();	
		System.out.println("ClickNType Success");
	}

}
