package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_04_LocatorConcept {

	static WebDriver driver;
	
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		//create the webelement + perform the action(click,sendkeys,gettext,isdisplaed,iseneabled)
		
		//1.id:
//		driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("test@123");
		
		//2.
//		WebElement email = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		
//		email.sendKeys("test@gmail.com");
//		password.sendKeys("test@123");
		
		
		//3.By locator
//		By username = By.id("input-email");
//		By password = By.id("input-password");
//		
//		WebElement email = driver.findElement(username);
//		WebElement pswd = driver.findElement(password);
//		
//		email.sendKeys("test@gmail.com");
//		pswd.sendKeys("test@123");
		
		
		//4.By locator with generic method(getElement())
//		By username = By.id("input-email");
//		By password = By.id("input-password");
//		
//		getElement(username).sendKeys("test@gmail.com");
//		getElement(password).sendKeys("test@123");
		
		//5.By locator with generic method(getElement() with actions method)
//		By username = By.id("input-email");
//		By password = By.id("input-password");
//		
//		doSendKeys(username,"test@gmail.com");
//		doSendKeys(password,"test@123");
		
		//6.ElementUtil class with generic method(getElement() with actions method)
//		By username = By.id("input-email");
//		By password = By.id("input-password");
//		
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendKeys(username, "test@gmail.com");
//		eleUtil.doSendKeys(password, "test@123");
		
		//7.String locator values:
		String userId = "input-email";
		String pswdId = "input-password";
		
		doSendKeys("id", userId, "test@gmail.com");
		doSendKeys("id",pswdId,"test@123");
	}
	
	public static By getBy(String locatorType,String locatorValue)
	{
		By locator = null;
		switch (locatorType.toLowerCase()) {
		case "id":
			locator = By.id(locatorValue);
			break;

		default:
			System.out.println("Enter the right locator..");
			break;
		}
		return locator;
	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	public static WebElement getElement(String locatorType,String locatorvalue)
	{
		return driver.findElement(getBy(locatorType,locatorvalue));
	}
	public static void doSendKeys(By locator,String value)
	{
		getElement(locator).sendKeys(value);
	}
	public static void doSendKeys(String locatorType,String locatorvalue,String value)
	{
		getElement(locatorType, locatorvalue).sendKeys(value);
	}
}
