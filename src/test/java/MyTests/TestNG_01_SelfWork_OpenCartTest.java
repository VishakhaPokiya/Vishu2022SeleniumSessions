package MyTests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_01_SelfWork_OpenCartTest {

	WebDriver driver;
	
	By email = By.id("input-email");
	By password = By.id("input-password");
	By logIn = By.xpath("//input[@type='submit']");
	
	@BeforeTest
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(priority=1)
	public void headerTest()
	{
		String title = driver.getTitle();
		Assert.assertEquals(title, "Account Login");
	}
	
	@Test(priority=2)
	public void homePageUrlTest()
	{
		driver.findElement(email).sendKeys("test1234512345@gmail.com");
		driver.findElement(password).sendKeys("test@123");
		driver.findElement(logIn).click();
		
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("account/account"));
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}
