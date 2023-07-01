package com.POMWhiteBoard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DrawingToolsPom {
	public WebDriver driver;
	protected WebDriverWait wait;
	
	Actions act;
	public DrawingToolsPom(WebDriver driver) {
		this.driver=driver;	
		wait = new WebDriverWait(driver, 20);
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(xpath = "//*[@id=\"drawToolsIcon\"]/button[2]")
	public WebElement drawingBtn;
	
	By Curve=By.xpath("//h6[.='Curve']");

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
	
	@FindBy(xpath="//*[@class='MuiSvgIcon-root jss108']")
	WebElement closedrawer;
	
		
	public void hamburgerClick() {
		wait.until(ExpectedConditions.elementToBeClickable(openDrawer));	
		openDrawer.click();			
	}

	public void closehamburgerClick() {
		wait.until(ExpectedConditions.elementToBeClickable(closedrawer));
		closedrawer.click();			
	}
	public void drawingBtnClick() {
		//wait.until(ExpectedConditions.elementToBeClickable(drawingBtn));
		drawingBtn.click();			
	}

	public void drawingPenClick() {
		//wait.until(ExpectedConditions.elementToBeClickable(drawingPen));
		drawingPen.click();			
	}

	public void canvasClick() {
		wait.until(ExpectedConditions.elementToBeClickable(canvas));
		canvas.click();			
	}

	public void writeClick() {
		wait.until(ExpectedConditions.elementToBeClickable(writeBtn));
		writeBtn.click();			
	}

	public void clickType() {
		wait.until(ExpectedConditions.elementToBeClickable(clickNType));
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
		wait.until(ExpectedConditions.elementToBeClickable(curveBtn));
		curveBtn.click();
	}

	public void shapesClick() {
		wait.until(ExpectedConditions.elementToBeClickable(shapes));
		shapes.click();
	}

	public void circleClick() {
		wait.until(ExpectedConditions.elementToBeClickable(shapesCircle));
		shapesCircle.click();
	}

	public void triangleClick() {
		wait.until(ExpectedConditions.elementToBeClickable(shapesTriangle));
		shapesTriangle.click();
	}

	public void rectangleClick() {
		wait.until(ExpectedConditions.elementToBeClickable(shapesRectangle));
		shapesRectangle.click();
	}

	public void polygonClick() {
		wait.until(ExpectedConditions.elementToBeClickable(shapesPolygon));
		shapesPolygon.click();
	}

	public void sendAngles() {
		wait.until(ExpectedConditions.elementToBeClickable(anglestextBox));
		anglestextBox.click();
		anglestextBox.sendKeys("60,60");
		setBtn.click();	
	}
	public void sendSides() {
		wait.until(ExpectedConditions.elementToBeClickable(anglestextBox));
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
		wait.until(ExpectedConditions.elementToBeClickable(eraserBtn));
		eraserBtn.click();
	}
	public void objEraserClick() {
		wait.until(ExpectedConditions.elementToBeClickable(objEraserBtn));
		objEraserBtn.click();
	}
	public void whiteOutClick() {
		wait.until(ExpectedConditions.elementToBeClickable(whiteoutBtn));
		whiteoutBtn.click();
	}
	public void moveEraser() throws InterruptedException{
		act=new Actions(driver);
		
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

	}


}
