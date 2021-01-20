import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumExplicitWait {

	//creating a method for explicit wait for login button to be clicked. this is generic method which we can use for multiple objects.
	public static void explicitWaitMethod(WebDriver driver, WebElement element, int timeout) {
		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(element));
		element.click();

	}
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


		driver.get("https://www.facebook.com/");

		WebElement element = driver.findElement(By.xpath("//button[@name='login']"));
		WebElement element2 = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));

		//calling the static method
		explicitWaitMethod(driver, element, 20);	

		explicitWaitMethod(driver, element2, 40);


	}
}
