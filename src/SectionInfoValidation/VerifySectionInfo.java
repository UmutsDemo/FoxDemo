/**
 * 
 */
package SectionInfoValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Fox.Util.utility;

/**
 * @author umutx
 *
 */
public class VerifySectionInfo {

	 WebDriver driver;
		
		public VerifySectionInfo(WebDriver driver)
		{
			this.driver=driver;
			
		}
		
		public void VerifyVacation() throws Exception
		{
			String SecInfoverify = "Vacation";
			
			// verify account 
			WebElement el =driver.findElement(By.xpath(utility.fetchElementLocaterValue("sectioninfo_verifyva_id")));
			el.getText();
			
			if(el.equals(SecInfoverify)) {
				
				System.out.println("you have log in to your account" + SecInfoverify);
			}
			else if (el.equals("vacation")) {
				
				System.out.println("sorry you havent log in yet " + SecInfoverify);
				
				
			}
			
			
			
		}
		
		
		
		public void Verifygifts() throws Exception
		{
			String SecInfoverify = "Gifts";
			
			// verify account 
			WebElement el =driver.findElement(By.xpath(utility.fetchElementLocaterValue("sectioninfo_verifygi_id")));
			el.getText();
			
			if(el.equals(SecInfoverify)) {
				
				System.out.println("you have log in to your account" + SecInfoverify);
			}
			else if (el.equals("GIFT")) {
				
				System.out.println("sorry you havent log in yet " + SecInfoverify);
				
				
			}
			
			
			
		}
		
		
		
		public void Verifytoys() throws Exception
		{
			String SecInfoverify = "Toys";
			
			// verify account 
			WebElement el =driver.findElement(By.xpath(utility.fetchElementLocaterValue("sectioninfo_verifyto_id")));
			el.getText();
			
			if(el.equals(SecInfoverify)) {
				
				System.out.println("you have log in to your account" + SecInfoverify);
			}
			else if (el.equals("Toy")) {
				
				System.out.println("sorry you havent log in yet " + SecInfoverify);
				
				
			}
			
			
			
		}
		
		
		
		public void Verifyclothing() throws Exception
		{
			String SecInfoverify = "Clothing";
			
			// verify account 
			WebElement el =driver.findElement(By.xpath(utility.fetchElementLocaterValue("sectioninfo_verifycl_id")));
			el.getText();
			
			if(el.equals(SecInfoverify)) {
				
				System.out.println("you have log in to your account" + SecInfoverify);
			}
			else if (el.equals("Cloth")) {
				
				System.out.println("sorry you havent log in yet " + SecInfoverify);
				
				
			}
			
			
			
		}
		
		
		
		
		public void Verifyaccessories() throws Exception
		{
			String SecInfoverify = "Accessories";
			
			// verify account 
			WebElement el =driver.findElement(By.xpath(utility.fetchElementLocaterValue("sectioninfo_verifyac_id")));
			el.getText();
			
			if(el.equals(SecInfoverify)) {
				
				System.out.println("you have log in to your account" + SecInfoverify);
			}
			else if (el.equals("Accessory")) {
				
				System.out.println("sorry you havent log in yet " + SecInfoverify);
				
				
			}
			
			
			
		}
		
		
		
		
		public void Verifyhome() throws Exception
		{
			String SecInfoverify = "Home";
			
			// verify account 
			WebElement el =driver.findElement(By.xpath(utility.fetchElementLocaterValue("sectioninfo_verifyho_id")));
			el.getText();
			
			if(el.equals(SecInfoverify)) {
				
				System.out.println("you have log in to your account" + SecInfoverify);
			}
			else if (el.equals("Homes")) {
				
				System.out.println("sorry you havent log in yet " + SecInfoverify);
				
				
			}
			
			
			
		}
		
		
		
		
		
	public void Verifyparks() throws Exception {
		String SecInfoverify = "Parks";

		// verify account
		WebElement el = driver.findElement(By.xpath(utility.fetchElementLocaterValue("sectioninfo_verifypa_id")));
		el.getText();

		if (el.equals(SecInfoverify)) {

			System.out.println("you have log in to your account" + SecInfoverify);
		} else if (el.equals("Park")) {

			System.out.println("sorry you havent log in yet " + SecInfoverify);

		}

	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
}
