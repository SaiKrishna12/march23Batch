package OrangeHRM;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.testng.annotations.Test;

public class LoginusingReflections  extends Constants{
	LoginActions keys=new LoginActions();
	Method[] methods=keys.getClass().getMethods();
	@Test
	public void loginTest() throws IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		
		XSSFSheet ws=eo.excelRead(actKeyPath,"Sheet1");
        Iterator<Row> row=ws.iterator();
        row.next();
        while(row.hasNext())
        {
        	Row r=row.next();
        	String action=r.getCell(3).getStringCellValue();
        	executeActions(action);
        }
        
	}   
public void executeActions(String action) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException
{
	for(int i=0;i<methods.length;i++)
	{
		if(action.equals(methods[i].getName()))
		{
			methods[i].invoke(keys);
		}
	}
}
	}
