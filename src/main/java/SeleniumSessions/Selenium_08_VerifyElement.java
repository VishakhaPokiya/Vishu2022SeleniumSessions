package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_08_VerifyElement {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/?");
		
//		By formFields = By.className("text");
//		int fieldsCount = driver.findElements(formFields).size();
//		if(fieldsCount==0)
//		{
//			System.out.println("form field are not available");
//		}
//		else
//		{
//			System.out.println("form field are available");
//		}
		
		//to verify the single element
		By contactSales = By.linkText("CONTACT SALES");
		//driver.findElement(contactSales).click();
//		boolean flag = driver.findElement(contactSales).isDisplayed();
//		System.out.println(flag);
//		
//		if(driver.findElements(contactSales).size()>=1)
//		{
//			System.out.println("contact Sales link is present");
//		}
		
		System.out.println(isElementExist(contactSales));
		
	}

	public static boolean isElementExist(By locator)
	{
		int eleCount = driver.findElements(locator).size();
		System.out.println("Total element found : " + eleCount);
		if(eleCount>=1)
		{
			System.out.println("element is found : " + locator);
			return true;
		}
		else {
			System.out.println("element is not found : " + locator);
			return false;
		}
	}
}
