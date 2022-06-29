package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_08_AttributeConcept {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
//		String hrefValue = driver.findElement(By.linkText("Amazon Devices")).getAttribute("href");
//		System.out.println(hrefValue);
		
		By amazonDeviceLink = By.linkText("Amazon Devices");
		String hrefValue = getAttributeValue(amazonDeviceLink, "href");
		if(hrefValue.contains("footer_device"))
		{
			System.out.println("This is correct href");
		}
	}

	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	public static String getAttributeValue(By locator,String attributeName)
	{
		String attrValue = getElement(locator).getAttribute(attributeName);
		System.out.println(attrValue);
		return attrValue;
	}
}
