package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_06_03_SelfWork_Register {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
//		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("vamika");
//		driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("Patel");
//		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("vamika@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"input-telephone\"]")).sendKeys("4632897489");
//		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("vamika@123");
//		driver.findElement(By.xpath("//*[@id=\"input-confirm\"]")).sendKeys("vamika@123");
//		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]")).click();
//		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
		
		
		//using By locator
//		By firstName = By.xpath("//*[@id=\"input-firstname\"]");
//		By lastName = By.xpath("//*[@id=\"input-lastname\"]");
//		By email = By.xpath("//*[@id=\"input-email\"]");
//		By telephone = By.xpath("//*[@id=\"input-telephone\"]");
//		By password = By.xpath("//*[@id=\"input-password\"]");
//		By confirm = By.xpath("//*[@id=\"input-confirm\"]");
//		By square = By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
//		By continueLink = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
//		
//		ElementUtil eleutil = new ElementUtil(driver);
//		eleutil.doSendKeys(firstName, "vamika");
//		eleutil.doSendKeys(lastName, "Patel");
//		eleutil.doSendKeys(email, "vamika@gmail.com");
//		eleutil.doSendKeys(telephone, "6928428238");
//		eleutil.doSendKeys(password, "vamika@123");
//		eleutil.doSendKeys(confirm, "vamika@123");
//		eleutil.doClick(square);
//		eleutil.doClick(continueLink);
		
		//using String type locator
		String firstName = "//*[@id=\"input-firstname\"]";
		String lastName = "//*[@id=\"input-lastname\"]";
		String emailId = "//*[@id=\"input-email\"]";
		String telephone = "//*[@id=\"input-telephone\"]";
		String password = "//*[@id=\"input-password\"]";
		String confirm = "//*[@id=\"input-confirm\"]";
		String square = "//*[@id=\"content\"]/form/div/div/input[1]";
		String continueLink = "//*[@id=\"content\"]/form/div/div/input[2]";
		
		Selenium_05_ElementUtil eleUtil = new Selenium_05_ElementUtil(driver);
		eleUtil.doSendKeys("xpath", firstName,"Vamika");
		eleUtil.doSendKeys("xpath", lastName,"Patel");
		eleUtil.doSendKeys("xpath", emailId,"vamika@gmail.com");
		eleUtil.doSendKeys("xpath", telephone,"4758435734");
		eleUtil.doSendKeys("xpath", password,"vamika@123");
		eleUtil.doSendKeys("xpath", confirm,"vamika@123");
		eleUtil.doClick("xpath", square);
		eleUtil.doClick("xpath", continueLink);
	
		
	}
}
