package com.newclaimspro.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.newclaimspro.base.BaseClass;
import com.newclaimspro.utility.ClaimUtility;

public class CreatePAClaim extends BaseClass {

	@FindBy(xpath="//div[text()='Claims Management']")
	WebElement claimsManagement;

	@FindBy(xpath="//button[text()='Create Claim']")
	WebElement createClaimBtn;

	@FindBy(xpath="//span[text()='Occurrence']/../../../following-sibling::div//span[contains(text(),'Occurrence') and contains(text(),'Date')]/../following-sibling::div/span/input")
	WebElement dateOfOccurrence;

	@FindBy(xpath="//div[text()='Policy ']/../../following-sibling::div//span[contains(text(),'Policy') and contains(text(),'Number')]/../following-sibling::div//input")
	WebElement policyNumber;

	@FindBy(xpath="//div[text()='Policy ']/child::div//a[@title='Search']")
	WebElement searchPolicyLink;

	@FindBy(xpath="//span[text()='Notification']/../../../following-sibling::div[1]//span[contains(text(),'Date')]/../following-sibling::div//input")
	WebElement notificationDate;

	@FindBy(xpath="//span[text()='Notification']/../../../following-sibling::div[2]//span[contains(text(),'Name')]/../following-sibling::div//input")
	WebElement notifierName;

	@FindBy(xpath="//span[text()='Notification']/../../../following-sibling::div[2]//span[contains(text(),'Phone') and contains(text(),'Type')]/../following-sibling::div//input")
	WebElement phoneType;

	@FindBy(xpath="//span[text()='Notification']/../../../following-sibling::div[2]//span[contains(text(),'Source')]/../following-sibling::div//input")
	WebElement notificationSource;

	@FindBy(xpath="//span[text()='Notification']/../../../following-sibling::div[2]//span[contains(text(),'Method')]/../following-sibling::div//input")
	WebElement notificationMethod;

	@FindBy(xpath="//span[text()='Notification']/../../../following-sibling::div[2]//span[contains(text(),'Phone') and contains(text(),'Number')]/../following-sibling::div//input")
	WebElement phoneNumber;

	@FindBy(xpath="//button[text()='Initiate']")
	WebElement initiatBtn;


	public CreatePAClaim() {
		PageFactory.initElements(driver, this);
	}

	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	public void createPAClaim(String occ, String polcyNum, String notDate, String notName, String phonType, String phnNumb, String method, String source) throws InterruptedException {
		claimsManagement.click();
		createClaimBtn.click();
		dateOfOccurrence.sendKeys(occ);
		Thread.sleep(10000);
		policyNumber.click();
		Thread.sleep(5000);
		policyNumber.sendKeys(polcyNum);
		Thread.sleep(10000);
		searchPolicyLink.click();
		Thread.sleep(2000);
		notificationDate.sendKeys(notDate);
		notifierName.sendKeys(notName);
		phoneType.sendKeys(phonType);
		phoneNumber.sendKeys(phnNumb);
		notificationSource.sendKeys(source);
		notificationMethod.sendKeys(method);
		Thread.sleep(3000);
		initiatBtn.click();




	}
}
