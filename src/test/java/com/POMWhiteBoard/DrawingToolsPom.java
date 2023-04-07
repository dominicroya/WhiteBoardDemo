package com.POMWhiteBoard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DrawingToolsPom {
	public WebDriver driver;
	Actions act;
	public DrawingToolsPom(WebDriver driver) {
		this.driver=driver;	
		PageFactory.initElements(driver, this);
	}
	
	//button[contains(@class,'jss136') and  contains(@aria-label,'Drawing Tools')] 
	
	@FindBy(xpath = "//*[@id=\"drawToolsIcon\"]/button[2]")
	public WebElement drawingBtn;

	@FindBy(xpath= "//h6[.='Pen (Click & Draw)']")
	public WebElement drawingPen;

	@FindBy(id = "canvas_drawing")
	WebElement canvas;
	
	@FindBy(id = "openDrawer")
	WebElement openDrawer;	

	@FindBy(xpath="//*[@id=\"button_Text\"]/button[2]")
	WebElement writeBtn;

	@FindBy(id="button_click_type")
	WebElement clickNType;

	@FindBy(xpath="(//*[@id='button_arrow'])[2]")
	WebElement curveBtn;

	@FindBy(id="button_shapes")
	WebElement shapes;

	@FindBy(xpath="//h6[.='Circle']")
	WebElement shapesCircle;

	@FindBy(xpath="//h6[.='Triangle']")
	WebElement shapesTriangle;

	@FindBy(xpath="//h6[.='Rectangle']")
	WebElement shapesRectangle;

	@FindBy(xpath="//h6[.='Polygon']")
	WebElement shapesPolygon;

	@FindBy(id="joinCodeTextField")
	WebElement anglestextBox;

	@FindBy(xpath="//span[contains(text(),'Set')]")
	WebElement setBtn;

	@FindBy(xpath="//span[contains(text(),'Clo')]")
	WebElement closeBtn;

	@FindBy(xpath="//*[@id='button_erase']/button[2]")
	WebElement eraserBtn;

	@FindBy(xpath="//h6[.='Object Eraser']")
	WebElement objEraserBtn;

	@FindBy(xpath="//h6[.='Whiteout']")
	WebElement whiteoutBtn;
	
	@FindBy(xpath="//*[@class='MuiSvgIcon-root jss123']")
	WebElement closedrawer;
	
	

	public void hamburgerClick() {
		openDrawer.click();			
	}

	public void closehamburgerClick() {
		closedrawer.click();			
	}
	public void drawingBtnClick() {
		drawingBtn.click();			
	}

	public void drawingPenClick() {
		drawingPen.click();			
	}

	public void canvasClick() {
		canvas.click();			
	}

	public void writeClick() {
		writeBtn.click();			
	}

	public void clickType() {
		clickNType.click();			
	}

	public void clickAndHold1() {
		act=new Actions(driver);

		act.clickAndHold(canvas).moveByOffset(-30, 60).moveByOffset(30, 40).moveByOffset(30, -40).moveByOffset(-30, -60)
		.moveByOffset(60, -30).moveByOffset(40, 30).moveByOffset(-40, 30).moveByOffset(-60, -30)
		.moveByOffset(-30, -60).moveByOffset(30, -40).moveByOffset(30, 40).moveByOffset(-30, 60)
		.moveByOffset(-60, -30).moveByOffset(-40, 30).moveByOffset(40, 30).moveByOffset(60, -30).release().perform();

		act.clickAndHold(canvas).moveByOffset(-60, 120).moveByOffset(60, 80).moveByOffset(60, -80).moveByOffset(-60, -120)
		.moveByOffset(120, -60).moveByOffset(80, 60).moveByOffset(-80, 60).moveByOffset(-120, -60)
		.moveByOffset(-60, -120).moveByOffset(60, -80).moveByOffset(60, 80).moveByOffset(-60, 120)
		.moveByOffset(-120, -60).moveByOffset(-80, 60).moveByOffset(80, 60).moveByOffset(120, -60).release().perform();

		/*act.clickAndHold(canvas).moveByOffset(-10,100).
		moveByOffset(-100,10).
		moveByOffset(-10,100).
		moveByOffset(-50,-10).
		moveByOffset(-10,-25).
		moveByOffset(-150,35).
		moveByOffset(-10,-25).
		moveByOffset(-10,-25).
		moveByOffset(-10,-50).release().perform();*/

	}
	public void clickAndHold2() {
		act=new Actions(driver);
		act.clickAndHold(canvas).moveByOffset(100,10).
		moveByOffset(10,100).
		moveByOffset(100,10).
		moveByOffset(-10,-50).
		moveByOffset(-25,-10).
		moveByOffset(-35,150).
		moveByOffset(-25,-10).
		moveByOffset(-25,-10).
		moveByOffset(-50,-10).release().perform();
	}




	public void clickAndHold() {
		act=new Actions(driver);
		act.clickAndHold(canvas).moveByOffset(100,-100).
		moveByOffset(-100,-100).
		moveByOffset(-100,100).
		moveByOffset(100,100).
		moveByOffset(70,-70).
		moveByOffset(-70,-70).
		moveByOffset(-70,70).
		moveByOffset(70,70).
		moveByOffset(0,100).
		moveByOffset(150,150).
		moveByOffset(150,-150).
		moveByOffset(-150,-150).
		moveByOffset(-150,150).release().perform();
		/*act.clickAndHold(canvas).moveByOffset(0,0).moveByOffset(-100,0).
		moveByOffset(-100,-100).moveByOffset(0,-100).moveByOffset(0,-50).release().perform();*/

	}

	public void clickAndType() {
		act=new Actions(driver);
		act.moveByOffset(200, -100).click().build().perform();
		canvas.sendKeys("Welcome to WhiteBoard.Chat");
	}
	
	public void clickAndType1() {		
		act=new Actions(driver);
		act.moveToElement(canvas, -100, -50).click();
		canvas.sendKeys("WhiteBoard");
		act.moveByOffset(-100, 50).click().build().perform();
		canvas.sendKeys("BlackBoard ");
		act.moveByOffset(200, -100).click().build().perform();
		canvas.sendKeys("GreenBoard");
	}


	public void CurveClick() {
		curveBtn.click();
	}

	public void shapesClick() {
		shapes.click();
	}

	public void circleClick() {
		shapesCircle.click();
	}

	public void triangleClick() {
		shapesTriangle.click();
	}

	public void rectangleClick() {
		shapesRectangle.click();
	}

	public void polygonClick() {
		shapesPolygon.click();
	}

	public void sendAngles() {
		anglestextBox.click();
		anglestextBox.sendKeys("60,60");
		setBtn.click();	
	}
	public void sendSides() {
		anglestextBox.click();
		anglestextBox.sendKeys("5");
		setBtn.click();	
	}	
	public void trianglePositioning() {		
		act=new Actions(driver);
		//act.moveToElement(canvas, -500, -150).click().build().perform();//Top left corner of the canvas
		act.moveToElement(canvas, -250, -100).click().build().perform();
		//act.moveToElement(canvas, -350, 0).doubleClick().sendKeys("What type of triangle is this?").build().perform();	
		//act.moveToElement(canvas, -350, 80).doubleClick().sendKeys("Answer:").build().perform();	
	}
	public void triangleLesson() {		
		act=new Actions(driver);
		//act.moveToElement(canvas, -500, -150).click().build().perform();//Top left corner of the canvas
		act.moveToElement(canvas, -250, -100).click().build().perform();
		act.moveToElement(canvas, -350, 0).doubleClick().sendKeys("What type of triangle is this?").build().perform();	
		//act.moveToElement(canvas, -350, 80).doubleClick().sendKeys("Answer:").build().perform();	
	}
	public void polygonPositioning() {		
		act=new Actions(driver);
		act.moveToElement(canvas,250,-100).click().build().perform();	
		//act.moveToElement(canvas, 500, -150).click().build().perform();	
		//act.moveToElement(canvas, 150, 0).doubleClick().sendKeys("What is this shape name?").build().perform();	
		//act.moveToElement(canvas, 150, 80).doubleClick().sendKeys("Answer:").build().perform();	
	}
	public void polygonLesson() {		
		act=new Actions(driver);
		act.moveToElement(canvas,250,-100).click().build().perform();	
		//act.moveToElement(canvas, 500, -150).click().build().perform();	
		act.moveToElement(canvas, 150, 0).doubleClick().sendKeys("What is this shape name?").build().perform();	
		//act.moveToElement(canvas, 150, 80).doubleClick().sendKeys("Answer:").build().perform();	
	}
	
	public void triangle_student() {		
		act=new Actions(driver);
		act.moveToElement(canvas, -350, 80).doubleClick().sendKeys("Scalene Triangle").build().perform();	
	}
	
	public void polygon_student() {		
		act=new Actions(driver);	
		act.moveToElement(canvas, 150, 80).doubleClick().sendKeys("pentagon").build().perform();	
	}
	
	public void DrawCircle() {
		act=new Actions(driver);
		act.moveToElement(canvas, -60,-180).clickAndHold();
		act.moveToElement(canvas, 90, -30).release().perform();	
	}
	public void eraserBtnClick() {
		eraserBtn.click();
	}
	public void objEraserClick() {
		objEraserBtn.click();
	}
	public void whiteOutClick() {
		whiteoutBtn.click();
	}
	public void moveEraser() throws InterruptedException{
		act=new Actions(driver);
		/*act.clickAndHold(canvas).moveByOffset(-70,-200).moveByOffset(0,0).moveByOffset(100,-40).release().perform();
		System.out.println("Option1");
		Thread.sleep(3000);
		act.moveToElement(canvas, -150, 0).clickAndHold();
		act.moveToElement(canvas, 0, 0).moveToElement(canvas, -150, 0).release().perform();	
		System.out.println("Option2");
		Thread.sleep(3000);
		act.dragAndDropBy(canvas,-150,0).release().perform();
		System.out.println("Option3");
		 */
		/*act.clickAndHold(canvas).moveByOffset(-140, -150).dragAndDropBy(canvas, -140, 150).release().perform();
		act.clickAndHold(canvas).moveByOffset(-120, -150).dragAndDropBy(canvas, -120, 150).release().perform();*/
		act.clickAndHold(canvas).moveByOffset(-100, -150).dragAndDropBy(canvas, -100, 150).release().perform();
		act.clickAndHold(canvas).moveByOffset(-80, -150).dragAndDropBy(canvas, -80, 150).release().perform();
		act.clickAndHold(canvas).moveByOffset(-60, -150).dragAndDropBy(canvas, -60, 150).release().perform();
		act.clickAndHold(canvas).moveByOffset(-40, -150).dragAndDropBy(canvas, -40, 150).release().perform();
		act.clickAndHold(canvas).moveByOffset(-20, -150).dragAndDropBy(canvas, -20, 150).release().perform();
		act.clickAndHold(canvas).moveByOffset(0, -150).dragAndDropBy(canvas, 0, 150).release().perform();
		act.clickAndHold(canvas).moveByOffset(20, -150).dragAndDropBy(canvas, 20, 150).release().perform();
		act.clickAndHold(canvas).moveByOffset(40, -150).dragAndDropBy(canvas, 40, 150).release().perform();
		act.clickAndHold(canvas).moveByOffset(60, -150).dragAndDropBy(canvas, 60, 150).release().perform();
		act.clickAndHold(canvas).moveByOffset(80, -150).dragAndDropBy(canvas, 80, 150).release().perform();
		act.clickAndHold(canvas).moveByOffset(100, -150).dragAndDropBy(canvas,100, 150).release().perform();
		act.clickAndHold(canvas).moveByOffset(120, -150).dragAndDropBy(canvas,120, 150).release().perform();
		act.clickAndHold(canvas).moveByOffset(140, -150).dragAndDropBy(canvas,140, 150).release().perform();
		act.clickAndHold(canvas).moveByOffset(160, -150).dragAndDropBy(canvas,160, 150).release().perform();
		/*act.clickAndHold(canvas).moveByOffset(180, -150).dragAndDropBy(canvas,180, 150).release().perform();
		act.clickAndHold(canvas).moveByOffset(200, -150).dragAndDropBy(canvas,200, 150).release().perform();*/





		/*act.clickAndHold(canvas).moveByOffset(-100, -200).dragAndDropBy(canvas, -100, 200).release().perform();
		act.clickAndHold(canvas).moveByOffset(-100, -180).dragAndDropBy(canvas, -100, 180).release().perform();
		act.clickAndHold(canvas).moveByOffset(-100, -160).dragAndDropBy(canvas, -100, 160).release().perform();
		act.clickAndHold(canvas).moveByOffset(-100, -140).dragAndDropBy(canvas, -100, 140).release().perform();
		act.clickAndHold(canvas).moveByOffset(-100, -120).dragAndDropBy(canvas, -100, 120).release().perform();
		act.clickAndHold(canvas).moveByOffset(-100, -100).dragAndDropBy(canvas, -100, 100).release().perform();
		act.clickAndHold(canvas).moveByOffset(-100, -80).dragAndDropBy(canvas, -100, 80).release().perform();
		act.clickAndHold(canvas).moveByOffset(-100, -60).dragAndDropBy(canvas, -100, 60).release().perform();
		act.clickAndHold(canvas).moveByOffset(-100, -40).dragAndDropBy(canvas, -100, 40).release().perform();
		act.clickAndHold(canvas).moveByOffset(-100, -20).dragAndDropBy(canvas, -100, 20).release().perform();
		act.clickAndHold(canvas).moveByOffset(-100, 0).dragAndDropBy(canvas, -100, 0).release().perform();

		act.clickAndHold(canvas).moveByOffset(100, -0).dragAndDropBy(canvas, 100, 0).release().perform();
		act.clickAndHold(canvas).moveByOffset(100, -20).dragAndDropBy(canvas, 100, 20).release().perform();
		act.clickAndHold(canvas).moveByOffset(100, -40).dragAndDropBy(canvas, 100, 40).release().perform();
		act.clickAndHold(canvas).moveByOffset(100, -60).dragAndDropBy(canvas, 100, 60).release().perform();
		act.clickAndHold(canvas).moveByOffset(100, -80).dragAndDropBy(canvas, 100, 80).release().perform();
		act.clickAndHold(canvas).moveByOffset(100, -100).dragAndDropBy(canvas, 100, 100).release().perform();
		act.clickAndHold(canvas).moveByOffset(100, -120).dragAndDropBy(canvas, 100, 120).release().perform();
		act.clickAndHold(canvas).moveByOffset(100, -140).dragAndDropBy(canvas, 100, 140).release().perform();
		act.clickAndHold(canvas).moveByOffset(100, -160).dragAndDropBy(canvas, 100, 160).release().perform();
		act.clickAndHold(canvas).moveByOffset(100, -180).dragAndDropBy(canvas, 100, 180).release().perform();
		act.clickAndHold(canvas).moveByOffset(100, -200).dragAndDropBy(canvas, 100, 200).release().perform();*/

	}



}
