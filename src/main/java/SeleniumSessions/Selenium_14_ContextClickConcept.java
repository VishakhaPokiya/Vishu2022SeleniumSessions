package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_14_ContextClickConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

		WebElement rightClickMe = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

		Actions action = new Actions(driver);
		action.contextClick(rightClickMe).build().perform();

		By click = By
				.xpath("//ul[@class='context-menu-list context-menu-root']/li[contains(@class,'context-menu-icon')]");
		clickContext(click, "Edit");


	}

	public static void clickContext(By locator, String value) throws InterruptedException {
		List<WebElement> optList = driver.findElements(locator);
		for (WebElement e : optList) {
			String text = e.getText();
			System.out.println(text);

			if (text.equals(value)) {
				e.click();
				Thread.sleep(3000);
				Alert alert = driver.switchTo().alert();
				alert.accept();
				break;
			}
		}
	}
}
