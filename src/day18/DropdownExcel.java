package day18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropdownExcel {
	FirefoxDriver driver=null;
	@BeforeMethod
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.findElement(By.linkText("REGISTER")).click();
	}
	@Test
	public void dropdowntest() throws IOException
	{
		FileInputStream f=new FileInputStream("C:\\Users\\sai\\Desktop\\dropdown.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		Row row;
		Cell cell;
		
		WebElement drop=driver.findElement(By.name("country"));
		List<WebElement> dropdown=drop.findElements(By.tagName("option"));
		
		for(int i=0;i<dropdown.size();i++)
		{
			row=ws.createRow(i);
			cell=row.createCell(0);
			cell.setCellValue(dropdown.get(i).getText());
			dropdown.get(i).click();
			cell=row.createCell(1);
			if(dropdown.get(i).isSelected())
			{
				cell.setCellValue("True");
			}
			else
			{
				cell.setCellValue("False");
			}
		}
		FileOutputStream f1=new FileOutputStream("C:\\Users\\sai\\Desktop\\dropdown.xlsx");
		wb.write(f1);
		f1.close();
		driver.close();
		
		
		
		
		
		
	}

}
