package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_06_OtherLocators {

	static WebDriver driver ;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		//1.id : (Its a unique attribute) -- I
		
		//2.name : -- II
		
//		driver.findElement(By.name("email")).sendKeys("vamika@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("vamika@123");

		//using By locator
//		By emailId = By.name("email");
//		By pswdId = By.name("password");
		
		Selenium_05_ElementUtil eleutil = new Selenium_05_ElementUtil(driver);
		
//		eleutil.getElement(emailId).sendKeys("vamika@gmail.com");
//		eleutil.getElement(pswdId).sendKeys("vamika@123");
		
		//3.className : --III
		// (Its not mandatory)
		//We can have same class name for different elements
		
//		driver.findElement(By.className("form-control")).sendKeys("vamika@gmail.com");
		
		
		//4.xpath : Its not an attribute
		//address of the element inside the HTML DOM
		//we have to use attribute to create the xpath
		
		//*[@id="input-email"] -- relative xpath
		// /html/body/div[2]/div/div/div/div[2]/div/form/div[1]/input -- absolute xpath
		
//		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("vamika@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("vamika@123");
		
		//using By locator
//		By emailId = By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div[1]/input");
//		By pswdId = By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div[2]/input");
//		
//		eleutil.doSendKeys(emailId, "vamika@gmail.com");
//		eleutil.doSendKeys(pswdId, "vamika@123");
		
		
		//5.cssSelector : Its not an attribute
		//we have to use attributes to create the css selector
		
//		driver.findElement(By.cssSelector("#input-email")).sendKeys("vamika@gmail.com");
//		driver.findElement(By.cssSelector("#input-password")).sendKeys("vamika@123");
		
		//using By locator
//		By email = By.cssSelector("#input-email");
//		By password = By.cssSelector("#input-password");
//		
//		eleutil.doSendKeys(email, "vamika@gmail.com");
//		eleutil.doSendKeys(password, "vamika@123");
		
		
		//6.linkText : Only for link, Its not an attribute
		//text for the link
		//html tag = a
		
//		driver.findElement(By.linkText("Register")).click();
		
		//using By locator
//		By registerLink = By.linkText("Register");
//		doClick(registerLink);
		
		//using String type locator
//		String register = "Register";
//		eleutil.doClick("linkText", register);
		
		//7.partiallinkText -- only for link,but its not attribute
		//partial text of the link
		//html tag = a
		//driver.findElement(By.partialLinkText("History")).click();
		//privacy policy
		//user policy
		//reset password
		//forgot password
		 
		//8.tagName : html tag
//		String heading = driver.findElement(By.tagName("h1")).getText();
//		System.out.println(heading);
//		if(heading.contains("Your Store"))
//		{
//			System.out.println("Correct title");
//		}
		
		By header = By.tagName("h1");
		if(doGetText(header).contains("Your Store"))
		{
			System.out.println("h1 is correct");
		}
	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	public static void doClick(By locator)
	{
		getElement(locator).click();
	}
	public static String doGetText(By locator)
	{
		return getElement(locator).getText();
	}
	
}
