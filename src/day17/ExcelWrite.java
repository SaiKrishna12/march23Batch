package day17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	
	public static void main(String[] args) throws IOException {
		FileInputStream f=new FileInputStream("C:\\Users\\sai\\Desktop\\Book2.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		Iterator<Row> row=ws.iterator();
		while(row.hasNext())
		{
			Row r=row.next();
			Cell c=r.createCell(1);
			c.setCellValue("AAA");
		}
		
		//Create rows and insert data
		Row r=ws.createRow(3);
		Cell c=r.createCell(0);
		c.setCellValue("Jmeter");
		c=r.createCell(1);
		c.setCellValue("AAA");
		
		r=ws.getRow(0);
		c=r.getCell(1);
		c.setCellValue("BBB");
		FileOutputStream f1=new FileOutputStream("C:\\Users\\sai\\Desktop\\Book2.xlsx");
		wb.write(f1);
		f1.close();
		
		

	}

}
