package com.TestCaseWhiteBoard;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.POMWhiteBoard.DrawingToolsPom;
import com.POMWhiteBoard.TopToolBarPOM;
import com.POMWhiteBoard.UploadPOM;
import com.UtilitiesWhiteBoard.LoggerLoad;
import com.aventstack.extentreports.Status;

public class TopToolBarFunctionalities extends BaseClass {

	@Test(priority=10)
	public void Lesson() throws InterruptedException{
		test=extentReport.createTest("TC_10_Lesson");  
		test.log(Status.INFO, "Instuctor Lesson Started");
		LoggerLoad.info("Instuctor Lesson Started");
		DrawingToolsPom dt=new DrawingToolsPom(driver);	
		dt.drawingBtnClick();
		dt.shapesClick();
		dt.polygonClick();
		Thread.sleep(2000);
		dt.sendSides();
		dt.polygonPositioning();
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
		dt.triangleLesson();
		LoggerLoad.info("Shape Triangle Success");
		LoggerLoad.info("Instuctor Lesson Success");
		
	}
	
	@Test(priority=11)
	public void StudentDemo() throws InterruptedException{
		test=extentReport.createTest("TC_11_StudentDemo");  
		test.log(Status.INFO, "StudentDemo Started");
		LoggerLoad.info("StudentDemo Started");
		TopToolBarPOM Top_toolbar_obj = new TopToolBarPOM(driver);		
		Top_toolbar_obj.student();
		Thread.sleep(2000);
		Top_toolbar_obj.participants_panel();
		LoggerLoad.info("StudentDemo Success");
		
	}

	@Test(priority=12)
	public void MyBoardDownload() throws InterruptedException{
		test=extentReport.createTest("TC_12_MyBoardDownload");  
		System.out.println("MyBoard Download Started");
		test.log(Status.INFO, "MyBoard Download Started");
		LoggerLoad.info("MyBoard Download Started");
		TopToolBarPOM Top_toolbar_obj = new TopToolBarPOM(driver);
		Thread.sleep(3000);
		Top_toolbar_obj.DownloadPDF();
		Thread.sleep(5000);
		System.out.println("MyBoardDownload Success");
		LoggerLoad.info("MyBoardDownload Success");
		test.log(Status.INFO, "MyBoardDownload Success");

	}

	@Test(priority=13)
	public void MyBoardUpload() throws InterruptedException, AWTException{
		test=extentReport.createTest("TC_13_MyBoardUpload");  
		System.out.println("Upload a file Started");
		LoggerLoad.info("Upload a file Started");
		test.log(Status.INFO, "Upload a file Started");
		UploadPOM upload_obj = new UploadPOM(driver);
		TopToolBarPOM Top_toolbar_obj = new TopToolBarPOM(driver);
		Thread.sleep(3000);
		upload_obj.uploadClick();
		System.out.println("Upload menu Clicked");
		
		Thread.sleep(3000);
		upload_obj.uploadSubClick();
		System.out.println("Upload Sub menu Clicked");
		
		Thread.sleep(3000);
		String path= readconfig.getdownloaded_FilePath();
		upload_obj.SelectFile(path);
		System.out.println("File Upload Success");
		LoggerLoad.info("File Upload Success");
		test.log(Status.INFO, "File Upload Success");
		Top_toolbar_obj.delete_operation();
		Thread.sleep(3000);

	}

	@Test(priority=14)
	public void UndoRedoZoom() throws InterruptedException {
		test=extentReport.createTest("TC_14_UndoRedoZoom");  
		System.out.println("Undo Redo Zoom Started");
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
		System.out.println("UNDO REDO ZOOM Success");
		LoggerLoad.info("UNDO REDO ZOOM Success");
		test.log(Status.INFO, "UNDO REDO ZOOM Success");
	}


	@Test(priority=15)
	public void LanguageChange() throws InterruptedException{
		test=extentReport.createTest("TC_15_LanguageChange");  
		TopToolBarPOM Top_toolbar_obj = new TopToolBarPOM(driver);
		System.out.println("LanguageChange Started");
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
		System.out.println("LanguageChange Success");
		LoggerLoad.info("LanguageChange Success");
		test.log(Status.INFO, "LanguageChange Success");

	}

	@Test(priority=16)
	public void ColourPenThickness() throws InterruptedException{
		test=extentReport.createTest("TC_16_ColourPenThickness");  
		System.out.println("Colour_PenThickness Started");
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
		System.out.println("Colour_PenThickness Success");	
		LoggerLoad.info("Colour_PenThickness Success");
		test.log(Status.INFO, "Colour_PenThickness Success");

	}


}