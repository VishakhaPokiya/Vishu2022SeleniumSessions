package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_24_01_SelfWork {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();
		
		Set<String> handle = driver.getWindowHandles();
		List<String> handleList = new ArrayList<String>(handle);
		
		String parentWindowId = handleList.get(0);
		String Child_1WindowId = handleList.get(1);
		String Child_2WindowId = handleList.get(2);
		String Child_3WindowId = handleList.get(3);
		String Child_4WindowId = handleList.get(4);
		
		driver.switchTo().window(Child_4WindowId);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(Child_3WindowId);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(Child_2WindowId);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(Child_1WindowId);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getCurrentUrl());
	}

}
