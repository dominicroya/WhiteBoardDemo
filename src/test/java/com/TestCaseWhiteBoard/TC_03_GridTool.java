package com.TestCaseWhiteBoard;

import com.POMWhiteBoard.ToolsPOM;

public class TC_03_GridTool extends BaseClass{
	
	
	public void GridTool() throws InterruptedException{
		System.out.println("Get to Grid  Started");
		ToolsPOM t1 = new ToolsPOM(driver);
		t1.ToolsClick();
		Thread.sleep(3000);
		t1.GridOptnClk();
		Thread.sleep(3000);
		t1.BigGridOptnClk();
		Thread.sleep(3000);
		System.out.println("Grid Placed Successful");
	}
	
	public void ClearGrid() throws InterruptedException{

		ToolsPOM t1 = new ToolsPOM(driver);
		Thread.sleep(3000);
		t1.ToolsClick();
		Thread.sleep(3000);
		t1.GridOptnClk();
		Thread.sleep(3000);
		t1.ClearGrid();
		Thread.sleep(3000);
		System.out.println("Grid  Cleared");
	}

}
