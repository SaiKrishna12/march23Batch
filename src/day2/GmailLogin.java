package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLogin {

	
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.findElement(By.name("Email")).sendKeys("saikrishna123");
		driver.findElement(By.id("Passwd")).sendKeys("krishna123");
		driver.findElement(By.xpath("//*[@id='signIn']")).click();
		
		
		
		
		
		
		

	}

}
