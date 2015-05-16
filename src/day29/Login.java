package day29;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Login {
	
	private static Logger log=Logger.getLogger(Login.class.getName());
	public static void main(String[] args) {
		DOMConfigurator.configure("log4j.xml");
		FirefoxDriver driver=new FirefoxDriver();
		log.info("Launch firefox browser");
		
		driver.get("http://gmail.com");
		log.info("Navigate to url");
		
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("saikrishna");
		log.info("Username entered");
		driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("krishna");
		log.info("Password entered");
		driver.findElement(By.xpath("//*[@id='signIn']")).click();
		log.info("Sigin button clicked");

	}

}
