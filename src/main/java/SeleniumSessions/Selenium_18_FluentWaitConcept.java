package SeleniumSessions;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_18_FluentWaitConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		// WebDriverWait(C) --> FlentWait(C) --> Wait(I) --> until()

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");

		By emailId = By.id("input-email11");

		waitForElementPresentUsingFluentWait(emailId, 10, 2).sendKeys("vamikaPatel@gmail.com");
	}

	public static WebElement waitForElementPresentUsingFluentWait(By locator, int timeOut, long pollingTime) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeOut))
				.pollingEvery(Duration.ofSeconds(pollingTime))
				.ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class)
				.withMessage("Element is not found...");

		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public static WebElement waitForELementPresentUsingWebDriverWait(By locator,int timeOut,long pollingTime)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait
			.withTimeout(Duration.ofSeconds(timeOut))
			.pollingEvery(Duration.ofSeconds(pollingTime))
			.ignoring(NoSuchElementException.class)
			.ignoring(StaleElementReferenceException.class)
			.withMessage("Element is not found...");
		
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));																		
	}
}
