package day25;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadAutoit {

	public static void main(String[] args) throws IOException, InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://imgur.com");
		driver.findElement(By.xpath("//*[@id='main-nav']/ul/li[2]/a/span[1]")).click();
		driver.findElement(By.id("SWFUpload_0")).click();
		Thread.sleep(3000);
		java.lang.Runtime.getRuntime().exec("C:\\Users\\sai\\Desktop\\upload.exe");
		
		
		
		

	}

}
