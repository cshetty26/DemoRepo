package com.fb.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.qa.base.TestBase;

public class LoginPage extends TestBase {
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="pass")
	WebElement pswd;
	
	@FindBy(id="u_0_3")
	WebElement submit;
	

	
	
	@FindBy (xpath="//i[@class='fb_logo img sp_Er_CExuI2JW sx_a62542']")
	
	WebElement logo;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	public String validateTitle() {
		return driver.getTitle();
	}
	public boolean validateimage() {
		return logo.isDisplayed();
	}
	
	public HomePage login(String e,String p) {
		email.sendKeys(e);
		pswd.sendKeys(p);
		submit.click();
		return new HomePage();
	}
	
}
