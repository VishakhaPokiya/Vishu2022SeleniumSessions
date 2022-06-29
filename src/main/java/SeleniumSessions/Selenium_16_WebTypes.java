package SeleniumSessions;

public class Selenium_16_WebTypes {

	public static void main(String[] args) {

		//synchronization in selenium
		//syn between script(selenium) and application
		//1.static wait
			//sleep (5 secs) -- Thread.sleep(5000)
		
		//2.dynamic wait
			//implicitly wait
			//explicit wait
				//a.WebDriverWait
				//b.FluentWait
		
		//Wait(I) <-- FluentWait(C) <-- WebDriverWait(C)
		//ele -->2 secs ,5 secs ,10 secs
		//dynamic Wait -- 10 secs (max timeout)
		//2 secs --> 8 secs(ignored)
		//5 secs --> 5 secs
		//10 secs --> 0 sec
		//11 secs --> nosuchelementexception
	}

}
