package day21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginusingActions {
	
	
	@Test
	public void loginTest() throws IOException
	{
		FileInputStream f1=new FileInputStream("E:\\March23Batch\\SeleniumAutomation\\Login.properties");
		Properties pr=new Properties();
		pr.load(f1);
		LoginActions keys=new LoginActions();
		FileInputStream f=new FileInputStream("E:\\March23Batch\\SeleniumAutomation\\src\\com\\qedge\\or\\LoginKeywords.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		Iterator<Row> row=ws.iterator();
		row.next();
		while(row.hasNext())
		{
			Row r=row.next();
			String action=r.getCell(3).getStringCellValue();
			if(action.equals("launchBrowser"))
			{
				keys.launchBrowser();
			}
			else if(action.equals("navigate"))
			{
				keys.navigate();
			}
			else if(action.equals("enterUsername"))
			{
				keys.enterUsername(pr.getProperty("txt_username"));
			}
			else if(action.equals("enterPassword"))
			{
				keys.enterPassword(pr.getProperty("txt_password"));
			}
			else if(action.equals("clickLogin"))
			{
				keys.clickLogin(pr.getProperty("btn_signin"));
			}
		}
	}

}
