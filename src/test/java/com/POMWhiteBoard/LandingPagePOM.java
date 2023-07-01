package com.POMWhiteBoard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LandingPagePOM {
	public WebDriver driver;	
	protected static WebDriverWait wait;
	public LandingPagePOM(WebDriver driver) {
		this.driver=driver;	
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='No']")
	public WebElement popupNObtn;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div/div[3]/button")
	public WebElement muiPopup;
	
	@FindBy(xpath = "//span[@class='MuiButton-label']")
	public WebElement collaborate;
	
	@FindBy(xpath = "//*[@id='root']/div/div/div[10]/div/div[2]/div[1]/h2")
	public WebElement simpleClick;
	
	@FindBy(xpath = "//p[text()='Skip for good']")
	public WebElement skip4Good;
	
	public void popupNo() {
		popupNObtn.click();
	}
	
	public void collaborateOption() {
		collaborate.click();
	}
	
	public void simpleClick() {
		simpleClick.click();
		
	}
	
	public void skipforGood() {
		skip4Good.click();
		
	}
	
}
