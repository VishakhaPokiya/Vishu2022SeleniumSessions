package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Selenium_05_RegPageTest {

	public static void main(String[] args) throws InterruptedException {
		
		Selenium_02_BrowserUtil broUtil = new Selenium_02_BrowserUtil();
		WebDriver driver = broUtil.launchBrowser("chrome");
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		String title = driver.getTitle();
		System.out.println(title);
		
		By userName = By.id("input-email");
		By password = By.id("input-password");
		
		Selenium_05_ElementUtil eleUtil = new Selenium_05_ElementUtil(driver);
		eleUtil.doSendKeys(userName, "test@gmail.com");
		eleUtil.doSendKeys(password, "test@123");
		
		Thread.sleep(5000);
		
		broUtil.closeBrowser();
	}

}
