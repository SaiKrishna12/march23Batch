package day23;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DatadrivenTestingOnGrid {
	@Parameters("browser")
	@Test
	public void linksTest(String b) throws IOException
	{
		System.out.println(b);
		DesiredCapabilities cap=null;
		if(b.equals("firefox"))
		{
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.ANY);
		}
		else if(b.equals("chrome"))
		{
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
		}
		
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		driver.get("http://newtours.demoaut.com");
		FileInputStream f=new FileInputStream("E:\\March23Batch\\SeleniumAutomation\\src\\com\\qedge\\excelfiles\\links.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		Iterator<Row> row=ws.iterator();
		row.next();
		while(row.hasNext())
		{
			Row r=row.next();
			try
			{
			   String linkname=r.getCell(0).getStringCellValue();
			   driver.findElement(By.linkText(linkname)).click();
			   String acturl=driver.getCurrentUrl();
			   Cell c=r.createCell(2);
			   c.setCellValue(acturl);
			   String expurl=r.getCell(1).getStringCellValue();
			   c=r.createCell(3);
			   if(acturl.equals(expurl))
			   {
				   c.setCellValue("Passed");
			   }
			   else
			   {
				   c.setCellValue("Failed");
			   }
			driver.navigate().back();
		   
			}
			catch(Exception e)
			{
				Cell c=r.createCell(3);
				c.setCellValue("Links not present");
			}
		}
		FileOutputStream f1=new FileOutputStream("E:\\March23Batch\\SeleniumAutomation\\src\\com\\qedge\\resultexcelfiles\\"+b+"_links.xlsx");
		wb.write(f1);
		f1.close();
}
}
