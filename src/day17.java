import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class day17 {
	public static void main(String [] args)
	{
	
		FirefoxDriver driver=new FirefoxDriver();
	 
		driver.get("http://google.com/");
	 
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//Navigate to new Page
		js.executeScript("window.location = 'https://www.facebook.com'");



		
		
		}
	 
	  
	
}

