package com.newclaimspro.testcases;

import java.io.FileNotFoundException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.newclaimspro.base.BaseClass;
import com.newclaimspro.pages.LoginPage;

public class LoginTest extends BaseClass {
	public LoginTest loginTest;
	public LoginPage loginPage;
	SoftAssert sf = new SoftAssert();
	public LoginTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginTest = new LoginTest();
		loginPage = new LoginPage();
	}

	@Test()
	public void login() throws InterruptedException {
		sf.assertAll();
		loginPage.login();

	}

	//	@AfterMethod
	//	public void tearDow() {
	//		driver.close();
	//	}
}
