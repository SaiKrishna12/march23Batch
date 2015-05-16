package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ChainActions {
	FirefoxDriver driver;
	@BeforeMethod
	public void setup()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("SeleniumUser");
		driver=new FirefoxDriver(fp);
		driver.get("http://yssofindia.org");	
	}
	
	@Test
	public void chainActionstest()
	{
		WebElement event1=driver.findElement(By.xpath("//*[@id='topmenu']/div/ul/li[5]/a/img"));
		WebElement event2=driver.findElement(By.xpath("//*[@id='topmenu']/div/ul/li[5]/ul/li[9]/a"));
		Actions action=new Actions(driver);
		action.moveToElement(event1).moveToElement(event2).pause(5000).build().perform();
	}

}
