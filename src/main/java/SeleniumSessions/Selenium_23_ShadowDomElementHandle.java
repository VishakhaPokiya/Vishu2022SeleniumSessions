package SeleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_23_ShadowDomElementHandle {

	public static void main(String[] args)
	{
		
		//br-->page-->frame-->shadowDom-->element
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		driver.switchTo().frame("pact");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement tea = (WebElement)jse.executeScript("return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\")");

		tea.sendKeys("masala");
	
	
	}
}
