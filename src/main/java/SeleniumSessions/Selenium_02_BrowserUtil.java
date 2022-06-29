package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_02_BrowserUtil {

	public WebDriver driver;
	
	/**
	 * This method is launch the browser on the basis of browser name
	 * @param browser
	 * @return This will return the driver
	 */
	public WebDriver launchBrowser(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\taksh\\Dropbox\\My PC (LAPTOP-UJNUOGON)\\Downloads\\driver\\chromedriver_win32\\chromedriver.exe");
			 WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			//System.setProperty("webdriver.gecko.driver", "C:\\Users\\taksh\\Dropbox\\My PC (LAPTOP-UJNUOGON)\\Downloads\\driver\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			 WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver();
		}
		else 
		{
			System.out.println("Pass the right browser..." + browser);
		}
		return driver;
	}
	
	/**
	 * This method is used to enter the url
	 * @param url
	 */
	public void enterUrl(String url)
	{
		if(url==null)
		{
			System.out.println("Url is null...");
			return;
		}
		if(url.indexOf("https")==-1)
		{
			System.out.println("Url is missing...");
			return;
		}
		driver.get(url);
	}
	
	/**
	 * This method will return the current page url
	 * @return
	 */
	public String getCurrentUrl()
	{
		return driver.getCurrentUrl();
	}
	
	/**
	 * This method will return the page title
	 * @return
	 */
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	public void closeBrowser()
	{
		driver.close();
	}
	
	public void quitBrowser()
	{
		driver.quit();
	}
}

















