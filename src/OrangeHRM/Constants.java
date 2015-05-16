package OrangeHRM;

import org.openqa.selenium.firefox.FirefoxDriver;

import com.qedge.utility.ExcelOperations;
import com.qedge.utility.ReadProperties;
import com.qedge.utility.TakingScreenshots;

public class Constants {
	static FirefoxDriver driver;
	ExcelOperations eo=new ExcelOperations();
	String actKeyPath="E:\\March23Batch\\SeleniumAutomation\\src\\com\\qedge\\or\\ActionsKeywords.xlsx";
    ReadProperties rp=new ReadProperties();
    String propPath="E:\\March23Batch\\SeleniumAutomation\\OrangeHRM.properties";
   TakingScreenshots ts=new TakingScreenshots();
}
