package com.claimspro.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.claimspro.base.BaseClass;

public class LoginPage extends BaseClass {

	@FindBy(xpath="//input[@id='iloginId']")
	WebElement un;
	
	@FindBy(xpath="//input[@id='ipassword']")
	WebElement pwd;
	
	@FindBy(xpath="//button[@id='iloginButton']")
	WebElement lgnBtn;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void login() {
		un.sendKeys(prop.getProperty("username"));
		pwd.sendKeys(prop.getProperty("password"));
		lgnBtn.click();
	}
	
}
