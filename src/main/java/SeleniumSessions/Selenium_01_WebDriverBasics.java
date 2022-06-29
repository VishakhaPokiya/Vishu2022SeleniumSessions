package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_01_WebDriverBasics {

	public static void main(String[] args)
	{
		//open Chrome
		//enter url
		//get the title->validation point(act vs exp)
		//get the url
		//close the browser
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\taksh\\Dropbox\\My PC (LAPTOP-UJNUOGON)\\Downloads\\driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();//launch chrome
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
