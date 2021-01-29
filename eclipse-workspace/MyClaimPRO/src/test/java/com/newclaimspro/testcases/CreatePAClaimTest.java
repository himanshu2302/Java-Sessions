package com.newclaimspro.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.newclaimspro.base.BaseClass;
import com.newclaimspro.pages.CreatePAClaim;
import com.newclaimspro.pages.LoginPage;
import com.newclaimspro.utility.ClaimUtility;

public class CreatePAClaimTest extends BaseClass {

	String sheetName = "claimtestdata";
	LoginPage loginPage;
	CreatePAClaim createPAClaim;
	public CreatePAClaimTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		createPAClaim = new CreatePAClaim();
	}

	@DataProvider
	public Object getData() {

		Object[][] data = ClaimUtility.getTestData("claimtestdata");
		return data;
	}

	//data driven from test data excel sheet
	@Test(priority=1, dataProvider="getData")
	public void createPAClaim(String OccurrenceDate, String PolicyNumber, String NotificationDate, String NotifierName, String PhoneType, String PhoneNumber, String Source, String Method) throws InterruptedException {
		loginPage.login();
		createPAClaim.createPAClaim(OccurrenceDate, PolicyNumber, NotificationDate, NotifierName, PhoneType, PhoneNumber, Source, Method);
	}

	//	@Test(priority=2)
	//	public void testTitle() {
	//		String title = createPAClaim.getTitle();
	//		Assert.assertEquals(title, "Sapiens ClaimsPro");
	//	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
