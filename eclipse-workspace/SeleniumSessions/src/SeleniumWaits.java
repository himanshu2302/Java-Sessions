import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWaits {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

        //deleting all cookies before execution
		driver.manage().deleteAllCookies();
		
		//maximizing the window
		driver.manage().window().maximize();
		
		//providing implicit wait. global wait. applicable for all elements.
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//providing page load time out. to wait for maximum 40 seconds before any execution
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.get("https://www.ebay.com/");
	}
}
