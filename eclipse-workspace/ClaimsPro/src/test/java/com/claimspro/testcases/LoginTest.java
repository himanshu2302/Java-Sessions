package com.claimspro.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.claimspro.base.BaseClass;
import com.claimspro.pages.LoginPage;

public class LoginTest extends BaseClass {

	LoginPage loginPage;
	
	public LoginTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
	}
	
	@Test
	public void loginTest() throws InterruptedException {
		loginPage.login();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
}
