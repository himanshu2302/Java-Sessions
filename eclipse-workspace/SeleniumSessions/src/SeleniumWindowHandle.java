import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWindowHandle {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


	driver.get("https://www.facebook.com/");
}
}
