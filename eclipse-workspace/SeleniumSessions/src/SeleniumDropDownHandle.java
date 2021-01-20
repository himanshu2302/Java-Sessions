import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumDropDownHandle {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();

		WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
		WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
		WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));

		Select sel = new Select(day);
		//		sel.selectByValue("23");

		//		String dob = "17-1-1960";
		//		String dobArr[] = dob.split("-");
		//		selectValue(day, dobArr[0]);
		//		selectValue(month, dobArr[1]);
		//		selectValue(year, dobArr[2]);

		List<WebElement> days = sel.getOptions();
		System.out.println("Total days are : "+days.size());

		for(int i=0;i<=31;i++) {
			String text = days.get(i).getText();
			System.out.println(text);
			if(text.equals("23")) {
				days.get(i).click();
				break;
			}
		}


	}

	public static void selectValue(WebElement element, String value) {
		Select sel = new Select(element);
		sel.selectByValue(value);

	}
}
