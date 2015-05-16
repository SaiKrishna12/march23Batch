package day12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Xpath {
	FirefoxDriver driver;
	@BeforeMethod
	public void setup()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("SeleniumUser");
		driver=new FirefoxDriver(fp);
		driver.get("http://news.google.co.in/");	
	}
	@Test
	public void xpathTest()
	{
		List<WebElement> headerlinks=driver.findElements(By.xpath("//h2/a/span[@class='titletext']"));
		for(int i=0;i<headerlinks.size();i++)
		{
			System.out.println(headerlinks.get(i).getText());
		}
	}

}
