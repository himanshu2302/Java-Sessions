import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumActionsClass {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

//		driver.get("https://www.spicejet.com/");
//
//		WebElement addOnElement = driver.findElement(By.xpath("//a[text()='Add-Ons']"));
//
		//Actions class in which we pass webdriver object
		//Actions act = new Actions(driver);
//
//		//Actions class having moveToElement method for mouse hover on the passed element
//		act.moveToElement(addOnElement).build().perform();
//
//		//then clicking on object after mouse hover
//		driver.findElement(By.xpath("//a[text()='SpiceMAX ']")).click();

		//new url for drag and drop action
		driver.get("https://jqueryui.com/droppable/");

		driver.switchTo().frame(0);
		
		Actions act = new Actions(driver);
		

		WebElement dragElement = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement dropElement = driver.findElement(By.xpath("//p[text()='Drop here']"));

		//dragging and dropping the elements
		//act.dragAndDrop(dragElement, dropElement).build().perform();
		
		act.clickAndHold(dragElement).moveToElement(dropElement).release().build().perform();

	}
}
