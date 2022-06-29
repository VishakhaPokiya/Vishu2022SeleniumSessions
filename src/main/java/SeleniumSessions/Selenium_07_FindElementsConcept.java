package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_07_FindElementsConcept {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		//you have to get the count of all the links/image on the page
		//then print the text of each link on the console
		//avoid blank text
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
//		List<WebElement> linksList = driver.findElements(By.tagName("a"));		
//		System.out.println("Total links : " + linksList.size());
		
		By name = By.tagName("a");
		List<WebElement> linksList = getElements(name);
		System.out.println(linksList.size());
		
//		for(int i = 0 ; i<linksList.size() ; i++)
//		{
//			 String text = linksList.get(i).getText();
//			 if(!text.isEmpty())
//			 {
//				 System.out.println(text);
//			 }
//		}
		
		//for each:
		for(WebElement e : linksList)
		{
			String text = e.getText();
			if(!text.isEmpty())
			{
				System.out.println(text);
			}
		}	
		
	}

	
	public static List<WebElement> getElements(By locator)
	{
		return driver.findElements(locator);
	}
}
