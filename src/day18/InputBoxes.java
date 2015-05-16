package day18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InputBoxes {
	FirefoxDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("http://twitter.com");
	}
	
	@Test
	public void  inputBoxTest()
	{
		List<WebElement> input=driver.findElements(By.xpath("//input[@type='text' or @type='password']"));
		System.out.println(input.size());
		String[] str={"one","two","three","four","five"};
		int j=0;
		for(int i=0;i<input.size();i++)
		{
			if(input.get(i).isDisplayed())
			{
				input.get(i).sendKeys(str[j]);
				j++;
			}
			
		}
	}

}
