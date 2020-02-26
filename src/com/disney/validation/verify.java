package com.disney.validation;

import org.openqa.selenium.WebDriver;

public class verify {

	
	public static boolean verifyPageURL(WebDriver driver, String ExpURL) 
	
	{
		
		boolean flag = false; 
		if(driver.getCurrentUrl().equalsIgnoreCase(ExpURL));
		{
			
			flag = true;
			
		}
			return flag; 
		
		
		
	}
	
	
	
	public static boolean verifyPageSectionInfo(WebDriver driver, String ExpTitle) 
	
	{
		
		boolean flag = false; 
		if(driver.getTitle().equalsIgnoreCase(ExpTitle));
		{
			
			flag = true;
			
		}
			return flag; 
		
		
		
	}
	
	
	// validate section info 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
