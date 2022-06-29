package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_02_LaunchFirefox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\taksh\\Dropbox\\My PC (LAPTOP-UJNUOGON)\\Downloads\\driver\\geckodriver-v0.30.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();//launch firefox
		
		driver.get("https://www.google.com");//launch url
		
		String title = driver.getTitle();//get the title
		System.out.println(title);
		
		//validation point
		if(title.equals("Google"))
		{
			System.out.println("Correct title");
		}
		else 
		{
			System.out.println("Incorrect Title");
		}
		
		System.out.println(driver.getCurrentUrl());//get current url
		
		//driver.quit();
		
		driver.close();//close the browser
		
		
	}

}
