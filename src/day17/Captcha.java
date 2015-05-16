package day17;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Captcha {
	FirefoxDriver  driver=null;
	@BeforeMethod
	public void setUp()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("SeleniumUser");
		driver=new FirefoxDriver();
		driver.get("http://www.harvard.edu/feedback");
		
	}
	@Test
	public void captchaTest()
	{
		long j;
		for(j=0;j<9999999999999999l;j++)
		{
		   driver.findElement(By.id("edit-submitted-name")).sendKeys("tester"+j);
		   driver.findElement(By.id("edit-submitted-email")).sendKeys("tester"+j+"@gmail.com");
		  driver.findElement(By.id("edit-submitted-comment")).sendKeys("This is a sample msg");
		  String x=driver.findElement(By.xpath("//*[@id='webform-client-form-1884']/div/fieldset/div/div[2]/span")).getText();
		  String[] a=x.split(" ");
		  int b=Integer.parseInt(a[0]);
		  int c=Integer.parseInt(a[2]);
		  int d=b+c;
		  String data=Integer.toString(d);
		  driver.findElement(By.id("edit-captcha-response")).sendKeys(data);
		  //driver.findElement(By.xpath("//*[@id='webform-client-form-1884']/div/div[5]/input")).click();
		 driver.navigate().refresh();
		}
		
	}

}
