package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_15_DragAndDropConcept {

	static WebDriver driver;
	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement sourceLink = driver.findElement(By.id("draggable"));
		WebElement targetLink = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		action
			.clickAndHold(sourceLink)
				.moveToElement(targetLink)
					.release()
						.build()
							.perform();
		
//		action.dragAndDrop(sourceLink, targetLink).perform();
	}

}
