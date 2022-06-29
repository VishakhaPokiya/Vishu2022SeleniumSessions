package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_12_01_SelfWork {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//*[@id="main"]/table/tbody/tr[2]/td[1]
		
//		for(int i = 2 ; i<=11 ; i++)
//		{
//			String xpath = "//*[@id=\"main\"]/table/tbody/tr["+i+"]/td[1]";
//			String text = driver.findElement(By.xpath(xpath)).getText();
//			System.out.println(text);
//		}
		
//		for(int i = 2 ; i<=11 ; i++)
//		{
//			String xpath = "//*[@id=\"main\"]/table/tbody/tr["+i+"]/td[2]";
//			String text = driver.findElement(By.xpath(xpath)).getText();
//			System.out.println(text);
//		}
		
		By rowLocator = By.xpath("//*[@id=\"main\"]/table/tbody/tr");
		By columnLocator = By.xpath("//*[@id=\"main\"]/table/tbody/tr/th");
		String beforeXpath = "//*[@id=\"main\"]/table/tbody/tr[";
		String afterXpath = "]/td[";
		printTable(rowLocator,columnLocator,beforeXpath,afterXpath);
	}

	
	public static void printTable(By rowLocator,By columnLocator,String beforeXpath,String afterXpath)
	{
		int rowCount = driver.findElements(rowLocator).size();
		int columnCount = driver.findElements(columnLocator).size();
		
		for(int row = 2 ; row<=rowCount ; row++)
		{
			for(int column = 1 ; column<= columnCount ; column++)
			{
				String xpath = beforeXpath + row + afterXpath +column + "]";
				String text = driver.findElement(By.xpath(xpath)).getText();
				System.out.print(text + "             ");
			}
			System.out.println();
		}
	}
}
