package com.Fox.Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class utility {

	
	public static Object fetchPropertiesValue(String key) throws IOException
	{
		
		
		
		
		FileInputStream file = new FileInputStream("/FoxProject1/Config/Config.properties");
		
		Properties property = new Properties();
		
		property.load(file);
		
		return property.get(key);
	}
	
	
	
	public static String fetchElementLocaterValue(String key) throws IOException
	{
		
		
		
		
		FileInputStream file = new FileInputStream("/FoxProject1/Config/Elements.properties");
		
		Properties property = new Properties();
		
		property.load(file);
		
		return property.get(key).toString();
	}
	
	
	
	
	
}
