package com.alti.tests;

import org.testng.annotations.Test;

import com.alti.basetest.BaseTest;

public class LoginTest extends BaseTest {

	@Test
	public void checkLogin() throws Exception {
		
		
		getPages().loginPage().setUsernameFieldValue("standard_user");
		getPages().loginPage().setPasswordFieldValue("secret_sauce");
		getPages().loginPage().clickLoginButton();
		Thread.sleep(2000);
	}
}
