package com.POMWhiteBoard;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import com.UtilitiesWhiteBoard.ReadConfig;

public class TopToolBarPOM {

	ReadConfig readconfig1 = new ReadConfig();
	public static WebDriver driver;
	public TopToolBarPOM(WebDriver driver){
		TopToolBarPOM.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//*[contains(text(),'Disable')])[2]")
	WebElement showcase_disable;
	
	@FindBy(xpath="//*[contains(@class,'modeDiv')]")
	WebElement canvasMode;

	@FindBy(xpath="//button[@title='Download & Share']")
	WebElement downloadUI;

	@FindBy(xpath= "//h6[.='Download PDF']")
	WebElement downloadPDF;

	@FindBy(xpath= "//h6[.='My Board']")
	WebElement myBoardPDF;  

	@FindBy(xpath = "//img[@src=\"/tools/undo.svg\"]")
	WebElement undo;

	@FindBy(xpath = "//img[@src=\"/tools/redo.svg\"]")
	WebElement redo;

	@FindBy(xpath = "//img[@src=\"/tools/trash.svg\"]")
	WebElement delete_menu;

	@FindBy(xpath = "//div[@class=\"MuiPaper-root MuiPopover-paper MuiPaper-elevation8 MuiPaper-rounded\"]/child::li[1]")
	WebElement delete_submenu_page;

	@FindBy(xpath = "//button[@class=\"MuiButtonBase-root MuiButton-root MuiButton-text createButton MuiButton-textPrimary\"][1]")
	WebElement delete_confirm;

	@FindBy(xpath = "//img[@src=\"/tools/zoomin.svg\"]")
	WebElement zoom_in;

	@FindBy(xpath = "//input[@name=\"zoomEnabled\"]")
	WebElement zoom_off;

	@FindBy(xpath = "//span[@class=\"MuiButton-label\"]")
	WebElement zoom_reset;

	@FindBy(xpath = "//img[@src=\"/tools/PenEdit.svg\"]")
	WebElement pen_thickness;

	@FindBy(xpath = "//div[@class=\"MuiPaper-root MuiPopover-paper MuiPaper-elevation8 MuiPaper-rounded\"]/descendant::span[@role=\"slider\"]")
	WebElement pen_thickness_size;

	@FindBy(xpath = "//div[@id=\"colorPicker\"]")
	WebElement colour_picker;	

	@FindBy(xpath = "//div[@id=\"smallpalette\"]/descendant::div[45]")
	WebElement colour_blue;

	@FindBy(xpath = "//img[@src=\"/tools/close.svg\"]")
	WebElement colour_tab_close;

	@FindBy(xpath = "//div[@class=\"MuiInputBase-root MuiOutlinedInput-root formSelect MuiInputBase-formControl\"]")
	WebElement Languages;

	@FindBy(xpath = "//div[@class=\"MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input\"]")
	WebElement Languages1;

	@FindAll (@FindBy(xpath = "(//ul[@class=\"MuiList-root MuiMenu-list MuiList-padding\"])[4]/child::li"))
	List<WebElement> Hindi_select;

	@FindBy(xpath = "//button[@title='حمل شارك']")
	WebElement Hindi_validation;

	//@FindBy(xpath = "//button[@title=\"حمل شارك\"]")
	//WebElement Arabic_validation;

	@FindBy(xpath = "(//span[@class=\"MuiIconButton-label\"])[19]")
	WebElement three_verticals;

	@FindBy(xpath = "//*[contains(text(),'Open Demo Student')]")
	WebElement student_option;

	@FindBy(xpath = "//*[contains(text(),'English')]")
	WebElement english_language;

	@FindBy(xpath = "//input[@placeholder=\"Please Enter Your Name\"]")
	WebElement student_name;

	@FindBy(xpath = "//*[contains(text(),'Join')]")
	WebElement Student_join;

	@FindBy(id = "bname")
	WebElement SingleBoardName;

	@FindBy(xpath = "//img[@src=\"/tools/Text.svg\"]")
	WebElement student_writebtn;

	@FindBy(xpath = "//div[@title=\"Participants Panel\"]")
	WebElement participants;

	@FindBy(xpath = "(//span[@class=\"MuiButton-label\"])[8]")
	WebElement showcase;

	public String getCanvasMode() {
		return canvasMode.getText();
	}

	public void DownloadPDF() throws InterruptedException {
		Thread.sleep(3000);
		downloadUI.click();
		downloadPDF.click();
		myBoardPDF.click();
	}

	public void singleBoardName() {
		SingleBoardName.sendKeys("Automation");
		SingleBoardName.sendKeys(Keys.ENTER);
	}


	public void undo_operation() {

		undo.click();
	}

	public void redo_operation() {
		redo.click();
	}

	public void delete_operation() {
		delete_menu.click();
		delete_submenu_page.click();
		delete_confirm.click();
	}

	public void zoomin_operation() {
		for(int i =0;i<5;i++)
		{
			zoom_in.click();
		}

	}
	public void zoomoff_operation() {
		zoom_off.click();
	}

	public void zoom_reset_opertaion() {
		zoom_reset.click();
	}

	public void pen_thickness_operation() {
		pen_thickness.click();
		pen_thickness_size.click();
		Actions point = new Actions(driver);

		for(int i=1;i<10;i++)
		{
			Action action = point.sendKeys(Keys.ARROW_UP).build();		
			action.perform();	
		}
		point.click().build().perform();	
	}

	public void colour_operation() throws InterruptedException {
		colour_picker.click();
		Thread.sleep(2000);
		colour_blue.click();
		colour_tab_close.click();
	}

	public void Language()  {

		Languages.click();
		Boolean flag = false;

		for(WebElement temp_language:Hindi_select)
		{
			String Expected_language = readconfig1.expected_language();	
			String temp_name = temp_language.getText();
			if(temp_name.equals(Expected_language))
			{
				Actions obj2 = new Actions(driver);
				Action lan = obj2.sendKeys(Keys.ENTER).build();
				lan.perform();
				flag=true;
				break;
			}
			else
			{
				Actions obj1 = new Actions(driver);
				Action lan = obj1.sendKeys(Keys.ARROW_DOWN).build();
				lan.perform();
			}
		}	
		String language_actual = Hindi_validation.getAttribute("title");
		String language_expected = "حمل شارك";

		SoftAssert obj = new SoftAssert(); 
		obj.assertEquals(language_expected, language_actual);

		if(language_actual.equalsIgnoreCase(language_expected))
		{
			obj.assertTrue(true);
			System.out.println("Successfully changed the language to"+" "+readconfig1.expected_language());
		}
		else
		{
			obj.assertTrue(false);
			System.out.println("Error Occured while changing the language"+" "+readconfig1.expected_language());
		}
	}
	public void English() 
	{
		Boolean flag = false;
		Languages1.click();
		for(WebElement temp_language:Hindi_select)
		{

			String eng_lan = "English";	
			String temp_name = temp_language.getText();
			System.out.println(temp_name);
			if(temp_name.equals(eng_lan))
			{
				flag=true;
				break;
			}

			else
			{
				Actions obj1 = new Actions(driver);
				Action lan = obj1.sendKeys(Keys.ARROW_UP).build();
				lan.perform();
			} 
		} 
		english_language.click();  
	}

	public void student() throws InterruptedException  {

		three_verticals.click();
		Thread.sleep(2000);
		student_option.click();
		Thread.sleep(5000);
		String Main_window = driver.getWindowHandle();

		Set<String> s1=driver.getWindowHandles();
		java.util.Iterator<String> i1=s1.iterator();

		while(i1.hasNext())
		{
			String ChildWindow=i1.next();

			if(!Main_window.equalsIgnoreCase(ChildWindow))
			{    

				driver.switchTo().window(ChildWindow);
				Thread.sleep(5000);
				student_name.sendKeys(readconfig1.Student_detail());
				Student_join.click();
				Thread.sleep(5000);
				student_writebtn.click();

				DrawingToolsPom dt = new DrawingToolsPom(driver);
				dt.polygon_student();
				dt.triangle_student();
				Thread.sleep(3000);	}
		}

		driver.switchTo().window(Main_window);
	}

	public void participants_panel() throws InterruptedException  {
		participants.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(3000);
		showcase.click();
		Thread.sleep(3000);
		showcase_disable.click();

	}

}


