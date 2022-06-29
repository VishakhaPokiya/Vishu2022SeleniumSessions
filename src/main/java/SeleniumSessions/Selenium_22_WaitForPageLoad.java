package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_22_WaitForPageLoad {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://api.cogmento.com/register/");
		
		driver.findElement(By.partialLinkText("Log in here")).click();
		
		Selenium_19_JavaScriptUtil jsUtil = new Selenium_19_JavaScriptUtil(driver);
		jsUtil.waitForpageLoad();
		
		driver.findElement(By.name("email")).sendKeys("testing");
		
	}

}
