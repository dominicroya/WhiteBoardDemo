package com.POMWhiteBoard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class RightToolBarPOM {
	WebDriver driver;
	public Actions act;
	public RightToolBarPOM(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//Widgets WebElements
	@FindBy(id = "IDwidgetsButton")
	WebElement widgets;
	
	@FindBy(xpath = "(//span[.='YouTube'])[2]")
	WebElement youtube;
	
	@FindBy(xpath = "//*[@id='windowHeader']/div/div[1]/div/div/input")
	WebElement enterurltxt;
	
	@FindBy(xpath = "//*[@id='windowHeader']/button[1]/span[1]/img")
	WebElement loadbtn;
	
	@FindBy(xpath = "//*[@id='movie_player']/div[4]/div")
	WebElement playbtn;
	
	@FindBy(xpath = "//*[@id='windowHeader']/button[2]/span[1]/img")
	WebElement closeyoutube;
	
	//Gizmos WebElements
	@FindBy(id = "IDgizmoButton")
	WebElement gizmosbtn;
	
	@FindBy(id = "demo-simple-select-outlined1")
	WebElement outline;
	
	@FindBy(xpath = "//*[@id='menu-']/div[3]/ul/li[4]")
	WebElement selecteng;
	
	@FindBy(xpath = "(//span[.='D'])[2]")
	WebElement slectD;
	
	@FindBy(xpath = "(//span[.='A'])[2]")
	WebElement selectA;
	
	@FindBy(xpath = "(//span[.='B'])[2]")
	WebElement selectB;
	
	@FindBy(xpath = "(//span[.='C'])[2]")
	WebElement selectC;
	
	@FindBy(id = "canvas_drawing")
	WebElement canvas;
	
	@FindBy(xpath = "//button[contains(@class,'closeImgContainer')]")
	WebElement widgetCloseBtn;
	
	//Widget Methods
	public void ClickOnWidgets(){
		widgets.click();
	}
	
	public void ClickOnYouTube() throws InterruptedException{
		youtube.click();
		Thread.sleep(3000);
		act = new Actions(driver);
		WebElement element = driver.findElement(By.id("canvas_drawing"));
		act.moveToElement(element, -400, -200).click().build().perform();
	}
	
	public void EnterURL(){
		enterurltxt.click();
		enterurltxt.sendKeys("https://www.youtube.com/watch?v=V6dmrH0c_-A");
	}
	
	public void ClickOnLoadVideoButton(){
		loadbtn.click();
	}
	
	public void ClickOnPlay(){
		WebElement element = driver.findElement(By.id("canvas_drawing"));
		act.moveToElement(element, -80, 0).click().build().perform();
//		playbtn.click();
	}
	
	public void CloseYouTube(){
		closeyoutube.click();
	}
	
	public void ScrollDown(){
    	EventFiringWebDriver efd = new EventFiringWebDriver(driver);
    	efd.executeScript("document.querySelector('.overFlowList').scrollBy(0,850)");
			
    }
	
	public void WidgetClose() {
		widgetCloseBtn.click();
	}
	
	//Gizmos Methods
	
	public void ClickOnGizmos(){
		   gizmosbtn.click();
	     }
	    
	    public void ClickOnGizmosDropdown(){
	    	outline.click();
	    }
	    
	    public void ScrollUp(){
	    	EventFiringWebDriver efd = new EventFiringWebDriver(driver);
	    	efd.executeScript("document.querySelector('#menu- > div.MuiPaper-root.MuiMenu-paper.MuiPopover-paper.MuiPaper-elevation8.MuiPaper-rounded').scrollBy(0,-970)");
				
	    }
	    
		public void SelectEnglish(){
			selecteng.click();
		}
		
		public void SelectAlphabetD() throws InterruptedException{
			slectD.click();
			Thread.sleep(3000);
			act = new Actions(driver);
			WebElement element = driver.findElement(By.id("canvas_drawing"));
			act.moveToElement(element, -200, -100).click().build().perform();
		}
		
		public void SelectAlphabetA() throws InterruptedException{
			selectA.click();
			Thread.sleep(3000);
			act = new Actions(driver);
			WebElement element = driver.findElement(By.id("canvas_drawing"));
			act.moveToElement(element, 200, 100).click().build().perform();
		}
		
		public void SelectAlphabetB() throws InterruptedException{
			selectB.click();
			Thread.sleep(3000);
			act = new Actions(driver);
			WebElement element = driver.findElement(By.id("canvas_drawing"));
			act.moveToElement(element, 250, 150).click().build().perform();
		}
		
		public void SelectAlphabetC() throws InterruptedException{
			selectC.click();
			Thread.sleep(3000);
			act = new Actions(driver);
			WebElement element = driver.findElement(By.id("canvas_drawing"));
			act.moveToElement(element, -250, -150).click().build().perform();
		}

}
