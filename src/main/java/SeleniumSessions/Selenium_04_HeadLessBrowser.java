package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_04_HeadLessBrowser {

	public static void main(String[] args) {
		
		//headless:
		//no browser launch(not visible)/hidden browser
		//testing is happening behind the scene
		//faster
		
		WebDriverManager.chromedriver().setup();
//		WebDriverManager.firefoxdriver().setup();

		
		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--headless");
		co.addArguments("--incognito");

		WebDriver driver = new ChromeDriver(co);
		
//		FirefoxOptions fo = new FirefoxOptions();
//		fo.addArguments("--headless");
//		WebDriver driver = new FirefoxDriver(fo);
		
		driver.get("https://www.amazon.com");

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		
		driver.quit();
		
	}

}
