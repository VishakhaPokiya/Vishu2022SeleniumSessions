package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_13_01_SelfWork {

	static WebDriver driver;
	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/icc-women-s-world-cup-2021-22-1219028/australia-women-vs-england-women-final-1243938/full-scorecard");
	
		System.out.println(printWicketTakerName("Beth Mooney"));
		System.out.println(printScoreTable("Beth Mooney"));
	}

	public static String printWicketTakerName(String playerName)
	{
		String xpath = "//span[text()='"+playerName+"']/parent::span/../../../following-sibling::td";
		String text = driver.findElement(By.xpath(xpath)).getText();
		return text;
	}
	public static List<String> printScoreTable(String playerName)
	{
		String xpath = "//span[text()='"+playerName+"']/parent::span/../../../following-sibling::td";
		List<WebElement> scoreList = driver.findElements(By.xpath(xpath));
		List<String> scoreValueList = new ArrayList<String>();
		for(int i = 1 ; i<scoreList.size() ; i++)
		{
			String text = scoreList.get(i).getText();
			scoreValueList.add(text);
		}
		return scoreValueList;
	}
}
