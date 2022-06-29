package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_24_HeadLessBrowser {

	public static void main(String[] args) {

		//headless -- no browser
		//testing behind the scene
		//faster
		
		WebDriverManager.chromedriver().setup();
//		WebDriverManager.firefoxdriver().setup();
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless");
//		co.addArguments("--incognito");
		
//		FirefoxOptions fo = new FirefoxOptions();
//		fo.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(co);
//		WebDriver driver = new FirefoxDriver(fo);

		driver.get("https://www.amazon.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.quit();
	}

}
