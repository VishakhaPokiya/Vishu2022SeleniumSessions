package SeleniumSessions;

//import org.openqa.selenium.SearchContext;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.remote.RemoteWebDriver;

public class Selenium_03_WebDriverCastings {

	public static void main(String[] args) {
		
		//1.WD - CD - Local
		//WebDriver driver = new ChromeDriver();
		
		//2.ChromeDriver driver = new ChromeDriver();
		
		//3.RWD - CD - Local
		//RemoteWebDriver driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		
		//4.WD - RWD - Remote machine/server/docker/vm/cloud/cloud vendor
		//WebDriver driver = new RemoteWebDriver(new URL("192.45.1.10:4444"), capabilities);
		
		//5.SD - CD 
		//SearchContext driver = new ChromeDriver();
		
		//6.SD - RWD 
		//SearchContext driver = new RemoteWebDriver(new URL("192.45.1.10:4444"), capabilities);
	}

}
