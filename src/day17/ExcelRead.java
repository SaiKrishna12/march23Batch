package day17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		FileInputStream f=new FileInputStream("C:\\Users\\sai\\Desktop\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		Iterator<Row> row=ws.iterator();
		while(row.hasNext())
		{
			Row r=row.next();
			Iterator<Cell> cell=r.iterator();
			while(cell.hasNext())
			{
				Cell c=cell.next();
				System.out.print(c.getStringCellValue()+"  ");
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
