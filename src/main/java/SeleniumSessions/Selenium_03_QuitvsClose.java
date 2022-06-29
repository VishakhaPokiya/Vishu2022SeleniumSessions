package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_03_QuitvsClose {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\taksh\\Dropbox\\My PC (LAPTOP-UJNUOGON)\\Downloads\\driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();//launch chrome
		driver.get("https://www.google.com");//launch url
		String title = driver.getTitle();//get the title
		System.out.println(title);
	
		//driver.close();
		
		driver.quit();//close the browser
		
		driver = new ChromeDriver();//launch chrome
		driver.get("https://www.google.com");//launch url
		System.out.println(driver.getTitle());
		
	}
}
