import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumSessions {
	public static void main(String[] args) {

		//launching chrome browserz
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (2)\\chromedriver.exe");
		//System.setProperty("webdriver.firefox.driver", "D:\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver2 = new FirefoxDriver();

		//naviagting url
		driver.get("http://www.google.com");

        //fetching nad printing title of the web page
		String title = driver.getTitle();
		System.out.println("Title of the Google page is : " +title);
		
		//validation of the tilte
		if(title.equals("Google"))
		{
			System.out.println("Title is correct");
		}
		else {
			System.out.println("Title is incorrect");
		}
        
		//fetching and prinitng current url of the webpage
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL of webpage is: "+currentUrl);
        
		//fetching and printing window handle id of current web page
		String windowHandle = driver.getWindowHandle();
		System.out.println("Window handle id of current window is : " +windowHandle);

		Set<String> windowHandles = driver.getWindowHandles();
		
		//closing the browser
		//driver.close();
	}
}







