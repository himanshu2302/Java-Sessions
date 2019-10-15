package com.claimspro.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.claimspro.base.BaseClass;
import com.claimspro.pages.LoginPage;
import com.claimspro.pages.ReleaseClaim;
import com.claimspro.utility.UtilsClass;

public class ReleaseClaimTest extends BaseClass{

	LoginPage loginPage;
	ReleaseClaim releaseClaim;
	String testdata = "testdata";
	UtilsClass utility = new UtilsClass();

	public ReleaseClaimTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		releaseClaim = new ReleaseClaim();
	}

	@DataProvider
	public Object[][] getTestData() {
		Object[][] testData = UtilsClass.initiateClaimTestData(testdata);
		return testData;
	}

	@Test(dataProvider="getTestData")
	public void releaseClaimTest(String DOC, String PolcyNumber, String NotifierName, String PhoneType, String PhoneNumber, String NotifierSource, String Method, String ClaimType) throws InterruptedException {
		loginPage.login();
		releaseClaim.createClaim(DOC, PolcyNumber, NotifierName, PhoneType, PhoneNumber, NotifierSource, Method, ClaimType);
	}


	@AfterMethod
	public void tearDown() {
		//		driver.close();
		utility.closeAllTab();
	}
}

