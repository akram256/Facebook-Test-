package com.facebookDemo.testCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass {
	
	public String baseURL = "https://www.facebook.com";
	public String username = "hubwalll";
	public String password = "256256";
	public String review = "This is a Sample review for testing This is a Sample review for testingThis is a Sample review for testingThis is a Sample review for testingThis is a Sample review for testingThis is a Sample review for testing";
	public static WebDriver driver;
	public static Logger logger;

	@BeforeClass
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Drivers/chromedriver/");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		logger = Logger.getLogger("walletHubDemoProject");
		PropertyConfigurator.configure("Log4j.properties");
		
	}
	
	
	@AfterClass
	public void tearDown() {
		
		driver.quit();
	}
	
}

