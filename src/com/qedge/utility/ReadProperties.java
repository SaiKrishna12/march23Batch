package com.qedge.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	
	public String prop(String path,String loc) throws IOException
	{
		FileInputStream f=new FileInputStream(path);
		Properties pr=new Properties();
		pr.load(f);
		return pr.getProperty(loc);
		
		
	}

}
