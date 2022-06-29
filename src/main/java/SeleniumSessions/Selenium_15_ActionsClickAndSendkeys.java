package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_15_ActionsClickAndSendkeys {

	static WebDriver driver;
	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
		Actions action = new Actions(driver);
		
//		WebElement firstName = driver.findElement(By.id("input-firstname"));
//		WebElement lastName = driver.findElement(By.id("input-lastname"));
		
//		action.sendKeys(firstName, "Naveen").build().perform();
//		action.sendKeys(lastName,"Patel").build().perform();
		
		/**
		 * Equivalent to calling:Actions.click(element).sendKeys(keysToSend)
		 * This method is different form WebElement.sendKeyd(CharSequence)
		 * see SendKeys(CharSequence) for details how.
		 */
		
		By checkBox = By.name("agree");
		
//		action.click(firstName).sendKeys("Naveen").build().perform();
//		action.click(lastName).sendKeys("Patel").build().perform();
//		action.click(driver.findElement(checkBox)).build().perform();
//		action.moveToElement(driver.findElement(checkBox)).click().build().perform();
		
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		
		
//		doActionsSendKeys(firstName, "Naveen");
//		doActionsSendKeysOnActiveEle(lastName, "Patel");
//		doActionsClick(checkBox);
		doActionsMoveToElementCLick(checkBox);
	}

	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	public static void doActionsSendKeys(By locator , String value)
	{
		Actions action = new Actions(driver);
		action.sendKeys(getElement(locator), value).build().perform();
	}
	public static void doActionsSendKeysOnActiveEle(By locator,String value)
	{
		Actions action = new Actions(driver);
		action.click(getElement(locator)).sendKeys(value).build().perform();
	}
	
	/*
	 * Clicks in the middle of the given element. 
	 * Equivalent to: Actions.moveToElement(onElement).click()
	 */
	
	public static void doActionsClick(By locator)
	{
		Actions action = new Actions(driver);
		action.click(getElement(locator)).build().perform();
	}
	public static void doActionsMoveToElementCLick(By locator)
	{
		Actions action = new Actions(driver);
		action.moveToElement(getElement(locator)).click().build().perform();
	}
}
