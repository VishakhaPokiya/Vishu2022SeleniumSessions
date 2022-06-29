package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_14_JqueryDropDownHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();

		Thread.sleep(3000);

		By choices = By.cssSelector("span.comboTreeItemTitle");

		// 01: single selection:
		 selectChoice(choices, "choice 1");

		// 02: multi selection:
		// selectChoice(choices, "choice 2","choice 1","choice 3");

		// 03.all selection
//		selectChoice(choices, "all");
	}

	public static void selectChoice(By locator, String... value) {
		List<WebElement> choiceList = driver.findElements(locator);

		boolean flag = false;
		if (!value[0].equalsIgnoreCase("all")) {
			for (WebElement e : choiceList) {
				String text = e.getText();
				System.out.println(text);

				for (int i = 0; i < value.length; i++) {
					if (value[i].equals(text)) {
						e.click();
						flag = true;
						break;
					}
				}
			}
		} else {

			try {
				for (WebElement e : choiceList) {
					e.click();
				}
			} catch (ElementNotInteractableException e) {
				System.out.println("choise are not available");
			}
		}
		
		if(flag == false)
		{
			System.out.println("choice is not available");
		}
	}
	

}
