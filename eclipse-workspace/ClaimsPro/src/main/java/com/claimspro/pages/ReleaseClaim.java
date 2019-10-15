package com.claimspro.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Sleeper;

import com.claimspro.base.BaseClass;

public class ReleaseClaim extends BaseClass {

	
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
	
	@FindBy(xpath="//i[@id='iii_claim_claims2_claim_rooms_roomclaimlosss1ToolbarPopupButton4-icon']")
	WebElement moreActions;
	
	@FindBy(xpath="//a//span[text()='Release Claim']")
	WebElement releaseClaimLink;
	
	@FindBy(xpath="//button[text()='Yes']")
	WebElement yesBtn;
	
	public ReleaseClaim() {
		PageFactory.initElements(driver, this);
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
		moreActions.click();
		Thread.sleep(2000);
		releaseClaimLink.click();
		Thread.sleep(2000);
		yesBtn.click();
	}
	
	
}
