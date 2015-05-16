package OrangeHRM;

import java.io.IOException;

import org.openqa.selenium.By;

public class AddEmployeeActions  extends Constants{
public void clickPim() throws IOException
{
	ts.screenshot(driver,"AddEmloyee");
	String locator=rp.prop(propPath,"pim");
	driver.findElement(By.xpath(locator)).click();
}

public void clickAddEmployee() throws IOException
{
	String locator=rp.prop(propPath,"addemployee");
	driver.findElement(By.id(locator)).click();
}
public void enterFirstName() throws IOException
{
	String locator=rp.prop(propPath,"fname");
	driver.findElement(By.id(locator)).sendKeys("sai");
}
public void enterMiddleName() throws IOException
{
	String locator=rp.prop(propPath,"mname");
	driver.findElement(By.id(locator)).sendKeys("krishna");
}
public void enterLastName() throws IOException
{
	String locator=rp.prop(propPath,"lname");
	driver.findElement(By.id(locator)).sendKeys("g");
}
public void enterempId() throws IOException
{
	String locator=rp.prop(propPath,"empid");
	driver.findElement(By.id(locator)).sendKeys("100");
}
public void checkLoginDetails() throws IOException
{
	String locator=rp.prop(propPath,"createLogin");
	driver.findElement(By.id(locator)).click();
}
public void enterUsername() throws IOException
{
	String locator=rp.prop(propPath,"uname");
	driver.findElement(By.id(locator)).sendKeys("sai123");
}
public void enterPassword() throws IOException
{
	String locator=rp.prop(propPath,"upassword");
	driver.findElement(By.id(locator)).sendKeys("password@123");
}

public void confirmPassword() throws IOException
{
	String locator=rp.prop(propPath,"cpassword");
	driver.findElement(By.id(locator)).sendKeys("password@123");
}
public void enterStatus() throws IOException
{
	String locator=rp.prop(propPath,"status");
	driver.findElement(By.id(locator)).sendKeys("Enabled");
}
public void clickSave() throws IOException
{
	String locator=rp.prop(propPath,"save");
	driver.findElement(By.id(locator)).click();
}

	
	
}
