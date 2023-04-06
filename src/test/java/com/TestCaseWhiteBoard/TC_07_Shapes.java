package com.TestCaseWhiteBoard;

import com.POMWhiteBoard.DrawingToolsPom;

public class TC_07_Shapes extends BaseClass {
	
	public void ShapeTriangle() throws InterruptedException{
		DrawingToolsPom dt=new DrawingToolsPom(driver);
		System.out.println("Shape Triangle started");
		dt.drawingBtnClick();
		dt.shapesClick();
		dt.triangleClick();
		dt.sendAngles();
		dt.trianglePositioning();
	}
	
	public void ShapeCircle() throws InterruptedException{
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
			
	}
	
	public void ShapePolygon() throws InterruptedException{
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
			
	}

}

