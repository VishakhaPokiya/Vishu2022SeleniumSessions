package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_17_WaitForNonWebElements {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");

		Thread.sleep(5000);
		driver.findElement(By.cssSelector("div#contact-link a")).click();

		if (waitForUrlToContains("controller=contact", 10)) {
			System.out.println("url is correct");
		}
		
		String title = doGetTitle("My Store", 10);
		System.out.println(title);
	}
	public static String doGetTitle(String title,int tileOut)
	{
		if(waitForTitleToBe(title, tileOut))
		{
			return driver.getTitle();
		}
		return null;
	}
	
	public static String doGetTitleWithFraction(String titleFraction, int timeOut) 
	{
		if (waitForTitleContains(titleFraction, timeOut))
		{
			return driver.getTitle();
		}
		return null;
	}

	public static boolean waitForTitleContains(String titleFrcation, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.titleContains(titleFrcation));
	}
	public static boolean waitForTitleToBe(String titleFrcation, int timeOut)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.titleIs(titleFrcation));
	}

	public static boolean waitForUrlToContains(String urlFraction, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.urlContains(urlFraction));
	}

	public static boolean waitForUrlToBe(String urlFraction, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.urlToBe(urlFraction));
	}
}
