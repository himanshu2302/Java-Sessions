import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumDropDownNewPart {

	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();

		String monthXpath = "//select[@title='Month']";
		selectValue(monthXpath, "Feb");

	}

	public static void selectValue(String xpath, String value) {
		List<WebElement> elements = driver.findElements(By.xpath(xpath));
		for(int i=0;i<elements.size();i++) {
			String text = elements.get(i).getText();
			System.out.println(text);
			if(text.equals(value)) {
				elements.get(i).click();
			}

		}

	}
}
