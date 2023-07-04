package com.TestCaseWhiteBoard;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.POMWhiteBoard.DrawingToolsPom;
import com.POMWhiteBoard.TopToolBarPOM;
import com.POMWhiteBoard.UploadPOM;
import com.UtilitiesWhiteBoard.LoggerLoad;
import com.aventstack.extentreports.Status;

public class TopToolBarFunctionalities extends BaseClass {
//Hello 1234
	@Test(priority=10)
	public void Lesson() throws InterruptedException{
		test=extentReport.createTest("TC_10_Lesson");  
		test.assignCategory("Top Tool Bar");
		test.log(Status.INFO, "Instuctor Lesson Started");
		LoggerLoad.info("Instuctor Lesson Started");
		DrawingToolsPom dt=new DrawingToolsPom(driver);	
		dt.drawingBtnClick();
		Thread.sleep(2000);
		dt.shapesClick();
		Thread.sleep(2000);
		dt.polygonClick();
		Thread.sleep(2000);
		dt.sendSides();
		Thread.sleep(2000);
		dt.polygonPositioning();
		Thread.sleep(2000);
		dt.polygonLesson();
		LoggerLoad.info("Shape Polygon Success");
		dt.drawingBtnClick();
		Thread.sleep(2000);
		dt.shapesClick();
		Thread.sleep(2000);
		dt.triangleClick();
		Thread.sleep(2000);
		dt.sendAngles();
		//Thread.sleep(2000);
		dt.trianglePositioning();
		Thread.sleep(2000);
		dt.triangleLesson();
		LoggerLoad.info("Shape Triangle Success");
		LoggerLoad.info("Instuctor Lesson Success");
		
	}
	
	@Test(priority=11)
	public void StudentDemo() throws InterruptedException{
		test=extentReport.createTest("TC_11_StudentDemo");  
		test.assignCategory("Top Tool Bar");
		test.log(Status.INFO, "StudentDemo Started");
		LoggerLoad.info("StudentDemo Started");
		TopToolBarPOM Top_toolbar_obj = new TopToolBarPOM(driver);		
		Top_toolbar_obj.student();
		Thread.sleep(3000);
		Top_toolbar_obj.participants_panel();
		LoggerLoad.info("StudentDemo Success");
		
	}

	@Test(priority=12)
	public void MyBoardDownload() throws InterruptedException{
		test=extentReport.createTest("TC_12_MyBoardDownload"); 
		test.assignCategory("Top Tool Bar");
		test.log(Status.INFO, "MyBoard Download Started");
		LoggerLoad.info("MyBoard Download Started");
		TopToolBarPOM Top_toolbar_obj = new TopToolBarPOM(driver);
		Thread.sleep(5000);
		Top_toolbar_obj.DownloadPDF();
		Thread.sleep(5000);
		LoggerLoad.info("MyBoardDownload Success");
		test.log(Status.INFO, "MyBoardDownload Success");

	}

	@Test(priority=13)
	public void MyBoardUpload() throws InterruptedException, AWTException{
		test=extentReport.createTest("TC_13_MyBoardUpload"); 
		test.assignCategory("Top Tool Bar");
		LoggerLoad.info("Upload a file Started");
		test.log(Status.INFO, "Upload a file Started");
		UploadPOM upload_obj = new UploadPOM(driver);
		TopToolBarPOM Top_toolbar_obj = new TopToolBarPOM(driver);
		Thread.sleep(5000);
		upload_obj.uploadClick();
		Thread.sleep(3000);
		upload_obj.uploadSubClick();
		Thread.sleep(3000);
		String path= readconfig.getdownloaded_FilePath();
		upload_obj.SelectFile(path);
		LoggerLoad.info("File Upload Success");
		test.log(Status.INFO, "File Upload Success");
		Top_toolbar_obj.delete_operation();
		Thread.sleep(3000);

	}

	@Test(priority=14)
	public void UndoRedoZoom() throws InterruptedException {
		test=extentReport.createTest("TC_14_UndoRedoZoom"); 
		test.assignCategory("Top Tool Bar");
		LoggerLoad.info("Undo Redo Zoom Started");
		test.log(Status.INFO, "Undo Redo Zoom Started");
		DrawingToolsPom dt=new DrawingToolsPom(driver);	
		TopToolBarPOM Top_toolbar_obj = new TopToolBarPOM(driver);
		Top_toolbar_obj.delete_operation();
		Thread.sleep(3000);
		dt.writeClick();
		Thread.sleep(3000);
		dt.clickType();
		Thread.sleep(3000);
		dt.canvasClick();
		dt.clickAndType1();
		Top_toolbar_obj.undo_operation();
		Thread.sleep(3000);
		Top_toolbar_obj.undo_operation();
		Thread.sleep(3000);
		Top_toolbar_obj.redo_operation();
		Thread.sleep(3000);
		Top_toolbar_obj.redo_operation();
		Thread.sleep(3000);
		Top_toolbar_obj.zoomin_operation();
		Thread.sleep(3000);
		Top_toolbar_obj.zoomoff_operation();
		Thread.sleep(3000);
		Top_toolbar_obj.zoomoff_operation();
		Thread.sleep(3000);
		Top_toolbar_obj.zoom_reset_opertaion();
		Thread.sleep(2000);
		Top_toolbar_obj.delete_operation();
		Thread.sleep(3000);
		LoggerLoad.info("UNDO REDO ZOOM Success");
		test.log(Status.INFO, "UNDO REDO ZOOM Success");
	}


	/*@Test(priority=15)
	public void LanguageChange() throws InterruptedException{
		test=extentReport.createTest("TC_15_LanguageChange");
		test.assignCategory("Top Tool Bar");
		TopToolBarPOM Top_toolbar_obj = new TopToolBarPOM(driver);
		LoggerLoad.info("LanguageChange Started");
		test.log(Status.INFO, "LanguageChange Started");
		DrawingToolsPom dt=new DrawingToolsPom(driver);	
		//Language change from English to Arabic
		dt.hamburgerClick();
		Top_toolbar_obj.Language();
		Thread.sleep(3000);
		//Language back to English
		Top_toolbar_obj.English();
		Thread.sleep(3000);
		//dt.closehamburgerClick();
		LoggerLoad.info("LanguageChange Success");
		test.log(Status.INFO, "LanguageChange Success");

	}

	@Test(priority=16)
	public void ColourPenThickness() throws InterruptedException{
		test=extentReport.createTest("TC_16_ColourPenThickness");  
		test.assignCategory("Top Tool Bar");
		LoggerLoad.info("Colour_PenThickness Started");
		test.log(Status.INFO, "Colour_PenThickness Started");
		//Changing Thickness
		DrawingToolsPom dt=new DrawingToolsPom(driver);	
		TopToolBarPOM Top_toolbar_obj = new TopToolBarPOM(driver);
		Thread.sleep(3000);
		dt.drawingBtnClick();
		Thread.sleep(3000);
		dt.drawingPenClick();
		dt.canvasClick();
		dt.clickAndHold2();
		Thread.sleep(3000);
		Top_toolbar_obj.pen_thickness_operation();
		Thread.sleep(3000);
		dt.clickAndHold2();
		Thread.sleep(3000);
		Top_toolbar_obj.delete_operation();
		//ChangingColor
		Top_toolbar_obj.colour_operation();
		dt.clickAndHold2();
		Thread.sleep(3000);
		Top_toolbar_obj.delete_operation();
		Thread.sleep(3000);
		LoggerLoad.info("Colour_PenThickness Success");
		test.log(Status.INFO, "Colour_PenThickness Success");

	}*/


}
