import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPropertieFile {
	public static void main(String[] args) throws IOException {

		WebDriver driver;

		//creating object for Properties class from java.util package by using which we can read the config file data.
		Properties prop = new Properties();

		//This class will connect to properties class
		FileInputStream fis = new FileInputStream("C:\\Users\\Himanshu.Dubey\\eclipse-workspace\\SeleniumSessions\\src\\config.properties");

		//loading the file
		prop.load(fis);

		String property = prop.getProperty("URL");
		System.out.println("Url is : "+property);

		String browser = prop.getProperty("browser");

		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (2)\\chromedriver.exe");
			driver= new ChromeDriver();

			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			driver.get(property);

			prop.getProperty("register");

			prop.getProperty("firtsname");
			prop.getProperty("lastname");

			driver.findElement(By.xpath(prop.getProperty("register"))).click();

			driver.findElement(By.xpath(prop.getProperty("firstname"))).sendKeys("Tom");

			driver.findElement(By.xpath(prop.getProperty("lastname"))).sendKeys("Alter");
		}

	}
}
