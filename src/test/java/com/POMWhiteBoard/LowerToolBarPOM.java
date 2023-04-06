package com.POMWhiteBoard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LowerToolBarPOM {

	public WebDriver driver;
	public Actions act;
	public LowerToolBarPOM(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//Web Elements

	@FindBy(xpath = "//*[@id=\"manageBoards\"]/button/span[1]/span")
	WebElement manageboards;

	@FindBy(xpath = "(//*[@title=\"View Board\"])[1]")
	WebElement viewboard;

	@FindBy(id = "pagesPanelButton")
	WebElement thumbnail;
	
	
	@FindBy(id = "previousPageButton")
	WebElement previouspage;

	@FindBy(id = "nextPageButton")
	WebElement nextpage;


	public void manageBoardsClick() {
		manageboards.click();			
	}
	
	
	
	public void viewBoardClick() {
		viewboard.click();			
	}

	public void thumbNailClick() {
		thumbnail.click();			
	}

	public void previousPageClick() {
		previouspage.click();			
	}

	public void nextPageClick() {
		nextpage.click();			
	}

}
