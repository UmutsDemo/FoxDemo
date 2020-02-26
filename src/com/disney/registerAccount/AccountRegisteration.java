/**
 * 
 */
package com.disney.registerAccount;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Fox.Util.utility;

/**
 * @author umutx
 *
 */
public class AccountRegisteration {

	 WebDriver driver;
	
	public AccountRegisteration(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	
	
	
	public void clickshopbtn( String Shopbtn) throws Exception
	{
		// click shop btn
		driver.findElement(By.cssSelector(utility.fetchElementLocaterValue("login_shopbtn_cssselector"))).click();
		
		
	}
	
	
	
	public void clicksinginbtn( String signinbtn) throws Exception
	{
		// click sign in btn
		driver.findElement(By.className(utility.fetchElementLocaterValue("login_signinbtn_classname"))).click();
		
		
	}
	
	
	
	
	
	public void ClickCreateAccountLink( String CreateAccountLink) throws Exception
	{
		
		driver.switchTo().frame("disneyid-iframe");
		System.out.println("driver has switch to iframe ");
		 // click create btn
		  driver.findElement(By.xpath(utility.fetchElementLocaterValue("login_createaccount_xpath"))).click();
		
		
	}
	
	
	
	
	public void EnterFirstName( String FirstName) throws Exception
	{
		
		//driver.switchTo().frame("disneyid-iframe");
		// First name
		  driver.findElement(By.name(utility.fetchElementLocaterValue("signup_firstname_name"))).sendKeys("Test first name");
		
		
	}
	
	
	public void EnterLastName( String LastName) throws Exception
	{
		//driver.switchTo().frame("disneyid-iframe");

		  // last name
		  driver.findElement(By.name(utility.fetchElementLocaterValue("signup_lastname_name"))).sendKeys("Test last name ");
		  
		
		
	}
	
	
	public void EnterEmailAdrress( String EmailAdrress) throws Exception
	{
		//driver.switchTo().frame("disneyid-iframe");
		 //email address
		  driver.findElement(By.name(utility.fetchElementLocaterValue("signup_email_name"))).sendKeys("testmail@gmail.com");
		  
		
		
	}
	
	
	public void EnterPasswrod( String Passwrod) throws Exception
	{
		
		//driver.switchTo().frame("disneyid-iframe");
		// password
		  driver.findElement(By.name(utility.fetchElementLocaterValue("signup_password_name"))).sendKeys("testpass123");
		  
		
	}
	
	
	public void ReenterPassword( String Password) throws Exception
	{
		//driver.switchTo().frame("disneyid-iframe");
		
		 // verify password
		  driver.findElement(By.name(utility.fetchElementLocaterValue("signup_repassword_name"))).sendKeys("testpass123");
		
	}
	
	
	
	public void EnterDateOfBirth( String DateOfBirth) throws Exception
	{
		//driver.switchTo().frame("disneyid-iframe");
		
		// DOB
		  driver.findElement(By.name(utility.fetchElementLocaterValue("signup_dateofbirth_name"))).sendKeys("01231987");
		
	}
	
	public void ClickSubmitBtn( String SubmitBtn) throws Exception
	{
		//driver.switchTo().frame("disneyid-iframe");
		
		// click create btn
		  driver.findElement(By.xpath(utility.fetchElementLocaterValue("signup_createbtn_name"))).click();
		  System.out.println(" step into 0" );
		
	}
	
	
	
	
	
}
