package day9;

import org.testng.annotations.Test;

public class Sample {
	
	@Test(priority=1)
	public void loginTest()
	{
		System.out.println("This is for login  app");
	}
	@Test(priority=2)
	public void regTest()
	{
		System.out.println("This is for registration app");
	}
	@Test(enabled=false)
	public void logoutTest()
	{
			System.out.println("This is for logout");
	}
	
	

}
