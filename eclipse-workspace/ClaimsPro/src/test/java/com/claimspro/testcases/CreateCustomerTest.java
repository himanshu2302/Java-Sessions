package com.claimspro.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.claimspro.base.BaseClass;
import com.claimspro.pages.CustomerPage;
import com.claimspro.pages.LoginPage;

public class CreateCustomerTest extends BaseClass {

	
	LoginPage loginPage;
	CustomerPage createPersonPage;
	
	public CreateCustomerTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		createPersonPage = new CustomerPage();
	}
	
	@Test
	public void creatPersonTest() throws InterruptedException {
		loginPage.login();
		createPersonPage.createPerson();
	}
	
	
//	@AfterMethod
//	public void tearDown() {
//		driver.close();
//	}
}
