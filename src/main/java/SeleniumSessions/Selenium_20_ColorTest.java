package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_20_ColorTest {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication");
		
		driver.findElement(By.id("email")).sendKeys("vishu@gmail.com.@");
		driver.findElement(By.id("email")).sendKeys(Keys.TAB);
		
		boolean flag = driver.findElement(By.xpath("//div[@class='form-group form-error']")).isDisplayed();
		System.out.println(flag);
	}

}
