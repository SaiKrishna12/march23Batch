package OrangeHRM;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginActions  extends Constants{
	
	
	public void launchBrowser()
	{
		driver=new FirefoxDriver();
	}
	
	public void navigate() throws IOException
	{
		driver.get("http://localhost:8090/orangehrm/symfony/web/index.php/auth/login");
	    ts.screenshot(driver,"Login");
	}
    public void enterUsername() throws IOException
    {
    	String locator=rp.prop(propPath,"username");
    	driver.findElement(By.id(locator)).sendKeys("Admin");
    }
    
    public void enterPassword() throws IOException
    {
    	String locator=rp.prop(propPath,"password");
    	driver.findElement(By.id(locator)).sendKeys("Admin");
    }
    public void clickLogin() throws IOException
    {
    	String locator=rp.prop(propPath,"login");
    	driver.findElement(By.id(locator)).click();
    }
}
