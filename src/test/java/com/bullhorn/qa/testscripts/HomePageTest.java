package com.bullhorn.qa.testscripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bullhorn.qa.base.TestBase;
import com.bullhorn.qa.pages.HomePage;
import com.bullhorn.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	
	public LoginPage loginPage;
	public HomePage homePage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		
		intialization();
		loginPage = new LoginPage();		
	}
	
	@Test
	public void clickFastAddTest() {
		homePage = loginPage.loginApplication(prop.getProperty("username"), prop.getProperty("password"));
		
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//homePage.enterTextSearch();
		homePage.clickFastAdd();
	}
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}

}
