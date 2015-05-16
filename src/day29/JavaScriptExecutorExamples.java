package day29;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecutorExamples {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('Hello Friends');");
		
		Alert alert=driver.switchTo().alert();
		alert.accept();

	}

}
