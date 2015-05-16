package day27;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import day27.pom.WelcomeMercuryTours;
import day3.Profiles;

public class POMControl {
	
	@Test
	public void POMTest()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("SeleniumUser");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		WelcomeMercuryTours wm=PageFactory.initElements(driver,WelcomeMercuryTours.class);
		wm.findAFlight("admin","admin");
		driver.navigate().back();
		wm.registerHere();
		driver.navigate().back();
		wm.featuredVacations();
		/*wm.menu.contactTest();
		driver.navigate().back();
		wm.menu.registerTest();*/
		
	}

}
