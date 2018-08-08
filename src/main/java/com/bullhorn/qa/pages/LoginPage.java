package com.bullhorn.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bullhorn.qa.base.TestBase;

public class LoginPage extends TestBase{

	public LoginPage()  {
		PageFactory.initElements(driver, this);
	}
	
	//Object Repository
	@FindBy(id = "username")
	WebElement txtUsername;
	
	@FindBy(id = "password")
	WebElement txtPassword;

	@FindBy(xpath= "//input[@type = 'submit']")
	WebElement btnLogin;
	
	public String getLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public HomePage loginApplication(String un, String pw)
	{
		txtUsername.sendKeys(un);
		txtPassword.sendKeys(pw);
		btnLogin.click();
		return new HomePage();
	}
	
	
	

}
