import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Project {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://validus-tech.com/EMS/SignIn/Signin.aspx");
		driver.findElement(By.id("txtCompany")).clear();
		driver.findElement(By.id("txtCompany")).sendKeys("Navitas");
		driver.findElement(By.id("txtEmail")).sendKeys("info@navitas-tech.com");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnSignIn")).click();
	}

}
