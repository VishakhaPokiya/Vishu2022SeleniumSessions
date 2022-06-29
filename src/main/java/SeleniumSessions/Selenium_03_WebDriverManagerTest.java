package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_03_WebDriverManagerTest {

	public static void main(String[] args)
	{
		 WebDriverManager.chromedriver().setup();
		 
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
