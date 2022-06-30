package com.facebookDemo.testCases;

import org.testng.annotations.Test;

import com.facebookDemo.pageObjects.LandingPage;
import com.facebookDemo.pageObjects.LoginPage;


public class TC_FacebookTest extends BaseClass {

	@Test
	public void facebookStatusTest() {
		
		driver.get(baseURL);
		
		LoginPage lp = new LoginPage(driver);
		LandingPage llp = new LandingPage(driver);

		lp.enterUserName(username);
		logger.info("Entered Username");

		lp.enterPassword(password);
		logger.info("Entered Password");
		
		lp.clickLoginBtn();
		logger.info("Clicked Login Button");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		llp.clickHomeBtn();
		llp.clickStatus();
		llp.enterStatus();
		llp.clickPost();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
