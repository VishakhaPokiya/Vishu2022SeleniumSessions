package AppTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium_21_GoogleTest extends Selenium_21_BaseTest{


	@Test(priority = 1)
	public void searchTest()
	{
//		driver.get("https://www.google.com");
		boolean flag = driver.findElement(By.name("q")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority = 2)
	public void googleSearchBtnTest()
	{
		boolean flag = driver.findElement(By.name("btnK")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority = 3)
	public void urlTest()
	{
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("google"));
		
	}
	
	
}
