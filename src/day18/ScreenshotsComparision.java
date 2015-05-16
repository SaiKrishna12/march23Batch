package day18;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenshotsComparision {
	FirefoxDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("http://google.com");
	}
	
	@Test
	public void screenshotTest() throws IOException
	{
		File srcFile1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		driver.get("http://msn.com");
		File srcFile2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		if(FileUtils.contentEquals(srcFile1,srcFile2))
		{
			System.out.println("Screenshots are same");
		}
		else
		{
			System.out.println("Screenshots are different");
		}
		
	}

}
