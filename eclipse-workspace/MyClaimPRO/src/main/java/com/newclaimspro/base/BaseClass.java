package com.newclaimspro.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.newclaimspro.utility.WebEventListener;

public class BaseClass {

	public static Properties prop;
	public static WebDriver driver;
	public static EventFiringWebDriver eventDriver;
	public static WebEventListener eventListener;

	public BaseClass() {

		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\Himanshu.Dubey\\eclipse-workspace\\MyClaimPRO\\src\\main\\java\\com\\newclaimspro\\config\\config.properties");
			prop.load(fis);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void initialization() {
		if(prop.getProperty("browser").equals("chrome")) {
			System.setProperty("wedriver.chrome.driver", "D:\\chromedriver_win32 (2)\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		eventDriver = new EventFiringWebDriver(driver);
		eventListener = new WebEventListener();
		eventDriver.register(eventListener);
		driver = eventDriver;

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));



	}
}
