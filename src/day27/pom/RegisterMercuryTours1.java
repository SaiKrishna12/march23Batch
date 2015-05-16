package day27.pom;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterMercuryTours1 {
	
	@FindBy(name="firstName")
	WebElement firstname;
	@FindBy(name="lastName")
	WebElement lastname;
	@FindBy(name="phone")
	WebElement phone;
	@FindBy(name="userName")
	WebElement email;
	@FindBy(name="address1")
	WebElement address;
	@FindBy(name="city")
	WebElement city;
	@FindBy(name="state")
	WebElement state;
	@FindBy(name="postalCode")
	WebElement pastalcode;
	@FindBy(name="country")
	WebElement country;
	@FindBy(name="email")
	WebElement username;
	@FindBy(name="password")
	WebElement password;
	@FindBy(name="confirmPassword")
	WebElement cpassword;
	@FindBy(name="register")
	WebElement register;
	public void contactRegistration(Row r)
	{
		firstname.sendKeys(r.getCell(0).getStringCellValue());
		lastname.sendKeys(r.getCell(1).getStringCellValue());
		phone.sendKeys(Long.toString((long)r.getCell(2).getNumericCellValue()));
		email.sendKeys(r.getCell(3).getStringCellValue());
		address.sendKeys(r.getCell(4).getStringCellValue());
		city.sendKeys(r.getCell(5).getStringCellValue());
		state.sendKeys(r.getCell(6).getStringCellValue());
		pastalcode.sendKeys(Long.toString((long)r.getCell(7).getNumericCellValue()));
		country.sendKeys(r.getCell(8).getStringCellValue());
		username.sendKeys(r.getCell(9).getStringCellValue());
		password.sendKeys(r.getCell(10).getStringCellValue());
		cpassword.sendKeys(r.getCell(11).getStringCellValue());
		register.click();
	}

}
