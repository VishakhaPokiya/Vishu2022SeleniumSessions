package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_15_MoveToElementConcept {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
//		WebElement parentMenu = driver.findElement(By.xpath("//div[text()='Add-ons']"));
//		
//		Actions action = new Actions(driver);
//		action.moveToElement(parentMenu).build().perform();
//		
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("//div[text()='SpiceMAX']")).click();
		
		By parentMenu = By.xpath("//div[text()='Add-ons']");
		By childMenu = By.xpath("//div[text()='SpiceMAX']");
		
		doClickOnChildMenyu(parentMenu, childMenu);
	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}

	public static void doMoveToElement(By locator)
	{
		Actions action = new Actions(driver);
		action.moveToElement(getElement(locator)).build().perform();
	}
	public static void doClickOnChildMenyu(By parentMenuLocator,By childMenuLocator) throws InterruptedException
	{
		doMoveToElement(parentMenuLocator);
		Thread.sleep(3000);
		getElement(childMenuLocator).click();
	}
}
