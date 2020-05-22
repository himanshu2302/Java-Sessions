package com.claimspro.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.commons.compress.compressors.FileNameUtil;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.claimspro.base.BaseClass;

public class UtilsClass extends BaseClass {


	@FindBy(xpath="//li[@id='iApplicationTab4']")
	WebElement closeBtn;

	@FindBy(xpath="//span[text()='Close All Tabs']")
	WebElement closeAll;

	@FindBy(xpath="//li[@id='iApplicationTab4']")
	WebElement claimTab;

	@FindBy(xpath="//li[@class='applicationTab z-tab z-tab-selected']")
	WebElement personTab;

	@FindBy(xpath="//a[@id='iMenuitem3-a']")
	WebElement closeAllBtn;

	@FindBy(xpath="//div[@class='headerSectionWrapper z-hlayout']/div/div[@class='contextToolBar z-toolbar']/div[@class='z-toolbar-content z-toolbar-end']/a[@title='Save']")
	WebElement saveBtn;

	@FindBy(xpath="//span[text()='Customer']/parent::div/following-sibling::div/span[@class='applicationTab-line2']")
	WebElement uniqueCustomerNumber;

	@FindBy(xpath="//button[text()='Search Customer']")
	WebElement searchCustomerBtn;

	@FindBy(xpath="//span[text()='Name']/parent::div/following-sibling::div/input")
	WebElement searchCustomerTextBox;

	@FindBy(xpath="//span[text()='Name']/../../../following-sibling::div[@style='display:none;padding-bottom:5px']/following-sibling::div/div/div[2]/div/div[2]/input")
	WebElement searchCustomerNumberBox;

	@FindBy(xpath="//button[@class='formButton z-button'][text()='Search']")
	WebElement searchBtn;

	String text;
	static Workbook book;
	static Sheet sheet;
	public static String testData = "C:\\Users\\Himanshu.Dubey\\eclipse-workspace\\ClaimsPro\\src\\main\\java\\com\\claimspro\\testdata\\initiate_claim_testdata.xlsx";
	public static String reserveTestData = "C:\\Users\\Himanshu.Dubey\\eclipse-workspace\\ClaimsPro\\src\\main\\java\\com\\claimspro\\testdata\\Reserve_Data.xlsx";


	//**Constructor for initializing the page objects**
	public UtilsClass() {
		PageFactory.initElements(driver, this);
	}

	//**Saving the Customer details**
	public void saveCustomer() {
		saveBtn.click();
	}

	//**Fetching unique customer number**

	public void getCustomerNumber() {
		text = uniqueCustomerNumber.getText();
		System.out.println("Customer number is: " + text);
	}

	//**Closing all tabs for Claims**
	public void closeClaimAllTab() throws InterruptedException {
		Actions act = new Actions(driver);
		act.contextClick(claimTab).build().perform();
		Thread.sleep(5000);
		closeAllBtn.click();
	}


	//**Closing all tabs for Customer**
	public void closeCustomerAllTab() throws InterruptedException {
		Actions act = new Actions(driver);
		act.contextClick(personTab).build().perform();
		Thread.sleep(5000);
		closeAllBtn.click();
	}

	//**Searching the customer**
	public void searchCustomer() {
		searchCustomerBtn.click();
		searchCustomerNumberBox.sendKeys(text);
		searchBtn.click();
	}


	//**Getting test data to initiate PA claim**
	public static Object[][] initiateClaimTestData(String initiateClaimData) {
		FileInputStream file =null;
		try {
			file = new FileInputStream(testData);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		}

		catch (IOException e) {
			e.printStackTrace();
		}
		sheet =  book.getSheet(initiateClaimData);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for(int i=0; i<sheet.getLastRowNum();i++) {
			for(int k=0; k<sheet.getRow(0).getLastCellNum();k++) {
				data[i][k] = sheet.getRow(i+1).getCell(k).toString();
			}
		}
		return data;
	}

	public static Object[][] openReserveTestData(String reserveData) {
		FileInputStream file =null;
		try {
			file = new FileInputStream(testData);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		}

		catch (IOException e) {
			e.printStackTrace();
		}
		sheet =  book.getSheet(reserveData);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for(int i=0; i<sheet.getLastRowNum();i++) {
			for(int k=0; k<sheet.getRow(0).getLastCellNum();k++) {
				data[i][k] = sheet.getRow(i+1).getCell(k).toString();
			}
		}
		return data;
	}

	public static void takeScreenshot(String fileName) {
		FileInputStream inputFile=null;
		FileOutputStream outputFile=null;
		TakesScreenshot srcShot = ((TakesScreenshot)driver);
		try {
			File screenshotAs = srcShot.getScreenshotAs(OutputType.FILE);
			File destinationFile = new File("C:\\Users\\Himanshu.Dubey\\eclipse-workspace\\ClaimsPro\\test-output\\ScreenshotFolder\\"+fileName+".jpg");
			
			inputFile = new FileInputStream(screenshotAs);
			outputFile = new FileOutputStream(destinationFile);

			byte[] buffer = new byte[1024];
			int length;
			while((length=inputFile.read(buffer))>0) {
				outputFile.write(buffer, 0, length);

			}
			inputFile.close();
			outputFile.close();
			System.out.println("File Copied Successfully");
		}
		catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}

	}
	
	public void genericWait() {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		
	}


}
