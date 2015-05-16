package day16;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebtableCalander {
	FirefoxDriver  driver=null;
	@BeforeMethod
	public void setUp()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("SeleniumUser");
		driver=new FirefoxDriver();
		driver.get("http://makemytrip.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@Test
	public void calanderTest()
	{
		driver.findElement(By.xpath("//*[@id='one_way_button1']/span")).click();
		driver.findElement(By.id("from_typeahead1")).clear();
		driver.findElement(By.id("from_typeahead1")).sendKeys("Hyderabad, India (HYD)");
		driver.findElement(By.id("to_typeahead1")).sendKeys("Los Angeles, US (LAX)");
		driver.findElement(By.xpath("//*[@id='start_date_sec']/span[2]")).click();
	
	    String doj="12/02/2016";
	    String[] a=doj.split("/");
	    String[] months={"Janauary","February","March","April","May","June","July","August","September","October","November","December"};
	    int x=Integer.parseInt(a[1]);
	    String month=months[x-1];
	    String year=a[2];
	    String day=a[0];
	    
	    String cal_year=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/div/span[2]")).getText();
	    while(!cal_year.equals(year))
	    {
	    	driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[3]/div/a")).click();
	    	cal_year=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/div/span[2]")).getText();
	    	
	    }
	    
	    String cal_month=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/div/span[1]")).getText();
	    while(!cal_month.equals(month))
	    {
	    	driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[3]/div/a")).click();
	    	cal_month=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/div/span[1]")).getText();
	    	
	    }
	    
	    WebElement table=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]"));
	    List<WebElement> rows=table.findElements(By.tagName("tr"));
	    boolean flag=false;
	    for(int i=0;i<rows.size();i++)
	    {
	    	List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
	    	for(int j=0;j<cols.size();j++)
	    	{
	    		if(cols.get(j).getText().equals(day))
	    		{
	    			cols.get(j).click();
	    			flag=true;
	    			break;
	    		}
	    	}
	    	if(flag==true)
	    	{
	    		break;
	    	}
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}
	
	
	
	
	

}
