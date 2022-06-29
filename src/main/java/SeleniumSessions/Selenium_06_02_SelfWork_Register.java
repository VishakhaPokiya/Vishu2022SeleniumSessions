package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_06_02_SelfWork_Register {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
//		driver.findElement(By.name("firstname")).sendKeys("vamika");
//		driver.findElement(By.name("lastname")).sendKeys("Patel");
//		driver.findElement(By.name("email")).sendKeys("vamika@gmail.com");
//		driver.findElement(By.name("telephone")).sendKeys("463287489");
//		driver.findElement(By.name("password")).sendKeys("vamika@123");
//		driver.findElement(By.name("confirm")).sendKeys("vamika@123");
		
		
		//using By locator
//		By firstName = By.name("firstname");
//		By lastName = By.name("lastname");
//		By email = By.name("email");
//		By telephone = By.name("telephone");
//		By password = By.name("password");
//		By confirm = By.name("confirm");
//		
//		ElementUtil eleutil = new ElementUtil(driver);
//		eleutil.doSendKeys(firstName, "vamika");
//		eleutil.doSendKeys(lastName, "Patel");
//		eleutil.doSendKeys(email, "vamika@gmail.com");
//		eleutil.doSendKeys(telephone, "6928428238");
//		eleutil.doSendKeys(password, "vamika@123");
//		eleutil.doSendKeys(confirm, "vamika@123");
		
		
		//using String locator
		String firstName = "firstname";
		String lastName = "lastname";
		String emailId = "email";
		String telephone = "telephone";
		String password = "password";
		String confirm = "confirm";
		
		Selenium_05_ElementUtil eleUtil = new Selenium_05_ElementUtil(driver);
		eleUtil.doSendKeys("name", firstName,"Vamika");
		eleUtil.doSendKeys("name", lastName,"Patel");
		eleUtil.doSendKeys("name", emailId,"vamika@gmail.com");
		eleUtil.doSendKeys("name", telephone,"4758435734");
		eleUtil.doSendKeys("name", password,"vamika@123");
		eleUtil.doSendKeys("name", confirm,"vamika@123");
	}

}
