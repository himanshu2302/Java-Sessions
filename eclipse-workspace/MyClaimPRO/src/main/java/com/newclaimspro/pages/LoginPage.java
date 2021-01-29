package com.newclaimspro.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.newclaimspro.base.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void login() throws InterruptedException {
		driver.findElement(By.xpath(prop.getProperty("username_xpath"))).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath(prop.getProperty("password_xpath"))).sendKeys(prop.getProperty("password"));
		Thread.sleep(3000);
		driver.findElement(By.xpath(prop.getProperty("loginBtn"))).click();
	}
}
