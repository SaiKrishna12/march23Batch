package day16;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ajax1 {
	FirefoxDriver  driver=null;
	@BeforeMethod
	public void setUp()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("SeleniumUser");
		driver=new FirefoxDriver();
		driver.get("http://google.com");
		
	}
	@Test
	public void ajaxTest() throws InterruptedException
	{
		driver.findElement(By.name("q")).sendKeys("selenium");
		WebElement block=driver.findElement(By.xpath("//*[@id='sbtc']/div[2]/div[2]/div[1]"));
		Thread.sleep(2000);
		List<WebElement> ajaxes=block.findElements(By.xpath("//*[starts-with(@id,'sbse')]/div[2]"));
		System.out.println(ajaxes.size());
		for(int i=0;i<ajaxes.size();i++)
		{
			System.out.println(ajaxes.get(i).getText());
		}
	}

}
