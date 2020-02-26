package com.FoxAutomation.driver;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.Fox.Util.utility;

public class DriverInstances {

	
	public static WebDriver driver;
	
	@BeforeMethod
	public void initiateDriverInstance() throws Exception
	
	{
		
		if(utility.fetchPropertiesValue("browserName").toString().equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "/FoxProject1/Driver/chromedriver.exe");
			driver = new ChromeDriver();
			
		}
	

		else if(utility.fetchPropertiesValue("browserName").toString().equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "/FoxProject1/Driver/geckodriver.exe");
			driver = new FirefoxDriver();
		}
	
	
		else if(utility.fetchPropertiesValue("browserName").toString().equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.ie.driver", "/FoxProject1/Driver/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
	
	
		else 
		{
			System.setProperty("webdriver.chrome.driver", "/FoxProject1/Driver/chromedriver.exe");
			driver = new ChromeDriver();
			
			
		}
	
	
	
		driver.get(utility.fetchPropertiesValue("appURL").toString());
	
	
	
	
	
	
	
	
	
	
	}
		
	
	
	
	
	
	
	
	

	@AfterMethod
	public void closeDriverInstance()
	
	
	{
		
		driver.quit();
		System.out.println("driver has been close!!!");
		
		
	}
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

