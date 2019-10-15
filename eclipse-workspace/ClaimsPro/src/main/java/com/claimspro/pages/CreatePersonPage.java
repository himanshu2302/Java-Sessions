package com.claimspro.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.claimspro.base.BaseClass;
import com.claimspro.utility.UtilsClass;

public class CreatePersonPage extends BaseClass {
	
	@FindBy(xpath="//div[text()='Customer Management']")
	WebElement customerManagement;
	
	@FindBy(xpath="//button[text()='Create Person']")
	WebElement createPerson;
	
	@FindBy(xpath="//input[@id='iiii_party_partys1_party_roomcustomerinfos1_party_generalzuls1firstName']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@id='iiii_party_partys1_party_roomcustomerinfos1_party_generalzuls1lastName']")
	WebElement lastName;
	
	@FindBy(xpath="//input[@id='iiiii_party_partys1_party_roomcustomerinfos1_party_generalzuls1s1taxIdUnavailable-real']")
	WebElement taxId;
	
	@FindBy(xpath="//button[@id='ii_party_partys1RoomNavitem4']")
	WebElement roles;
	
	@FindBy(xpath="//input[@id='iii_party_partys1_party_roomroless1roleType-real']")
	WebElement roleType;
	
	@FindBy(xpath="//button[@id='iii_party_partys1_party_roomroless1addRole']")
	WebElement addBtn;
	
	@FindBy(xpath="//td[@class='z-toolbar-horizontal']//button[@id='iiii_party_partys1_party_roomroless1s1add']")
	WebElement addBtn2;
	
	@FindBy(xpath="//input[@id='iiii_party_partys1_party_roomroless1s2jurisdiction-real']")
	WebElement jurisdiction;
	
	@FindBy(xpath="//input[@id='iiii_party_partys1_party_roomroless1s2serviceNumber']")
	WebElement serviceNumber;
	
	@FindBy(xpath="//span[@id='iiii_party_partys1_party_roomroless1s2Listitem42-cm']")
	WebElement LOB;
	
	
	public CreatePersonPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void createPerson() throws InterruptedException {
		customerManagement.click();
		createPerson.click();
		firstName.sendKeys("Test");
		lastName.sendKeys("User");
		taxId.click();
		UtilsClass.save();
		roles.click();
		roleType.sendKeys("Third Party Administrator");
		Thread.sleep(10000);
		addBtn.click();
		Thread.sleep(10000);
		addBtn2.click();
		
		jurisdiction.sendKeys("California");
		serviceNumber.sendKeys("123456");
		LOB.click();
		UtilsClass.save();
		
	}
	
	
	
	
	

}
