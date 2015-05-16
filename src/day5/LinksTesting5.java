package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class LinksTesting5 {

	
	public static void main(String[] args) throws InterruptedException {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("SeleniumUser");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://bbc.com");
		WebElement block=driver.findElement(By.xpath("//*[@id='most_popular_tabs_read']/ul"));
		List<WebElement> links=block.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
			links.get(i).click();
			System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
			Thread.sleep(5000);
			block=driver.findElement(By.xpath("//*[@id='most_popular_tabs_read']/ul"));
			links=block.findElements(By.tagName("a"));
		}
	}

}
