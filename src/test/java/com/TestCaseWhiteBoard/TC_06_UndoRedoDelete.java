package com.TestCaseWhiteBoard;

import com.POMWhiteBoard.DrawingToolsPom;
import com.POMWhiteBoard.TopToolBarPOM;

public class TC_06_UndoRedoDelete extends BaseClass {

	public void UndoRedoDelete() throws InterruptedException  {
		System.out.println("UNDO REDO DELETE Started");
		DrawingToolsPom dt=new DrawingToolsPom(driver);	
		Thread.sleep(3000);
		dt.drawingBtnClick();
		Thread.sleep(3000);
		dt.drawingPenClick();
		Thread.sleep(3000);
		dt.canvasClick();
		dt.clickAndHold();
		
		TopToolBarPOM Top_toolbar_obj = new TopToolBarPOM(driver);
		Top_toolbar_obj.undo_operation();
		Top_toolbar_obj.redo_operation();
		Top_toolbar_obj.zoomin_operation();
		Top_toolbar_obj.zoomoff_operation();
		Top_toolbar_obj.zoomoff_operation();
		Top_toolbar_obj.zoom_reset_opertaion();
		Thread.sleep(2000);
		Top_toolbar_obj.zoom_reset_opertaion();
		Top_toolbar_obj.delete_operation();
		Top_toolbar_obj.pen_thickness_operation();
		Top_toolbar_obj.colour_operation();
		Thread.sleep(3000);
		dt.drawingBtnClick();
		Thread.sleep(3000);
		dt.drawingPenClick();
		Thread.sleep(3000);
		dt.canvasClick();
		dt.clickAndHold();
		Thread.sleep(2000);
		System.out.println("Free Hand Draw succesful");
		System.out.println("UNDO REDO DELETE Succes");
		
	}

}


