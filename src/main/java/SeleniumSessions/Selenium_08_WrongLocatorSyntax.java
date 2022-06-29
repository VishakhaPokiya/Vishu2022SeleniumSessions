package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_08_WrongLocatorSyntax {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/?");

		//By firstName = By.xpath("testing ");//NoSuchElementException
		By emailId = By.cssSelector("Form_submitForm_Email");
		
		//driver.findElement(firstName).sendKeys("Vishu");
		driver.findElement(emailId).sendKeys("text@gmail.com");
		
		//*[@id="Form_submitForm_Name"] -- yes
		//*[id=\"Form_submitForm_Name\"] -- no
		//testing -- no
		//#Form_submitForm_Email -- yes
	}

}
