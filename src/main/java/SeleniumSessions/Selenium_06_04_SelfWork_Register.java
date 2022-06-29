package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_06_04_SelfWork_Register {

	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
//		driver.findElement(By.cssSelector("#input-firstname")).sendKeys("Vamika");
//		driver.findElement(By.cssSelector("#input-lastname")).sendKeys("Patel");
//		driver.findElement(By.cssSelector("#input-email")).sendKeys("Vamika@gmail.com");
//		driver.findElement(By.cssSelector("#input-telephone")).sendKeys("2476746887");
//		driver.findElement(By.cssSelector("#input-password")).sendKeys("vamika@123");
//		driver.findElement(By.cssSelector("#input-confirm")).sendKeys("vamika@123");
//		driver.findElement(By.cssSelector("#content > form > div > div > input[type=checkbox]:nth-child(2)")).click();
//		driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary")).click();

		//using By locator
//		By firstName = By.cssSelector("#input-firstname");
//		By lastName = By.cssSelector("#input-lastname");
//		By email = By.cssSelector("#input-email");
//		By telephone = By.cssSelector("#input-telephone");
//		By password = By.cssSelector("#input-password");
//		By confirm = By.cssSelector("#input-confirm");
//		By square = By.cssSelector("#content > form > div > div > input[type=checkbox]:nth-child(2)");
//		By continueId = By.cssSelector("#content > form > div > div > input.btn.btn-primary");
		
//		ElementUtil eleutil = new ElementUtil(driver);
//		eleutil.doSendKeys(firstName, "Vamika");
//		eleutil.doSendKeys(lastName, "Patel");
//		eleutil.doSendKeys(email, "Vamika@gmail.com");
//		eleutil.doSendKeys(telephone, "2476746887");
//		eleutil.doSendKeys(password, "vamika@123");
//		eleutil.doSendKeys(confirm, "vamika@123");
//		eleutil.doClick(square);
//		eleutil.doClick(continueId);
		
		
		//using String type locator
		String firstName = "#input-firstname";
		String lastName = "#input-lastname";
		String email = "#input-email";
		String telephone = "#input-telephone";
		String password = "#input-password";
		String confirm = "#input-confirm";
		String square = "#content > form > div > div > input[type=checkbox]:nth-child(2)";
		String continueId = "#content > form > div > div > input.btn.btn-primary";
		
		Selenium_05_ElementUtil eleutil = new Selenium_05_ElementUtil(driver);
		eleutil.doSendKeys("cssSelector", firstName, "Vamika");
		eleutil.doSendKeys("cssSelector", lastName, "Patel");
		eleutil.doSendKeys("cssSelector", email, "Vamika@gmail.com");
		eleutil.doSendKeys("cssSelector", telephone, "2476746887");
		eleutil.doSendKeys("cssSelector", password, "vamika@123");
		eleutil.doSendKeys("cssSelector", confirm, "vamika@123");
		eleutil.doClick("cssSelector", square);
		eleutil.doClick("cssSelector", continueId);
	}

}
