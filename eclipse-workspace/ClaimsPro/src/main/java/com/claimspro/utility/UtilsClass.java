package com.claimspro.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.claimspro.base.BaseClass;

public class UtilsClass extends BaseClass {
	
	
	@FindBy(xpath="//li[@id='iApplicationTab4']")
	WebElement closeBtn;
	
	@FindBy(xpath="//span[text()='Close All Tabs']")
	WebElement closeAll;
	
	static Workbook book;
	static Sheet sheet;
	public static String TestData_Sheet_Path = "C:\\Users\\Himanshu.Dubey\\eclipse-workspace\\ClaimsPro\\src\\main\\java\\com\\claimspro\\testdata\\initiate_claim_testdata.xlsx";
	
	public UtilsClass() {
		PageFactory.initElements(driver, this);
	}
	public static void save() {
		driver.findElement(By.xpath("//a[@id='ii_party_partys1saveButton']")).click();
	}
	
	public void popUp() {
		Actions act = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//div[@id='iMenupopup1']"));
		act.contextClick(closeBtn).build().perform();
	}
	
	public void popOut() {
		popUp();
		driver.findElement(By.xpath("//a//span[text()='Popout']")).click();
	}
	
	public void closeCurrentTab() {
		popUp();
		driver.findElement(By.xpath("//a//span[text()='Close Current Tab']")).click();
	}
	
	public void closeAllTab() {
		popUp();
		driver.findElement(By.xpath("//a//span[text()='Close All Tabs']")).click();
	}
	
	public static Object[][] initiateClaimTestData(String testdata) {
		FileInputStream file =null;
		try {
			file = new FileInputStream(TestData_Sheet_Path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}
		sheet =  book.getSheet(testdata);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for(int i=0; i<sheet.getLastRowNum();i++) {
			for(int k=0; k<sheet.getRow(0).getLastCellNum();k++) {
				data[i][k] = sheet.getRow(i+1).getCell(k).toString();
			}
		}
		return data;
	}
	
	
	public void getTestData() {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		
		System.out.println("Enter an integer: ");
		a = sc.nextInt();
		
		b=1;
		for(int i=0; i<=a;i++) {
			
			
		}
		
		
	}
	


}
