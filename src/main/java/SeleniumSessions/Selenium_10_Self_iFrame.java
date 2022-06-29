package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_10_Self_iFrame {

	static WebDriver driver;
	
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://allwebco-templates.com/support/S_script_IFrame.htm");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='Framename' and @class='framesample framesample2']")));
//		driver.findElement(By.xpath("//iframe[@name='Framename' and class='framesample framesample2']")).sendKeys("testing");
		
		driver.findElement(By.xpath("/html/body/div/div[4]/div/div/div[2]/div[1]/a/img")).click();
		
		driver.findElement(By.xpath("//*[@id=\"searchpop\"]/form/table/tbody/tr/td[1]/input[1]")).sendKeys("testing");
		driver.findElement(By.name("submitbutton")).click();
	}
}
