package com.claimspro.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.claimspro.base.BaseClass;
import com.claimspro.pages.CreatePersonPage;
import com.claimspro.pages.LoginPage;

public class CreatePersonTest extends BaseClass {

	
	LoginPage loginPage;
	CreatePersonPage createPersonPage;
	
	public CreatePersonTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		createPersonPage = new CreatePersonPage();
	}
	
	@Test
	public void creatPersonTest() throws InterruptedException {
		loginPage.login();
		createPersonPage.createPerson();
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
