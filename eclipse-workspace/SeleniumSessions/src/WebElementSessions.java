import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementSessions {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https:www.google.com");
		WebElement element = driver.findElement(By.xpath("//input[@name='q']"));
		element.sendKeys("facebook");

		element.clear();

		WebElement element2 = driver.findElement(By.xpath("//a[text()='Gmail']"));
		//driver.close();
		String text = element2.getText();
		System.out.println("Text of gmail link is : "+text);
		
		String tagName = element2.getTagName();
		System.out.println("Tagname of gmail link is : "+tagName);
		
		String attribute = element.getAttribute("class");
		System.out.println("Tag name of element is : "+attribute);
		
		String cssValue = element.getCssValue("class");
		System.out.println("CSS Value of element is : "+cssValue);
		
		boolean selected = element.isSelected();
		if(selected) {
			System.out.println("Element is selected");
		}
		else {
			System.out.println("Element is not selected");
		}
		
		boolean displayed = element.isDisplayed();
		if(displayed) {
			System.out.println("Element is displayed");
		}
		else {
			System.out.println("Element is not displayed");
		}
		
		boolean enabled = element.isEnabled();
		if(enabled) {
			System.out.println("Element is enabled");
		}
		else {
			System.out.println("Element is not enabled");
		}
		
		driver.close();


	}
}
