package com.fb.qa.testcases;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fb.qa.base.TestBase;
import com.fb.qa.pages.HomePage;
import com.fb.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homePage;
	
	public LoginPageTest() {
		super();
	}
	@BeforeMethod
	public void SetUp() {
		
		intialization();
		 loginpage = new LoginPage();	
	}
	
	@Test(priority=1)
	public void LoginPageTitleTest() {
		String title = loginpage.validateTitle();
		Assert.assertEquals(title, "Facebook - Log In or Sign Up");
		
	}
	@Test(priority=2)
	public void LogoTest() {
		boolean flag = loginpage.validateimage();
	    Assert.assertTrue(flag);
		
	}
	
	@Test(priority=3)
	public void LoginTest() {
		//loginpage.login(prop.getProperty("username"),prop.getProperty("password");
		homePage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	

}
