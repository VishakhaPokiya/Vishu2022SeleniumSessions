package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_09_01_AssignmentSuggListHandle {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.findElement(By.id("search_query_top")).sendKeys("Dresses");
		 
		Thread.sleep(10000);
		
//		List<WebElement> suggList = driver.findElements(By.xpath("//div[@class='ac_results']//li"));
//		System.out.println(suggList.size());
		
//		for(WebElement e : suggList)
//		{
//			String text = e.getText();
//			if(text.contains("Casual Dresses > Printed Dress"))
//			{
//				e.click();
//				break;
//			}
//		}
		
//		driver.findElement(By.xpath("//div[@class='ac_results']//li[contains(text(),'Casual Dresses > Printed Dress')]")).click();
		selectOptionFromSuggList("Casual Dresses > Printed Dress");
	}

	public static void selectOptionFromSuggList(String value)
	{
		driver.findElement(By.xpath("//div[@class='ac_results']//li[contains(text(),'"+value+"')]")).click();

	}
}
