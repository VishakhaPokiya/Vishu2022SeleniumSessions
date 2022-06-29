package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_12_StaticWebTableHandle {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/html/html_tables.asp");

		//hubspot.com
		//input[@id='username']/ancestor::form[@id='hs-login']
		
		// table[@id="customers"]/tbody/tr[2]/td[1]
		// table[@id="customers"]/tbody/tr[3]/td[1]
		// table[@id="customers"]/tbody/tr[4]/td[1]


//		for (int i = 2; i <= 7; i++) 
//		{
//			String xpath = "//table[@id=\"customers\"]/tbody/tr["+i+"]/td[1]";
//			String text = driver.findElement(By.xpath(xpath)).getText();
//			System.out.println(text);
//		}
		
		//*[@id="customers"]/tbody/tr[2]/td[2]
		//*[@id="customers"]/tbody/tr[3]/td[2]
		//*[@id="customers"]/tbody/tr[4]/td[2]
		
		By row = By.xpath("//*[@id=\"customers\"]/tbody/tr");
		By column = By.xpath("//*[@id=\"customers\"]/tbody/tr[2]/td");
		String beforeXpath = "// table[@id=\"customers\"]/tbody/tr[";
		String afterXpath = "]/td[";
		
		printTable(row,column,beforeXpath,afterXpath);
	}

	public static void printTable(By rowLocator,By columnLocator,String beforeXpath,String afterXpath)
	{
		int rowCount = driver.findElements(rowLocator).size();
		int columnCount = driver.findElements(columnLocator).size();
		
		// table[@id="customers"]/tbody/tr[2]/td[1]
		for(int row = 2; row<=rowCount ; row++)
		{
			for(int column = 1 ; column<=columnCount ; column++)
			{
				String xpath = beforeXpath + row + afterXpath + column + "]";
				String text = driver.findElement(By.xpath(xpath)).getText();
				System.out.print(text + "     |   ");
			}
			System.out.println();
		}
	}
}
