package day21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.Test;

public class Registration  extends Launch{
	
	@Test
	public void registrationTest() throws IOException
	{
	
	
	driver.findElement(By.linkText("REGISTER")).click();
	
	FileInputStream f=new FileInputStream("E:\\March23Batch\\SeleniumAutomation\\src\\com\\qedge\\excelfiles\\registration11.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(f);
	XSSFSheet ws=wb.getSheet("Sheet1");
	
	Iterator<Row> row=ws.iterator();
	row.next();
	while(row.hasNext())
	{
		Row r=row.next();
		driver.findElement(By.name("firstName")).sendKeys(r.getCell(0).getStringCellValue());
		driver.findElement(By.name("lastName")).sendKeys(r.getCell(1).getStringCellValue());
		driver.findElement(By.name("phone")).sendKeys(Long.toString((long)r.getCell(2).getNumericCellValue()));
		driver.findElement(By.name("userName")).sendKeys(r.getCell(3).getStringCellValue());
		driver.findElement(By.name("address1")).sendKeys(r.getCell(4).getStringCellValue());
		driver.findElement(By.name("city")).sendKeys(r.getCell(5).getStringCellValue());
		driver.findElement(By.name("state")).sendKeys(r.getCell(6).getStringCellValue());
		driver.findElement(By.name("postalCode")).sendKeys(Long.toString((long)r.getCell(7).getNumericCellValue()));
		driver.findElement(By.name("country")).sendKeys(r.getCell(8).getStringCellValue());
		driver.findElement(By.name("email")).sendKeys(r.getCell(9).getStringCellValue());
		driver.findElement(By.name("password")).sendKeys(r.getCell(10).getStringCellValue());
		driver.findElement(By.name("confirmPassword")).sendKeys(r.getCell(11).getStringCellValue());
		driver.findElement(By.name("register")).click();
		String x=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
		Cell c=r.createCell(12);
		if(x.contains(r.getCell(9).getStringCellValue()))
		{
			c.setCellValue("Passed");
		}
		else
		{
			c.setCellValue("Failed");
		}
		driver.navigate().back();
	}
	FileOutputStream f1=new FileOutputStream("E:\\March23Batch\\SeleniumAutomation\\src\\com\\qedge\\resultexcelfiles\\regResults.xlsx");
	wb.write(f1);
	f1.close();
	
	
	}
}
