package com.bullhorn.qa.testscripts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bullhorn.qa.base.TestBase;
import com.bullhorn.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage loginPage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		intialization();
		loginPage = new LoginPage();
	}

	@Test
	public void loginTitleTest() {
		String title = loginPage.getLoginPageTitle();
		Assert.assertEquals("Please Log In", title);
	}

	@Test
	public void loginTest() {
		loginPage.loginApplication(prop.getProperty("username"), prop.getProperty("password"));
	}

	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}

}
