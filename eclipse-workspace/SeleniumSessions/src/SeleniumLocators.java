import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:www.google.com");
		//by name
		WebElement nameElement = driver.findElement(By.name(""));
		System.out.println("");
		
		//by id
		WebElement idElement = driver.findElement(By.id(""));
		System.out.println("");
		
		//by className
		WebElement classNameElement = driver.findElement(By.className(""));
		System.out.println("");
		
		//by xpath
		WebElement xpathElement = driver.findElement(By.xpath(""));
		System.out.println("Xpath Element");
		
	}
}
