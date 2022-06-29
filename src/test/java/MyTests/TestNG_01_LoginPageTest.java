package MyTests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_01_LoginPageTest {

	WebDriver driver;
	SoftAssert softAssert;
	
	By userName = By.id("username");
	By password = By.id("password");
	By loginBtn = By.id("loginBtn");
	By signUp = By.linkText("Sign up");
	
//	@BeforeMethod
	@BeforeTest
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login?hubs_signup-url=www.hubspot.com/&hubs_signup-cta=homepage-nav-login");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		softAssert = new SoftAssert();
	}
	
	@Test(priority=1)
	public void signUpLinkTest()
	{
		softAssert.assertTrue(driver.findElement(signUp).isDisplayed());
	}
	
	@Test(priority=2)
	public void pageTitleTest() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("HubSpot"));
		String title = driver.getTitle();
		System.out.println("Page Title : " + title);
		softAssert.assertEquals(title, "HubSpot Login");
	}
	
	@Test(priority=3)
	public void loginTest()
	{
		driver.findElement(userName).sendKeys("vishubhayani31@gmail.com");
		driver.findElement(password).sendKeys("Rohit@1203");
		driver.findElement(loginBtn).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("User Guide"));
		
		softAssert.assertTrue(driver.findElement(By.xpath("//h1[@class='private-header__heading']")).isDisplayed());
		String header = driver.findElement(By.xpath("//h1[@class='private-header__heading']")).getText();
		softAssert.assertEquals(header, "User Guide");
		
		softAssert.assertAll();
	}
	
//	@AfterMethod
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}
