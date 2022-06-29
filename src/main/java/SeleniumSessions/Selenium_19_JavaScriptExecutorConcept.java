package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_19_JavaScriptExecutorConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("alert('hi')");
		
		Selenium_19_JavaScriptUtil jsUtil = new Selenium_19_JavaScriptUtil(driver);
		String title = jsUtil.getTitleByJS();
		System.out.println(title);
		
//		jsUtil.generateAlert("This is my pop up ");
		
//		String innerText = jsUtil.getPageInnerText();
//		System.out.println(innerText);
//		System.out.println(innerText.contains("customer service"));
		
//		jsUtil.refreshBrowserByJS();
		
//		WebElement logIn = driver.findElement(By.xpath("//input[@type='submit']"));
//		WebElement loginForm = driver.findElement(By.xpath("//div[@class='col-sm-4 col-md-4 pull-right']"));
//		jsUtil.drawBorder(logIn);
//		jsUtil.drawBorder(loginForm);
		
//		jsUtil.flash(logIn);
//		jsUtil.flash(loginForm);
		
//		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
//		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		
//		jsUtil.flash(username);
//		username.sendKeys("vamika@gmail.com");
//		jsUtil.flash(password);
//		password.sendKeys("vamika@123");
		
//		WebElement register = driver.findElement(By.linkText("Register"));
//		jsUtil.clickElementByJS(register);
		
		//WE -- click
		//Actions -- click
		//Actions -- moveElement -- click
		//Js -- click
		//Exp wait -- We -- click
		
//		 jsUtil.scrollPageDown();
//		 Thread.sleep(3000);
//		 jsUtil.scrollPageUp();
//		 Thread.sleep(3000);
//		 jsUtil.scrollPageDown("500");
//		 WebElement heading = driver.findElement(By.xpath("//span[text()='Popular products in Beauty internationally']"));
//		 jsUtil.scrollIntoView(heading);
//		 System.out.println(heading.getText());
		
//		WebElement emailId = driver.findElement(By.id("input-email"));
//		emailId.sendKeys("vamika@gmail.com");
//		System.out.println(emailId.getText());
//		String val = emailId.getAttribute("value");
//		System.out.println(val);
	}

}
