package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_23_01_SelfWork {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/alerts-map/#/");

		Thread.sleep(5000);

		String xPath = "//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='states']/*[name()='g']/*[name()='path']";
		List<WebElement> statesList = driver.findElements(By.xpath(xPath));

		Actions act = new Actions(driver);

		for (WebElement e : statesList) {
			act.moveToElement(e).perform();
			String name = e.getAttribute("name");
			System.out.println(name);
			if (name.equals("California")) {
				e.click();
				Thread.sleep(5000);
				String xpath = "//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='states']/*[name()='g' and @id='california']//*[name()='path']";
				List<WebElement> countryList = driver.findElements(By.xpath(xpath));
				for (WebElement e1 : countryList) {
					act.moveToElement(e1).perform();
				}
				break;
			}
		}
	}

}
