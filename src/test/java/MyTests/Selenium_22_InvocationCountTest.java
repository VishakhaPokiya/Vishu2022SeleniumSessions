package MyTests;

import org.testng.annotations.Test;

public class Selenium_22_InvocationCountTest {

	
	@Test(invocationCount = 10)
	public void getUserInfoTest()
	{
		System.out.println("user info...");
	}
}
