package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class DropdownTesting4 {

	
	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("SeleniumUser");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://www.expedia.co.in/Flights");
		
		driver.findElement(By.id("F-NumChild")).sendKeys("3");
		driver.findElement(By.xpath("//*[@id='F-destination']")).click();
		WebElement block=driver.findElement(By.id("flight-children-ages"));
		List<WebElement> dropdowns=block.findElements(By.tagName("select"));
		int count=0;
		for(int i=0;i<dropdowns.size();i++)
		{
			if(dropdowns.get(i).isDisplayed())
			{
				count++;
			}
		}
		System.out.println(count);
		
		
		
	}

}
