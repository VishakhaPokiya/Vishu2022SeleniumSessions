package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_07_ImagesUtil {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");

		By images = By.tagName("img");
		//By links = By.tagName("a");
		
		List<String> arrList = getAttributeList(images, "src");

		//printElemenetValues(arrList);
		
		printElemenetValues(getAttributeList(images, "src"));
		
		//printElemenetValues(getAttributeList(links, "href"));

	}

	public static void printElemenetValues(List<String> attriTextValue) {
		for (String e : attriTextValue) {
			System.out.println(e);
		}
	}

	public static List<String> getAttributeList(By locator, String attributeName) {

		List<WebElement> eleList = getElements(locator);
		List<String> attrList = new ArrayList<String>();
		for (WebElement e : eleList) {
			String attriValue = e.getAttribute(attributeName);
			if (!attriValue.isEmpty()) {
				attrList.add(attriValue);
			}
		}
		return attrList;
	}

	public static int getElementsCount(By locator) {
		return getElements(locator).size();
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
}
