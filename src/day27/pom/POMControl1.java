package day27.pom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class POMControl1 {
	
	@Test
	public void pomTest() throws IOException
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("SeleniumUser");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		FileInputStream f=new FileInputStream("E:\\March23Batch\\SeleniumAutomation\\src\\com\\qedge\\excelfiles\\registration11.xlsx");
	    XSSFWorkbook wb=new XSSFWorkbook(f);
	    XSSFSheet ws=wb.getSheet("Sheet1");
	    Iterator<Row> row=ws.iterator();
	    row.next();
	    WelcomeMercuryTours wm=PageFactory.initElements(driver,WelcomeMercuryTours.class);
	    RegisterMercuryTours1 rm1=PageFactory.initElements(driver,RegisterMercuryTours1.class);
	    RegisterMercuryTours2 rm2=PageFactory.initElements(driver,RegisterMercuryTours2.class);
	   wm.menu.registerTest();
	    while(row.hasNext())
	    {
	    	Row r=row.next();
	    	rm1.contactRegistration(r);
	    	boolean b=rm2.validateRegistration(r.getCell(9).getStringCellValue());
	    	Cell c=r.createCell(12);
	    	if(b==true)
	       {
	    	   
	    	   c.setCellValue("Passed");
	       }
	       else
	       {
	    	   c.setCellValue("Failed");
	       }
	    	driver.navigate().back();
	    }
	    FileOutputStream f1=new FileOutputStream("E:\\March23Batch\\SeleniumAutomation\\src\\com\\qedge\\resultexcelfiles\\POMRegistration.xlsx");
	    wb.write(f1);
	    f1.close();
	    
	}

}
