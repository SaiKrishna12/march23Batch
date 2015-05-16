package com.qedge.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakingScreenshots {
	
	public void screenshot(WebDriver driver,String name) throws IOException
	{
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
	    FileUtils.copyFile(srcFile,new File("E:\\March23Batch\\SeleniumAutomation\\src\\com\\qedge\\screesnshots\\"+name+".png"));
	}

}
