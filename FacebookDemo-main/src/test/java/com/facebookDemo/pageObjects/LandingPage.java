package com.facebookDemo.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.facebookDemo.testData.TestData;

public class LandingPage {
	


WebDriver ldriver;


	public LandingPage(WebDriver rdriver){
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	TestData testdata = new TestData();
	
	@FindBy(xpath = "(//span[normalize-space()=\"What's on your mind, Wallet?\"])[1]")
	WebElement statusBox;
	
	@FindBy(xpath = "//div[@class='_1mf _1mj']")
	WebElement postTextbox;
	
	@FindBy(xpath = "//span[contains(text(),'Post')]")
	WebElement postBtn;
	
	@FindBy(xpath = "//a[@aria-label='Home']")
	WebElement homeBtn;
	
	
	public void clickHomeBtn() {
			
			homeBtn.click();
		}
	
	
	public void clickStatus() {
		
		statusBox.click();
	}
	
	public void enterStatus() {
		
		postTextbox.sendKeys(testdata.post);
	}
	
	public void clickPost() {
			
			postBtn.click();
		}
	
	
}
