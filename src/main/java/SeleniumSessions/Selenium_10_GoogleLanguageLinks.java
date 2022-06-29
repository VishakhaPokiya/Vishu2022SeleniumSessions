package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_10_GoogleLanguageLinks {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.google.co.in/");

		By langLink = By.xpath("//div[@id='SIvCob']//a");//9
		clickOnElement(langLink, "मराठी");
		
		List<String> langTextList = getLinksTextList(langLink);
		if(langTextList.contains("मराठी"))
		{
			System.out.println("मराठी is present");
		}
	}
	
	public static List<String> getLinksTextList(By locator)
	{
		List<WebElement> linksList = driver.findElements(By.xpath("//div[@id='SIvCob']//a"));
		List<String> linksTextList = new ArrayList<String>();
		
		for(WebElement e : linksList)
		{
			String text = e.getText();	
			linksTextList.add(text);
		}
		return linksTextList;
	}
	public static void clickOnElement(By locator,String value)
	{
		List<WebElement> langList = driver.findElements(By.xpath("//div[@id='SIvCob']//a"));
		System.out.println(langList.size());
		
		for(WebElement e : langList)
		{
			String text = e.getText();
//			System.out.println(text);
			if(text.equals(value))
			{
				e.click();
				break;
			}
		}
	}
}
