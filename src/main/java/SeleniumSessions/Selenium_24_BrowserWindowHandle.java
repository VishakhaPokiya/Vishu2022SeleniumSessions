package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_24_BrowserWindowHandle {

	public static void main(String[] args) {

		//browser window pop up/new tab window/new browser window
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");//parent window
		
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();//child window
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		
		String parentWindowId = it.next();
		System.out.println("Parent Window id : " + parentWindowId);
		
		//ChildWindow :
		String childWindowId = it.next();
		System.out.println("Child Window Id : " + childWindowId);

		//switching:
		driver.switchTo().window(childWindowId);
		String childUrl = driver.getCurrentUrl();
		System.out.println("Child window url :" + childUrl);
		
		driver.close();//close the parent window
		
		driver.switchTo().window(parentWindowId);
		String parentUrl = driver.getCurrentUrl();
		System.out.println("Parent Window url :" + parentUrl);
	}

}
