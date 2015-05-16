
import org.openqa.selenium.firefox.FirefoxDriver;
public class FlashControl {

	 public static void main(String[] args) throws InterruptedException {
		 FirefoxDriver driver = new FirefoxDriver();
		 
		 driver.get("http://www.permadi.com/tutorial/flashjscommand/");
		 driver.manage().window().maximize();
		 FlashObjectWebdriver flashApp = new FlashObjectWebdriver(driver, "myFlashMovie");
		 flashApp.callFlashObject("Play"); // first number
		 Thread.sleep(3000L);
		 flashApp.callFlashObject("StopPlay"); // operation
		 Thread.sleep(5000);
		 
		 
		Thread.sleep(3000L);
		 flashApp.callFlashObject("Rewind");
		 /*System.out.println(flashApp.callFlashObject("GetVariable","/:message"));
		 flashApp.callFlashObject("SetVariable","/:message","Learn Flash testing with Webdriver");
		 System.out.println(flashApp.callFlashObject("GetVariable","/:message"));*/
		 
		 }
		 
		

	

}
