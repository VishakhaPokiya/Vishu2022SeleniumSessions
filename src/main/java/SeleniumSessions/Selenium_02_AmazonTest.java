package SeleniumSessions;

public class Selenium_02_AmazonTest {

	public static void main(String[] args) {
		
		Selenium_02_BrowserUtil br = new Selenium_02_BrowserUtil();
		br.launchBrowser("chrome");
		br.enterUrl("https://www.Amazon.com");
		
		String url = br.getCurrentUrl();
		System.out.println(url);
		
		String title = br.getAppTitle();
		System.out.println(title);
		
		br.closeBrowser();
		
	}

}
