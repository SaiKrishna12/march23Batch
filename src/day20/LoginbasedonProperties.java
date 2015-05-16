package day20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginbasedonProperties {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUp()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("SeleniumUser");
		driver=new FirefoxDriver(fp);
		driver.get("https://gmail.com");
		
	}
	
	@Test
	public void loginTest() throws IOException
	{
		FileInputStream f=new FileInputStream("E:\\March23Batch\\SeleniumAutomation\\Login.properties");
	    Properties pr=new Properties();
	    pr.load(f);
	    driver.findElement(By.id(pr.getProperty("txt_username"))).sendKeys("saikrishna");
	    driver.findElement(By.id(pr.getProperty("txt_password"))).sendKeys("krishna");
	    driver.findElement(By.xpath(pr.getProperty("btn_signin"))).click();
	    
	}

}
