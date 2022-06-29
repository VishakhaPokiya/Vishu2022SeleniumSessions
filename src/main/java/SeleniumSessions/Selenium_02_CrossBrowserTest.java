package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_02_CrossBrowserTest {

	static WebDriver driver;
	
	public static void main(String[] args)
	{
		String browser = "chrome";
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\taksh\\Dropbox\\My PC (LAPTOP-UJNUOGON)\\Downloads\\driver\\chromedriver_win32\\chromedriver.exe");

			driver = new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\taksh\\Dropbox\\My PC (LAPTOP-UJNUOGON)\\Downloads\\driver\\geckodriver-v0.30.0-win64\\geckodriver.exe");

			driver = new FirefoxDriver();
		}
		else 
		{
			System.out.println("Pass the right browser..." + browser);
		}
		
		
		driver.get("https://www.google.com");//launch url
		String title = driver.getTitle();//get the title
		System.out.println(title);
	
		
		//validation point:(act vs exp)
		if(title.equals("Google"))
		{
			System.out.println("Pass--correct title");
		}
		else 
		{
			System.out.println("fail--incorrect title");
		}
		
		//automation steps + validation point ==> automation testing
		
		System.out.println(driver.getCurrentUrl());
		
		//driver.quit();//close the browser	
		driver.close();
	}
}
