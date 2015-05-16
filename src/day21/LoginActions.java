package day21;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginActions {
	static FirefoxDriver driver=null;
	
	public void launchBrowser()
	{
		driver=new FirefoxDriver();
	}
	public void navigate()
	{
		driver.get("http://gmail.com");
	}
	public void enterUsername(String locator)
	{
		driver.findElement(By.id(locator)).sendKeys("saikrishna");
	}
	public void enterPassword(String locator)
	{
		driver.findElement(By.id(locator)).sendKeys("krishna");
		
	}

	public void clickLogin(String locator)
	{
		driver.findElement(By.xpath(locator)).click();
	}
}
