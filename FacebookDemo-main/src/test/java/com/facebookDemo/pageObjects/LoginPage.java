package com.facebookDemo.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	// Create the Driver object
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver){
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//input[@id='email']")
	@CacheLookup
	WebElement usernameTextbox;
	
	@FindBy(id = "pass")
	@CacheLookup
	WebElement passwordTextbox;
	
	@FindBy(name = "login")
	@CacheLookup
	WebElement loginBtn;
	
	
	
	
	// Action Methods 
	
	public void enterUserName(String username) {
		
		usernameTextbox.sendKeys(username);
	}
	
	public void enterPassword(String password) {
			
			passwordTextbox.sendKeys(password);
		}
	
	public void clickLoginBtn() {
			
			loginBtn.click();
		}
}
