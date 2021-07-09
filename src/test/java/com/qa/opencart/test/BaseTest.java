package com.qa.opencart.test;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.opencart.factory.DriverFactory;
import com.qa.opencart.pages.LoginPage;

public class BaseTest {
	public WebDriver driver;
	public DriverFactory driverfactory;
	public Properties prop;
	public LoginPage loginpage;
	
	@BeforeTest
	public void setUp() {
		driverfactory = new DriverFactory();
		prop = driverfactory.init_prop();
		driver = driverfactory.init_driver(prop);
		loginpage = new LoginPage(driver);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	

}
