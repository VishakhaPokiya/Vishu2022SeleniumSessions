package SeleniumSessions;

import org.openqa.selenium.WebDriver;

public class Selenium_05_RegPageTest1 {

	public static void main(String[] args) {
		
		Selenium_02_BrowserUtil broUtil = new Selenium_02_BrowserUtil();
		WebDriver driver = broUtil.launchBrowser("chrome");
		broUtil.enterUrl("https://demo.opencart.com/index.php?route=account/register");
		String title = broUtil.getAppTitle();
		System.out.println(title);
		
		String firstName = "input-firstname";
		String lastName = "input-lastname";
		String email = "input-email";
		String telephone = "input-telephone";
		String password = "input-password";
		String passwordConfirm = "input-confirm";
		
		
		Selenium_05_ElementUtil eleUtil = new Selenium_05_ElementUtil(driver);
		eleUtil.doSendKeys("id", firstName , "Ruhi");
		eleUtil.doSendKeys("id", lastName, "Patel");
		eleUtil.doSendKeys("id", email, "ruhi@gmail.com");
		eleUtil.doSendKeys("id", telephone, "1234567890");
		eleUtil.doSendKeys("id", password, "ruhi@12345");
		eleUtil.doSendKeys("id", passwordConfirm, "ruhi@12345");
	}

}
