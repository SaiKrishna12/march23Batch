package day24;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GmailLogin_DataProvider {
	
	@DataProvider(parallel=true)
	public Object[][] getData()
	{
		Object[][] data=new Object[2][3];
		data[0][0]="saikrishna";
		data[0][1]="krishna";
		data[0][2]="firefox";
		
		data[1][0]="saikrishna";
		data[1][1]="krishna";
		data[1][2]="chrome";
		
		return data;
		
	}
	
	
	@Test(dataProvider="getData")
	public void loginTest(String u,String p,String b) throws MalformedURLException
	{
		System.out.println(b);
		DesiredCapabilities cap=null;
		if(b.equals("firefox"))
		{
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.ANY);
		}
		else if(b.equals("chrome"))
		{
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
		}
		
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		driver.get("http://gmail.com");
		driver.findElement(By.name("Email")).sendKeys(u);
		driver.findElement(By.id("Passwd")).sendKeys(p);
		driver.findElement(By.xpath("//*[@id='signIn']")).click();
	}
	

}
