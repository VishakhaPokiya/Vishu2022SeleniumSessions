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

public class testng_04_SignUpTest {

	WebDriver driver;
	By createAccountLink = By.xpath("(//i18n-string[@data-locale-at-render='en-us'])[1]");
	By signUp = By.xpath("//i18n-string[text()='Sign up']");
	By button = By.xpath("//button[@data-selenium='google-button']");

	@BeforeTest
	@Parameters({ "url", "browser" })
	public void setUp(String url, String browser) {
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
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void accountLinkTextTest() {
		Assert.assertTrue(driver.findElement(createAccountLink).isDisplayed());
	}

	@Test(priority = 2)
	public void signUpTest() {
		driver.findElement(signUp).click();
		Assert.assertTrue(driver.findElement(button).isDisplayed());
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
