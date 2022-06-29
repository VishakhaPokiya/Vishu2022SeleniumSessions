package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_20_Relative {

	static WebDriver driver;
	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://whenwise.com/sign-in");
		
		//----enter the emailId------//
		driver.findElement(By.id("email")).sendKeys("");
		//-----enter the password----//
		driver.findElement(By.id("password")).sendKeys("");
		driver.findElement(By.id("login-btn")).click();
		
		driver.navigate().to("https://whenwise.com/users/3153/edit");
		
//		WebElement ele = driver.findElement(By.xpath("//span[text()='Email on booking confirmation?']"));
//		driver.findElement(with(By.className("lever")).toRightOf(ele)).click();
		
		By text = By.xpath("//span[text()='Email on booking confirmation?']");
		By value = By.className("lever");
		clickToggalCase(text, value);
	}

	
	public static void clickToggalCase(By locator,By valueLocator)
	{
		WebElement ele = driver.findElement(locator);
		driver.findElement(with(valueLocator).toRightOf(ele)).click();
	}
}
