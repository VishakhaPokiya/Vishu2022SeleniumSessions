package SeleniumSessions;

public class Selenium_02_RedifMailTest {

	public static void main(String[] args) {
		
		Selenium_02_BrowserUtil br = new Selenium_02_BrowserUtil();
		br.launchBrowser("chrome");
		br.enterUrl("https://www.redifmail.com");
		
		String url = br.getCurrentUrl();
		System.out.println(url);
		
		String title = br.getAppTitle();
		System.out.println(title);
		
		br.closeBrowser();

	}

}
