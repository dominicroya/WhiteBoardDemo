package com.POMWhiteBoard;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadPOM {

	WebDriver driver;
	Keys key;
	
	public UploadPOM(WebDriver driver) {
		this.driver=driver;	
		PageFactory.initElements(driver, this);
	}
	
	/*@FindBy(xpath = "//img[@src='/tools/upload.svg']")
	public WebElement upload;*/
	
	@FindBy(xpath = "//*[@id='button_upload']/button[2]")
	public WebElement upload;
	
	@FindBy(xpath = "//h6[.='Upload Files From Computer']")
	public WebElement uploadFiles;  
	
	public void uploadClick() {
		upload.click();
	}
	
	public void uploadSubClick() {
		uploadFiles.click();
	}
	
	public void uploadFilesPath(String path) {
		uploadFiles.sendKeys(path);
		uploadFiles.sendKeys(Keys.ENTER);
		
	}
	
	public void SelectFile(String path) throws AWTException, InterruptedException{
				
		String filelocation=path;
		StringSelection selection= new StringSelection(filelocation);		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Thread.sleep(3000);
		System.out.println("selection" +selection);
		Robot robot= new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(10000);
	}
			
		
}
	
	


