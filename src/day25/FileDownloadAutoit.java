package day25;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownloadAutoit {

	
	public static void main(String[] args) throws InterruptedException, IOException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://seleniumhq.org");
		driver.findElement(By.linkText("Download")).click();
		driver.findElement(By.linkText("2.45.0")).click();
		Thread.sleep(3000);
		java.lang.Runtime.getRuntime().exec("C:\\Users\\sai\\Desktop\\download.exe");

	}

}
