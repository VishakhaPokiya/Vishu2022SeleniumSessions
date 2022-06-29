package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_07_ImageCount {

static WebDriver driver;
	
	public static void main(String[] args) {
		
		//you have to get the count of all the images on the page
		//then print the src/alt attribute of each link on the console
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		List<WebElement> imageList = driver.findElements(By.tagName("img"));
		System.out.println(imageList.size());
		
		for(WebElement e : imageList)
		{
			String altValue = e.getAttribute("alt");
			String srcValue =  e.getAttribute("src");
			System.out.println(altValue + "-------->" + srcValue);
		}
	}

}
