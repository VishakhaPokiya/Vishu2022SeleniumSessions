package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_06_01_SelfWork_Register {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
//		driver.findElement(By.id("input-firstname")).sendKeys("Test");
//		driver.findElement(By.id("input-lastname")).sendKeys("Patel");
//		driver.findElement(By.id("input-email")).sendKeys("testpatel11@gmail.com");
//		driver.findElement(By.id("input-telephone")).sendKeys("3476247624");
//		driver.findElement(By.id("input-password")).sendKeys("test@123");
//		driver.findElement(By.id("input-confirm")).sendKeys("test@123");
//		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]")).click();
//		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
		
		//using By locator
//		By firstName = By.id("input-firstname");
//		By lastName = By.id("input-lastname");
//		By email = By.id("input-email");
//		By telephone = By.id("input-telephone");
//		By password = By.id("input-password");
//		By confirm = By.id("input-confirm");
//		
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendKeys(firstName, "vamika");
//		eleUtil.doSendKeys(lastName, "Patel");
//		eleUtil.doSendKeys(email, "vamika@gmail.com");
//		eleUtil.doSendKeys(telephone, "4585875873");
//		eleUtil.doSendKeys(password, "vamika@123");
//		eleUtil.doSendKeys(confirm, "vamika@123");
		
		
		//using String locator
		String firstName = "input-firstname";
		String lastName = "input-lastname";
		String emailId = "input-email";
		String telephone = "input-telephone";
		String password = "input-password";
		String confirm = "input-confirm";
		
		Selenium_05_ElementUtil eleUtil = new Selenium_05_ElementUtil(driver);
		eleUtil.doSendKeys("id", firstName,"Vamika");
		eleUtil.doSendKeys("id", lastName,"Patel");
		eleUtil.doSendKeys("id", emailId,"vamika@gmail.com");
		eleUtil.doSendKeys("id", telephone,"4758435734");
		eleUtil.doSendKeys("id", password,"vamika@123");
		eleUtil.doSendKeys("id", confirm,"vamika@123");
	}

}
