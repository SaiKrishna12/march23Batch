package day22;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GmailLogin {
	
	@Test
	public void loginTesT() throws IOException
	{
		DesiredCapabilities cap=null;
		cap=DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		driver.get("http://gmail.com");
		driver.findElement(By.name("Email")).sendKeys("saikrishna123");
		driver.findElement(By.id("Passwd")).sendKeys("krishna123");
		driver.findElement(By.xpath("//*[@id='signIn']")).click();
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile,new File("C:\\Users\\sai\\Desktop\\Gmail.png"));
		
		
		
		
		
		
		
		
		
		
		
		
		 
	}

}
