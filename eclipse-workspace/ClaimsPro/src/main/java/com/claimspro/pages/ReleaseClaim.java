package com.claimspro.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Sleeper;

import com.claimspro.base.BaseClass;
import com.claimspro.utility.UtilsClass;

public class ReleaseClaim extends BaseClass {

	UtilsClass utility;

	@FindBy(xpath="//div[text()='Claims Management']")
	WebElement claimManagement;

	@FindBy(xpath="//button[text()='Create Claim']")
	WebElement createClaim;

	@FindBy(xpath="//input[@id='iii_claim_claims1_claim_roominitiateclaims1DateboxEx1-real']")
	WebElement dateOfOccurence;

	@FindBy(xpath="//input[@id='iii_claim_claims1_claim_roominitiateclaims1TextboxEx1']")
	WebElement policyNumber;

	@FindBy(xpath="//a[@id='iii_claim_claims1_claim_roominitiateclaims1A2']")
	WebElement search;

	@FindBy(xpath="//input[@id='iii_claim_claims1_claim_roominitiateclaims1DateboxEx2-real']")
	WebElement dateOfNotification;

	@FindBy(xpath="//input[@id='iii_claim_claims1_claim_roominitiateclaims1TextboxEx7']")
	WebElement notifierName;

	@FindBy(xpath="//input[@id='iii_claim_claims1_claim_roominitiateclaims1ComboboxEx5-real']")
	WebElement phoneType;

	@FindBy(xpath="//input[@id='iii_claim_claims1_claim_roominitiateclaims1TextboxEx8']")
	WebElement phoneNumber;

	@FindBy(xpath="//input[@id='iii_claim_claims1_claim_roominitiateclaims1ComboboxEx6-real']")
	WebElement notifierSource;

	@FindBy(xpath="//input[@id='iii_claim_claims1_claim_roominitiateclaims1ComboboxEx7-real']")
	WebElement method;

	@FindBy(xpath="//button[@id='iii_claim_claims1_claim_roominitiateclaims1initiateClaim']")
	WebElement initiateBtn;

	@FindBy(xpath="//button[text()='Continue to Add New']")
	WebElement continueToAddNew;

	@FindBy(xpath="//a//span[text()='Occurrence']")
	WebElement occurenceTab;

	@FindBy(xpath="//input[@id='iiii_claim_claims2_claim_rooms_roomclaimlosss1_claim_views_claimoccurrenceviewzuls1ComboboxEx2-real']")
	WebElement claimType;

	@FindBy(xpath="//button[text()='Vehicles']")
	WebElement vehiclesBtn;

	@FindBy(xpath="//button[text()='Add']")
	WebElement addBtn;

	@FindBy(xpath="//td[@title='2016 - Audi Updated - Q7 Updated | VIN 2435645']/preceding-sibling::td/div/span/input")
	WebElement vehicleSelect;

	@FindBy(xpath="//button[text()='Select']")
	WebElement selectBtn;

	@FindBy(xpath="//span[@id='iii_claim_claims2_claim_rooms_roomclaimvehicless1ToolbarPopupButton4-real']")
	WebElement moreActions;

	@FindBy(xpath="//a//span[text()='Release Claim']")
	WebElement releaseClaimLink;

	@FindBy(xpath="//button[text()='Yes']")
	WebElement yesBtn;

	@FindBy(xpath="//a[@id='iii_claim_claims2_claim_rooms_roomclaimlosss1saveButton']")
	WebElement saveBtn;

	@FindBy(xpath="//span[@id='ii_claim_claims3Label3']")
	WebElement claimNumber;

	@FindBy(xpath="//span[text()='Home']")
	WebElement homePage;

	@FindBy(xpath="//i[@id='iApplicationTab7-cls']")
	WebElement closeBtn;

	@FindBy(xpath="//button[text()='Search Claim']")
	WebElement searchClaimButton;

	@FindBy(xpath="//input[@id='iii_claim_search_searchclaims1_claim_search_claimsearchpanelzuls1TextboxEx1']")
	WebElement claimNumberSearchBox;

	@FindBy(xpath="//button[@id='iii_claim_search_searchclaims1_claim_search_claimsearchpanelzuls1search']")
	WebElement searchButton;

	public ReleaseClaim() {
		PageFactory.initElements(driver, this);
	}

	public void addVehicles() throws InterruptedException {
		vehiclesBtn.click();
		yesBtn.click();
		addBtn.click();
		vehicleSelect.click();
		Thread.sleep(3000);
		selectBtn.click();
	}



	public void createClaim(String DOC, String PolcyNumber, String NotifierName, String PhoneType, String PhoneNumber, String NotifierSource, String Method, String ClaimType) throws InterruptedException {
		claimManagement.click();
		createClaim.click();
		dateOfOccurence.sendKeys(DOC);
		Thread.sleep(5000);
		policyNumber.click();
		Thread.sleep(2000);
		policyNumber.sendKeys(PolcyNumber);
		Thread.sleep(2000);
		search.click();
		Thread.sleep(2000);
		dateOfNotification.clear();
		dateOfNotification.sendKeys("08/15/2019");
		notifierName.sendKeys(NotifierName);
		phoneType.sendKeys(PhoneType);
		phoneNumber.sendKeys(PhoneNumber);
		notifierSource.sendKeys(NotifierSource);
		method.sendKeys(Method);
		initiateBtn.click();	
		Thread.sleep(2000);
		continueToAddNew.click();
		Thread.sleep(5000);
		occurenceTab.click();
		claimType.sendKeys(ClaimType);
		Thread.sleep(2000);
		addVehicles();
		Thread.sleep(3000);
		moreActions.click();
		Thread.sleep(2000);
		UtilsClass.takeScreenshot("Release_Claim");
		Thread.sleep(2000);
		releaseClaimLink.click();
		Thread.sleep(2000);
		yesBtn.click();
		String text = claimNumber.getText();
		System.out.println("Claim Number is: "+text);
		//		homePage.click();
		//		closeBtn.click();
		utility = new UtilsClass();
		utility.closeClaimAllTab();
		searchClaimButton.click();
		claimNumberSearchBox.sendKeys(text);
		searchButton.click();				
	}

	public void releaseClaim() throws InterruptedException {
		claimManagement.click();
		createClaim.click();
		dateOfOccurence.sendKeys("02/22/2019");
		Thread.sleep(5000);
		policyNumber.click();
		Thread.sleep(2000);
		policyNumber.sendKeys("PA2000222");
		Thread.sleep(2000);
		search.click();
		Thread.sleep(2000);
		dateOfNotification.clear();
		dateOfNotification.sendKeys("08/15/2019");
		notifierName.sendKeys("Himanshu");
		phoneType.sendKeys("Cellular");
		phoneNumber.sendKeys("1234567890");
		notifierSource.sendKeys("Other");
		method.sendKeys("Other");
		initiateBtn.click();	
		Thread.sleep(2000);
		continueToAddNew.click();
		Thread.sleep(5000);
		occurenceTab.click();
		claimType.sendKeys("Glass");
		Thread.sleep(2000);
		addVehicles();
		Thread.sleep(3000);
		moreActions.click();
		Thread.sleep(2000);
		UtilsClass.takeScreenshot("Release_Claim");
		releaseClaimLink.click();
		Thread.sleep(2000);
		yesBtn.click();
		String text = claimNumber.getText();
		System.out.println("Claim Number is: "+text);
		utility = new UtilsClass();
		utility.closeClaimAllTab();
		searchClaimButton.click();
		claimNumberSearchBox.sendKeys(text);
		searchButton.click();
	}


}
