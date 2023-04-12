package com.POMWhiteBoard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {

	public WebDriver driver;
	public Actions act;

	public LoginPOM(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//Web Elements 

	@FindBy(xpath = "//*[@class='useremail']")
	public WebElement useremail;
	
	@FindBy(xpath = "//*[@id=\"settingsButton\"]")
	public WebElement settingsBtn;

	@FindBy(xpath = "//input[@name='email']")
	public WebElement emailTxtBx;

	@FindBy(xpath = "//input[@name='password']")
	public WebElement PasswordTxtBx;

	@FindBy(xpath = "//*[contains(text(), 'Sign In')]")
	public WebElement SignInBtn;

	@FindBy(xpath = "//span[.='remind me again']")
	public WebElement remindMeAgainBtn;

	@FindBy(xpath = "//span[.='Save ']")
	public WebElement SaveName;

	@FindBy(xpath = "//*[@class='MuiSvgIcon-root ndCloseIcon']")
	public WebElement removePopup;
	

	@FindBy(xpath = "//input[@name='email']")
	public WebElement invalidemail;

	@FindBy(xpath = "//input[@name='password']")
	public WebElement invalidPassword;
	
	@FindBy(xpath = "//div[@class='MuiAlert-message']")
	public WebElement Toast;
	
	@FindBy(xpath = "//div[contains(text(),'Incorrect username or password.')]")
	public WebElement IncorrectToast;
	
	@FindBy(className = "ndCloseIcon")
	public WebElement closeBtn;

	
	public void closeBtnClick() {
		closeBtn.click();			
	}
	
	public String getToastMessage() {
		return Toast.getText();
	}
	
	public String getIncorrectToastMessage() {
		return IncorrectToast.getText();
	}

	public void enterInvalidEmail() {
		invalidemail.sendKeys("john@gmail.com");
	}

	public void enterInvalidPassword() {
		invalidPassword.sendKeys("123789");
	}

	public void Settings() {
		settingsBtn.click();			
	}

	public void enterEmail() {
		emailTxtBx.sendKeys("sairamb@datatemplate.com");
	}

	public void enterPassword() {
		PasswordTxtBx.sendKeys("1234567890");
	}

	public String getUserMail() {
		return useremail.getText();
		
	}
	
	public void sigIn() {
		SignInBtn.click();
	}

	public void SaveName() {
		SaveName.click();
	}

	public void remindMeAgain() {
		remindMeAgainBtn.click();
	}

	public void RemovePopUP() {
		removePopup.click();
	}
}
