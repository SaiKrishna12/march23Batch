package day27.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Menu {
	
	@FindBy(linkText="SIGN-ON")
	WebElement signon;
	public void signonTest()
	{
		signon.click();
	}
	
	@FindBy(linkText="REGISTER")
	WebElement register;
	public void registerTest()
	{
		register.click();
	}
	
	@FindBy(linkText="SUPPORT")
	WebElement support;
	public void supportTest()
	{
		support.click();
	}
	
	@FindBy(linkText="CONTACT")
	@CacheLookup
	WebElement contact;
	public void contactTest()
	{
		contact.click();
	}

}
