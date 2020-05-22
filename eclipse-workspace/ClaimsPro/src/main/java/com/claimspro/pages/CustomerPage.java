package com.claimspro.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.claimspro.base.BaseClass;
import com.claimspro.utility.UtilsClass;

public class CustomerPage extends BaseClass {
	
	UtilsClass utility = new UtilsClass();
	
	@FindBy(xpath="//div[text()='Customer Management']")
	WebElement customerManagement;
	
	@FindBy(xpath="//button[text()='Create Person']")
	WebElement createPerson;
	
	@FindBy(xpath="//input[@id='iiii_party_partys1_party_roomcustomerinfos1_party_generalzuls1firstName']")
	WebElement personFirstName;
	
	@FindBy(xpath="//input[@id='iiii_party_partys1_party_roomcustomerinfos1_party_generalzuls1lastName']")
	WebElement personLastName;
	
	@FindBy(xpath="//input[@id='iiiii_party_partys1_party_roomcustomerinfos1_party_generalzuls1s1taxIdUnavailable-real']")
	WebElement taxId;
	
	@FindBy(xpath="//button[text()='Create Organization']")
	WebElement createOrg;
	
	@FindBy(xpath="//input[@id='iiii_party_partys1_party_roomcustomerinfos1_party_generalzuls1TextboxEx1']")
	WebElement orgName;
	
	
	
	public CustomerPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void createPerson() throws InterruptedException {
		customerManagement.click();
		createPerson.click();
		personFirstName.sendKeys("Test");
		personLastName.sendKeys("User");
		taxId.click();
		Thread.sleep(5000);
		utility.saveCustomer();
		Thread.sleep(5000);
		utility.getCustomerNumber();
		utility.closeCustomerAllTab();
		utility.searchCustomer();
	}	
	
	public void creatOrg() {
		customerManagement.click();
		createOrg.click();
		orgName.sendKeys("Test Organization");
		taxId.click();
		utility.saveCustomer();
		utility.getCustomerNumber();
	}

}
