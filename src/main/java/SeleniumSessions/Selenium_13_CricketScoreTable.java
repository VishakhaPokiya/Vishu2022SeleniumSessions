package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_13_CricketScoreTable {
	
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/icc-men-s-t20-world-cup-2021-22-1267897/australia-vs-new-zealand-final-1273756/full-scorecard");
	
		System.out.println(getWicketTakerName("Daryl Mitchell"));
		System.out.println(getPlayerScoreCard("Daryl Mitchell"));
	}

	public static String getWicketTakerName(String playerName)
	{
		String xpath = "//span[text()='"+playerName+"']/parent::span/ancestor::td/following-sibling::td/span";
//		String wicketTakerName = driver.findElement(By.xpath("//span[text()='"+playerName+"']/parent::span/../../../following-sibling::td/span")).getText();
		String wicketTakerName = driver.findElement(By.xpath(xpath)).getText();
		return wicketTakerName;
	}
	public static List<String> getPlayerScoreCard(String playerName)
	{
		List<WebElement> scoreList = driver.findElements(By.xpath("//span[text()='Daryl Mitchell']/parent::span/ancestor::td/following-sibling::td"));
		List<String> scoreValList = new ArrayList<String>();
		
		for(int i = 1; i<scoreList.size();i++)
		{
			String text = scoreList.get(i).getText();
			scoreValList.add(text);
		}
		return scoreValList;
	}
}
