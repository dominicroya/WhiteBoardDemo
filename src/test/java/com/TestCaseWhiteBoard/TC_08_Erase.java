package com.TestCaseWhiteBoard;

import com.POMWhiteBoard.DrawingToolsPom;

public class TC_08_Erase extends BaseClass {
	
	public void WhiteOut() throws InterruptedException{
		DrawingToolsPom dt=new DrawingToolsPom(driver);
		System.out.println("Erase the Object using whiteout");
		dt.eraserBtnClick();
		//dt.objEraserClick();
		dt.whiteOutClick();
		dt.moveEraser();
		System.out.println("Object erased success");
		
	}

}
