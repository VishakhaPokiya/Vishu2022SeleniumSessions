package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Selenium_13_CustomCSSSelector {

	static WebDriver driver;
	
	public static void main(String[] args) {

		//CSS selector : its not an attribute
		
		By.cssSelector("#input-email");
		//id --> #id
		//tag#id
		//class -> .classname
		//tag.classname
		
		// #input-email
		// input#input-email
		// .form-control
		// input.form-control
		
		// #id.classname
		// #input-email.form-control
		// tag#id.classname
		// input#input-email.form-control
		
		// .classname#id
		// .form-control#input-email
		// input.form-control#input-email
		
		// .c1.c2.c3.....cn
		// .form-control.private-form__control.login-email
		// tag.c1.c2.c3.....cn
		// input.form-control.private-form__control.login-email
		// input.form-control.private-form__control.login-email#username
		// input#username.form-control.private-form__control.login-email
		// #Form_submitForm_Name.text
		
		//if id and class not available
		// tag[attr='value']
		// input[name='Name']--css
		//input[@name='Name']--xpath
		//By.cssSelector("input[name='Name']");
		//input[name='Name'][type='text']
		
		// tag[attr*='value']
		// input[id*='_Name'] -- contains
		// input[placeholder^='E-Mail'] -- starts-with
		// input[placeholder$='Address'] -- ends-with
		// input[id$='email']
		
		//parent to child:
		// div.private-form__input-wrapper input --2 (direct + indirect child)
		// div.private-form__input-wrapper > input -->2 (only direct)
		// form#hs-login div --20 (direct + indirect divs)
		// form#hs-login > div --8 (direct divs)
		
		//child to parent : not allowed 
		// backword traversing not allowed in CSS
		// preceding-sibling is not allowed in CSS
		
		//following-sibling is allowed
		// div.private-form__input-wrapper+div
		//footer > .container > .row > div > ul.list-unstyled > li + li
		
		//comma in css:
		// input#username, input#password, button#loginBtn, label#UIFormControl-label-4
		
		List<WebElement> formFields = driver.findElements(By.cssSelector("input#username, input#password, button#loginBtn, label#UIFormControl-label-4"));
		System.out.println(formFields.size());
		if(formFields.size()==4)
		{
			System.out.println("all imp fields are present on the page");
		}
		//footer css: ul.footer-nav a
		
		//nth-of-type:
		// div.footer-main ul li:nth-of-type(2)
		
		//no text capture
		
//								xpath                  |                   css
		//1.syntax				complex									 simple
		//2.functions			better									 limited
		//3.text				yes--text()									NA
        //4.backward TR.			yes								        NA
		//5.webtable			better handling							limited options
		//6.performance			good										good
		//7.diff teg check		NA											comma
		//8.attr validation     good										better
								
	}						
								
}
