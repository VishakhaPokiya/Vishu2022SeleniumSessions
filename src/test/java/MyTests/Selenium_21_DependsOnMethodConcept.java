package MyTests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Selenium_21_DependsOnMethodConcept {

	@BeforeMethod
	public void launchBrowser()
	{
		System.out.println("BT--launchBrowser");
		int i = 9/0;
	}
	@Test 
	public void createUserTest()
	{
		System.out.println("Create User Test");
//		int i = 9/0;
	}
	
	@Test
	public void loginTest()
	{
		System.out.println("loginTest");
//		int i = 9/0;
	}
	
	@Test(dependsOnMethods = {"loginTest","createUserTest"},priority = 1)
	public void homePageTest()
	{
		System.out.println("Home Page Test");
	}
	
	@Test(dependsOnMethods = "loginTest",priority = 3)
	public void searchTest()
	{
		System.out.println("Search Test");
	}
	
	//unit test:
	//test case should be independent
	//never create any dependency
	//every test should have its own pre conditions,test steps ,assertion,status
}
