package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_07_LinksTextUtil {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		//you have to get the count of all the links/images on the page
		//return a list<String> -->this will hold the text of each link
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
//		List<WebElement> linksList = driver.findElements(By.tagName("a"));		
		
		By links = By.tagName("a");
		System.out.println(getElementsCount(links));
		
		List<String> actList = getElementTextList(links);
		for(String e : actList)
		{
			System.out.println(e);
		}
		
//		if(getElementTextList(links).contains("Sell"))
//		{
//			System.out.println("Sell link is present");
//		}
	}
	
	public static List<String> getElementTextList(By locator)
	{
		List<WebElement> eleList = getElements(locator);
		List<String> eleTextList = new ArrayList<String>();
		
		for(WebElement e : eleList)
		{
			String eleText = e.getText();
			if(!eleText.isEmpty())
			{
				eleTextList.add(eleText);
			}
		}
		return eleTextList;
	}
	public static int getElementsCount(By locator)
	{
		return getElements(locator).size();
	}
	
	public static List<WebElement> getElements(By locator)
	{
		return driver.findElements(locator);
	}

}
