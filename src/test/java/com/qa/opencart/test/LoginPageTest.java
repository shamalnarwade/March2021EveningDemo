package com.qa.opencart.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.utils.Constants;

public class LoginPageTest extends BaseTest{
	
	@Test
	public void loginPageTitleTest() {
		String title = loginpage.getLoginPageTitle();
		System.out.println("login page title is : "+ title);
		Assert.assertEquals(title, Constants.LOGIN_PAGE_TITLE);
	}
	
	@Test
	public void forgotPwdLinkTest() {
		Assert.assertTrue(loginpage.isForgotPwdLinkExist());
	}
	
	@Test
	public void loginTest() {
		loginpage.doLogin(prop.getProperty("username").trim(), prop.getProperty("password").trim());
		
	}

}
