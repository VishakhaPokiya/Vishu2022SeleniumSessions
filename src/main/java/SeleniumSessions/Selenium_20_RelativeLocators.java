package SeleniumSessions;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_20_RelativeLocators {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.aqi.in/dashboard/canada");
		
		WebElement ele = driver.findElement(By.linkText("Hinton, Canada"));
		
		String aqNum = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(aqNum);
		
		String rank = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(rank);
	
		String belowCity = driver.findElement(with(By.tagName("p")).below(ele)).getText();
		System.out.println(belowCity);
		
		String cityColName = driver.findElement(with(By.tagName("p")).above(ele)).getText();
		System.out.println(cityColName);
		
		String name = driver.findElement(with(By.tagName("p")).near(ele)).getText();
		System.out.println(name);
	}

}
