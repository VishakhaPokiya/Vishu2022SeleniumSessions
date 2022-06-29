package comTests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testng_04_LoginTest {

WebDriver driver;
	
	By userName = By.id("username");
	By password = By.id("password");
	By loginBtn = By.id("loginBtn");
	By signUp = By.linkText("Sign up");
	
	@BeforeTest
	@Parameters({"url","browser"})
	public void setUp(String url,String browser)
	{
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("Pass the right browser...");
		}
		driver.get(url);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(priority=1)
	public void signUpLinkTest()
	{
		Assert.assertTrue(driver.findElement(signUp).isDisplayed());
	}
	
	@Test(priority=2)
	public void pageTitleTest() {
		String title = driver.getTitle();
		System.out.println("Page Title : " + title);
		Assert.assertEquals(title, "HubSpot Login");
	}
	
	@Test(priority=3)
	@Parameters({"email","pswd"})
	public void loginTest(String email,String pswd)
	{
		driver.findElement(userName).sendKeys(email);
		driver.findElement(password).sendKeys(pswd);
		driver.findElement(loginBtn).click();
		
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}
