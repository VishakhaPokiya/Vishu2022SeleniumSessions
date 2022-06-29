package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_23_PaginationConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://babynames.merschat.com/popular.cgi?page=0");
		
		List<WebElement> namesList = driver.findElements(By.xpath("//a[contains(text(),'Himi')]"));
		
		while(true)
		{
			if(!(namesList.size()==1))
			{
				//next logic
				driver.findElement(By.linkText("Next")).click();
				namesList = driver.findElements(By.xpath("//a[contains(text(),'Himi')]"));
			}
			else
			{
				String title = driver.findElement(By.xpath("((//a[contains(text(),'Himi')])/../parent::td/following-sibling::td)[3]//a"))
				.getAttribute("title");
				System.out.println(title);
				break;
			}
		}
	}

}
