package com.bullhorn.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bullhorn.qa.base.TestBase;

public class HomePage extends TestBase{

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	//Object Repository
		@FindBy(xpath = "//span[@data-automation-id = 'FastAddButton']")		          
		WebElement btnFastAdd;
		
		@FindBy(xpath= "//input[@type = 'search']")
		WebElement txtSearch;
		
	public void clickFastAdd()
	{
		btnFastAdd.click();
	}
	
	public void enterTextSearch() {
		txtSearch.sendKeys("test");
	}
	
	
}
