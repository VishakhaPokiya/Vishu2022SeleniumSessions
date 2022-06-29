package AppTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium_21_OpenCartTest extends Selenium_21_BaseTest{
	
	@Test(priority = 1)
	public void registerLinkTest()
	{
//		driver.get("https://demo.opencart.com/index.php?route=account/login");
		boolean flag = driver.findElement(By.xpath("//div/a[text()='Register']")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority = 2)
	public void urlTest()
	{
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("account/login"));
	}
	
}
