/**
 * 
 */
package FoxP1;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.security.UserAndPassword;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
/**
 * @author umutx
 *
 */
public class PreTest {

	//String DriverPath = "C://Users//umutx//eclipse-workspace//FoxProject1//Driver//chromedriver.exe";
	
	WebDriver driver; 
	
	
	@BeforeTest
	public void SetUp() {
		
		System.setProperty("webdriver.chrome.driver","C://Users//umutx//eclipse-workspace//FoxProject1//Driver//chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.disney.com/");
		//driver.get("https://www.amazon.com/");
		
		
		
		// register info 
		String FirstN = "xawkun";
		String LastN = "boran";
		String Email = "Testemail@gmail.com";
		String PWD = "TestPass321";
		String RePWD = "TestPass321";
		String DOB = "09121987";
		
		/*
		 * Important note: instead of converting string into XML or Excel file, 
		 * hard code the values in excel then use Apachi POI to extract the Data 
		 * into fileds.
		 * 
		 * 
		 * 
		 * */ 
		
	}
	
	@Test
	
	public void Excution() throws Exception{
		
		
		driver.manage().window().maximize();
		//shop btn
		driver.findElement(By.cssSelector("#goc-bar-left > li:nth-child(3) > a")).click();
		Thread.sleep(3000);
		//driver.findElement(By.cssSelector("#nav-main > div.nav-left > div.a-section.glow-toaster.glow-toaster-theme-default.glow-toaster-slot-default.nav-coreFlyout.nav-flyout > div > div.glow-toaster-footer > span.a-button.a-spacing-top-base.a-button-base.glow-toaster-button.glow-toaster-button-dismiss > span > input")).click();
		//sign in btn
		driver.findElement(By.className("user-message")).click();
		
		// 
		
		
		
		System.out.println("landded to  shop page successfully!!!  ");
		
		
		
		Thread.sleep(3000);
		
		//driver.switchTo().frame(0);
        //String MainWindow=driver.getWindowHandle();	
        //driver.switchTo().window(MainWindow);
        //driver.switchTo().frame(0);
		
 //       driver.switchTo().window(MainWindow);
//        // To handle all new opened window.				
 //           Set<String> s1=driver.getWindowHandles();		
//        Iterator<String> i1=s1.iterator();		
//        		
 //       while(i1.hasNext())			
//        {		
//            String ChildWindow=i1.next();		
//            		
//            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
//            {    		
//                 
//                    // Switching to Child window
//                    driver.switchTo().window(ChildWindow);	                                                                                                           
                   
                    //driver.switchTo().window(MainWindow);
		
		//driver.findElement(By.cssSelector("#did-ui-view > div > section > section > form > section > div:nth-child(2) > div > label > span.input-wrapper > input")).sendKeys("dsasd");
		
                  //Wait for element to be clickable
                   // WebDriverWait wait = new WebDriverWait(driver, 15);
                    //wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#did-ui-view > div > section > section > form > section > div.btn-group.btn-group-create-account.ng-scope > a")));

                  //  driver.findElement(By.cssSelector("#did-ui-view > div > section > section > form > section > div.btn-group.btn-group-create-account.ng-scope > a")).click();
		
		//driver.findElement(By.cssSelector("#did-ui-view > div > section > section > form > section > div.btn-group.btn-group-create-account.ng-scope > a")).click();
		//driver.findElement(By.className("btn btn-secondary ng-isolate-scope")).click();
                  
		int size = driver.findElements(By.tagName("iframe")).size();
		  System.out.println(" all iframe" + size);
		
		  //Runtime.getRuntime().exec("C:\\Users\\umutx\\OneDrive\\Desktop\\WORKSPSCE\\AutoIT\\Pop up\\Disney");
		//  driver.wait(10000);
		
		  // switching to iframe
		  //driver.switchTo().frame(0);
		  System.out.println(" step into 0" );
		  //String MainWindow=driver.getWindowHandle();	
		  driver.switchTo().frame("disneyid-iframe");
		 // driver.findElement(By.tagName("a")).click();
		 
		  // click create btn
		  driver.findElement(By.xpath("//a[text()=\"Create an Account\"]")).click();
		   
		  // First name
		  driver.findElement(By.name("firstName")).sendKeys("Test first name");
		 
		  // last name
		  driver.findElement(By.name("lastName")).sendKeys("Test last name ");
		  
		  //email address
		  driver.findElement(By.name("email")).sendKeys("testmail@gmail.com");
		  
		  // password
		  driver.findElement(By.name("newPassword")).sendKeys("testpass123");
		  
		  // verify password
		  driver.findElement(By.name("verifyPassword")).sendKeys("testpass123");
		  
		  // DOB
		  driver.findElement(By.name("dateOfBirth")).sendKeys("01231987");
		  
		// click create btn
		  driver.findElement(By.xpath("//button[text()=\"Create Account\"]")).click();
		  System.out.println(" step into 0" );
		  
		  // swich to defulte site.
		  driver.switchTo().defaultContent();
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  // driver.switchTo().window(MainWindow);
       
		// handles all the windows 
		//Set<String> S1 = driver.getWindowHandles();
		//Iterator<String> I1 = S1.iterator();
		 //System.out.println(" step into 1" );
//		while(I1.hasNext())
//		{
//			String PopUpWindow = I1.next();
//			System.out.println(" step into 2" );
//			if (!MainWindow.contentEquals("Create an Account"))
//				
//			{  
				// Switching to Popup window
				//driver.switchTo().window(PopUpWindow);
				//System.out.println(" step into 3" );
				//driver.findElement(By.cssSelector("#did-ui-view > div > section > section > form > section > div.btn-group.btn-group-create-account.ng-scope > a")).click();
				//WebElement clickLink = driver.findElement(By.linkText("Create an Account"));
				//clickLink.click();
				//Thread.sleep(5000);
				
				//driver.switchTo().frame(0);
				//driver.findElement(By.tagName("a")).click();
				//driver.findElement(By.id("disneyid-iframe")).sendKeys("find elment");
				//((JavascriptExecutor) driver).executeScript("arguments[0].click();", elementToClick);
				//driver.findElement(By.xpath("//*[contains('/a']")).click();
				//driver.findElement(By.linkText("Create an Account")).click();
				
				//WebElement El = driver.findElement(By.tagName("a"));
				//driver.findElement(By.partialLinkText(linkText))
				
				//Actions builder = new Actions(driver);
				//builder.moveToElement(El, 751, 0).click().perform();
				//Runtime.getRuntime().exec("C:\\Users\\umutx\\OneDrive\\Desktop\\WORKSPSCE\\AutoIT\\Pop up\\Disney");
				
				
//				List<WebElement> anchors = driver.findElements(By.tagName("a"));
//		        Iterator<WebElement> i = anchors.iterator();
//
//		        while(i.hasNext()) {
//		            WebElement anchor = i.next();
//		            if(anchor.getAttribute("href").contains(href)) {
//		                anchor.click();
//		                break;
//		            }
//		        }
				
				
				
								System.out.println(" step into 4" );
				
				Thread.sleep(5000);
				
				
				
				
	
				
				
				
				
				
				
				
				
				
				
				// build mouse actions
				//Actions builder = new Actions(driver);
				//Actions mouseOverHome = (Actions) builder.moveToElement(clickLink).build();
				
				// make actions
				//mouseOverHome.perform();
				
				
				
				
				
				// close pop up window
				//driver.close();
				
			}
			
			
			
			
			
		//}
		
		
		
		
		
		
		
		
		
		
		
		//driver.switchTo().frame("/html/body/div[2]/div/div/section/section/form/section/div[1]/div/label/span[2]/input");
		
		//Alert Windowalert = driver.switchTo().alert() ;
		//Windowalert.authenticateUsing(new UserAndPassword("TUID","TPWD"));
		
		
		
		
		
		//Thread.sleep(3000);
		
		//Thread.sleep(3000);
		
            //}
        //} 
		
			  
		
		
	//}
	
	
	@AfterTest
	public void Teardown() throws Exception{
		
		
		System.out.println("the test has ended, browser will be close after 5 second");
		Thread.sleep(5000);
		
		driver.close();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
