package com.TestCaseWhiteBoard;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;

import com.POMWhiteBoard.DrawingToolsPom;
import com.POMWhiteBoard.ToolsPOM;
import com.POMWhiteBoard.TopToolBarPOM;
import com.POMWhiteBoard.UploadPOM;
import com.UtilitiesWhiteBoard.LoggerLoad;
import com.UtilitiesWhiteBoard.ReadConfig;
import com.aventstack.extentreports.Status;

public class LeftToolBarFunctionalities extends BaseClass {
	
	ReadConfig readconfig= new ReadConfig();

	@Test(priority=1)
	public void PenDraw() throws InterruptedException{
		test=extentReport.createTest("TC_01_Pen:Click&Draw");  
		test.assignCategory("Left Tool Bar");
		test.log(Status.INFO, "Drawing on the Canvas using a Free Hand Pen Tool");
		LoggerLoad.info("Drawing on the Canvas using a Free Hand Pen Tool");
		DrawingToolsPom dt=new DrawingToolsPom(driver);	
		TopToolBarPOM ttb=new TopToolBarPOM(driver);
		Thread.sleep(3000);
		dt.drawingBtnClick();
		Thread.sleep(3000);
		dt.drawingPenClick();
		Thread.sleep(3000);
		dt.canvasClick();
		dt.clickAndHold1();
		Thread.sleep(2000);
		String CanvasMode=ttb.getCanvasMode();
		test.log(Status.INFO, "Getting the Canvas Mode after selecting the Pen Tool");
		test.log(Status.INFO, "Expected Mode: Draw ");
		test.log(Status.INFO, "Current Mode:"+CanvasMode);
		if(CanvasMode.equals("Draw")) {
			test.log(Status.PASS, "Canvas is in the Draw Mode");
			test.log(Status.INFO, "Free Hand Draw successful");
		}else {
			test.log(Status.FAIL, "Canvas is in the MoveResize Mode");
			LoggerLoad.error("Canvas is in the MoveResize Mode");
		}
		
		extentReport.flush();
	}
	
	@Test(priority=2)
	public void ClicknType() throws InterruptedException {
		test=extentReport.createTest("TC_02_Click&Type"); 
		test.assignCategory("Left Tool Bar");
		DrawingToolsPom dt=new DrawingToolsPom(driver);
		TopToolBarPOM ttb=new TopToolBarPOM(driver);
		test.log(Status.INFO, "Click and Type tools is selected from WRITE Tab");
		LoggerLoad.info("Click and Type tools is selected from WRITE Tab");
		Thread.sleep(3000);
		dt.writeClick();
		Thread.sleep(3000);
		dt.clickType();
		String CanvasMode=ttb.getCanvasMode();
		Thread.sleep(5000);
		dt.clickAndType();
		test.log(Status.INFO, "Getting the Canvas Mode after selecting the Write Tool");
		test.log(Status.INFO, "Expected Mode: Text Text ");
		test.log(Status.INFO, "Current Mode:"+CanvasMode);
		if(CanvasMode.equals("Text Text")) {
			test.log(Status.PASS, "Canvas is in the Text Text Mode");
			test.log(Status.INFO, "Click & Type Tool is Success");
		}else {
			test.log(Status.FAIL, "Canvas is in the" + CanvasMode +" Mode");
			LoggerLoad.error("Canvas is in the" + CanvasMode +" Mode");
		}
		extentReport.flush();
	}
		
	@Test(priority=3)
	public void GridTool() throws InterruptedException{
		test=extentReport.createTest("TC_03_GridTool_Apply"); 
		test.assignCategory("Left Tool Bar");
		test.log(Status.INFO, "Applying Grid on the Canvas ");
		LoggerLoad.info("Applying Grid on the Canvas ");
		System.out.println("Get to Grid  Started");
		ToolsPOM t1 = new ToolsPOM(driver);
		t1.ToolsClick();
		Thread.sleep(3000);
		t1.GridOptnClk();
		Thread.sleep(3000);
		t1.BigGridOptnClk();
		Thread.sleep(3000);
		System.out.println("Grid Placed Successful");
		test.log(Status.PASS, "Grid Placed Successful");
		extentReport.flush();
	}

	@Test(priority=4)
	public void ClearGrid() throws InterruptedException{
		test=extentReport.createTest("TC_04_GridTool_Clear"); 
		test.assignCategory("Left Tool Bar");
		test.log(Status.INFO, "Removing Grid on the Canvas ");
		LoggerLoad.info("Applying Grid on the Canvas ");
		ToolsPOM t1 = new ToolsPOM(driver);
		TopToolBarPOM ttb= new TopToolBarPOM(driver);
		Thread.sleep(3000);
		t1.ToolsClick();
		Thread.sleep(3000);
		t1.GridOptnClk();
		Thread.sleep(3000);
		t1.ClearGrid();
		Thread.sleep(3000);
		System.out.println("Grid  Cleared");
		ttb.delete_operation();
		test.log(Status.PASS, "Grid  Removed from the Canvas");
		extentReport.flush();
	}

	@Test(priority=5)
	public void ContentUpload() throws InterruptedException, AWTException {
		test=extentReport.createTest("TC_05_ContentUpload");  
		test.assignCategory("Left Tool Bar");
		test.log(Status.INFO, "Uploading a picture on the Canvas ");
		LoggerLoad.info("Uploading a picture on the Canvas ");
		System.out.println("Upload a file Started");
		UploadPOM upload_obj = new UploadPOM(driver);
		TopToolBarPOM ttb= new TopToolBarPOM(driver);
		Thread.sleep(3000);
		upload_obj.uploadClick();
		System.out.println("Upload menu Clicked");
		Thread.sleep(3000);
		upload_obj.uploadSubClick();
		System.out.println("Upload Sub menu Clicked");
		Thread.sleep(3000);
		String path= readconfig.getFilePath();
		upload_obj.SelectFile(path);
		System.out.println("File Upload Success");
		LoggerLoad.info("File Upload Success");
		Thread.sleep(3000);
		ttb.delete_operation();
		test.log(Status.PASS, "File Upload Success");
		extentReport.flush();
	}
	
	@Test(priority=6)
	public void ShapeTriangle() throws InterruptedException{
		test=extentReport.createTest("TC_06_ShapeTriangle");  
		test.assignCategory("Left Tool Bar");
		test.log(Status.INFO, "Placing a shape triangle on the Canvas ");
		LoggerLoad.info("Placing a shape triangle on the Canvas ");
		DrawingToolsPom dt=new DrawingToolsPom(driver);
		System.out.println("Shape Triangle started");
		dt.drawingBtnClick();
		Thread.sleep(2000);
		dt.shapesClick();
		Thread.sleep(2000);
		dt.triangleClick();
		Thread.sleep(2000);
		dt.sendAngles();
		//Thread.sleep(2000);
		dt.trianglePositioning();	
		System.out.println("Shape Triangle Success");
		LoggerLoad.info("Shape Triangle Success");
		test.log(Status.PASS, "Shape Triangle Success");
		extentReport.flush();
	}
	@Test(priority=7)
	public void ShapeCircle() throws InterruptedException{
		test=extentReport.createTest("TC_07_ShapeCircle"); 
		test.assignCategory("Left Tool Bar");
		test.log(Status.INFO, "Placing a shape Circle on the Canvas ");
		LoggerLoad.info("Placing a shape Circle on the Canvas ");
		DrawingToolsPom dt=new DrawingToolsPom(driver);
		System.out.println("Shape Circle started");
		dt.drawingBtnClick();
		Thread.sleep(2000);
		dt.shapesClick();
		Thread.sleep(2000);
		dt.circleClick();
		Thread.sleep(2000);
		dt.DrawCircle();
		System.out.println("Shape Circle Success");
		LoggerLoad.info("Shape Circle Success");
		test.log(Status.PASS, "Shape Circle Success");
		extentReport.flush();	
	}
	@Test(priority=8)
	public void ShapePolygon() throws InterruptedException{
		test=extentReport.createTest("TC_08_ShapePolygon");  
		test.assignCategory("Left Tool Bar");
		test.log(Status.INFO, "Placing a shape Polygon on the Canvas ");
		LoggerLoad.info("Placing a shape Polygon on the Canvas ");
		DrawingToolsPom dt=new DrawingToolsPom(driver);
		System.out.println("Shape Polygon started");
		dt.drawingBtnClick();
		Thread.sleep(2000);
		dt.shapesClick();
		Thread.sleep(2000);
		dt.polygonClick();
		Thread.sleep(2000);
		dt.sendSides();
		dt.polygonPositioning();
		System.out.println("Shape Polygon Success");
		LoggerLoad.info("Shape Polygon Success");
		test.log(Status.PASS, "Shape Polygon Success");
		extentReport.flush();	
	}
	@Test(priority=9)
	public void WhiteOut() throws InterruptedException{
		test=extentReport.createTest("TC_09_WhiteOut_Clear");  
		test.assignCategory("Left Tool Bar");
		test.log(Status.INFO, "Erase the Object drawn started ");
		LoggerLoad.info("Erase the Object drawn started");
		DrawingToolsPom dt=new DrawingToolsPom(driver);
		TopToolBarPOM ttb=new TopToolBarPOM(driver);
		dt.eraserBtnClick();
		//dt.objEraserClick();
		dt.whiteOutClick();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		String CanvasMode=ttb.getCanvasMode();
		if(CanvasMode.equals("Whiteout")) {
			test.log(Status.PASS, "Canvas is in the whiteout Mode");
			test.log(Status.INFO, "WhiteOut Tool is Success");
		}else {
			test.log(Status.FAIL, "Canvas is in the" + CanvasMode +" Mode");
			LoggerLoad.error("Canvas is in the" + CanvasMode +" Mode");
		}
		dt.moveEraser();
		System.out.println("Object Erase Success");
		test.log(Status.PASS, "Object Erase Success");
		extentReport.flush();
	}
	
	
	
	
	
	
}



