package com.POMWhiteBoard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToolsPOM {
		
		WebDriver driver;
		public ToolsPOM(WebDriver driver){
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}

		/*@FindBy(xpath = "//div[@title='Tools']")
		WebElement toolbtn;*/
		
		@FindBy(id = "button_tools")
		WebElement toolbtn;
		
		@FindBy(xpath = "//h6[.='Grids']")
		WebElement grid;
		
		@FindBy(xpath = "//h6[.='Big Grid']")
		WebElement bigGrid;
		
		@FindBy(id = "button_add_clearg")
		WebElement clearGrid;
		
		
		
		public void ToolsClick(){
			toolbtn.click();
		}
		
		/*public void Tools2(){
			tools2.click();
		}*/
		
		public void GridOptnClk(){
			grid.click();
		}
		
		public void BigGridOptnClk(){
			bigGrid.click();
		}
		
		public void ClearGrid(){
			clearGrid.click();
		}
}
