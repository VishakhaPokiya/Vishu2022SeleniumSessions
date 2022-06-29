package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_08_JsAlertPopUpHandle {

	static WebDriver driver;
	
	public static void main(String[] args)  throws InterruptedException {

		//alert
		//confirmation pop up
		//submission pop up
		//warning/error pop up
		//Js pop up
		//modal dialog
		
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(500);
		
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		if(text.equals("Please enter a valid user name"))
		{
			System.out.println("correct validation message");
		}
		
		alert.accept();//click on ok button
		//alert.dismiss();//press esc / click on close button / dismiss the alert
	}

}
