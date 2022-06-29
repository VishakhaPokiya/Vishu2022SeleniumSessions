package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_09_SelectDropDownValueWithoutSelectClass {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/?");

//		List<WebElement> countryList = driver.findElements(By.xpath("//select[@id='Form_submitForm_Country']/option"));
//		System.out.println(countryList.size());
//
//		for (WebElement e : countryList) {
//			String text = e.getText();
//			if (text.equals("India")) {
//				e.click();
//				break;
//			}
//		}
		By countryXpath = By.xpath("//select[@id='Form_submitForm_Country']/option");
		selectDropDownValueWithoutSelectClass(countryXpath, "India");
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static void selectDropDownValueWithoutSelectClass(By locator, String value) {
		List<WebElement> countryOptions = getElements(locator);
		for(WebElement e : countryOptions)
		{
			String text = e.getText();
			if(text.equals(value))
			{
				e.click();
			}
		}
	}

}
