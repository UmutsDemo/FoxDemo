/**
 * 
 */
package DataDriverenApachiPoi;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.FoxAutomation.driver.DriverInstances;
import com.disney.registerAccount.AccountRegisteration;

import SectionInfoValidation.VerifySectionInfo;
import UserAccountLogin.AccountLogin;

/**
 * @author umutx
 *
 */
public class ValidateRegisterAccount extends DriverInstances{

	
	@Test
	(dataProvider="RegisterData")
	
	public static void validateAccountRegistration(String FirstName, String LastName, String EmailAdrress, String Passwrod, String ReenterPassword, String DateOfBirth ) throws Exception
	
	{
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		AccountRegisteration register = new AccountRegisteration(driver);
		
		register.clickshopbtn(null);
		register.clicksinginbtn(null);
		driver.switchTo().frame("disneyid-iframe");
		register.ClickCreateAccountLink(null);
		register.EnterFirstName(FirstName);
		register.EnterLastName(LastName);
		register.EnterEmailAdrress(EmailAdrress);
		register.EnterPasswrod(Passwrod);
		register.ReenterPassword(ReenterPassword);
		register.EnterDateOfBirth(DateOfBirth);
		register.clicksinginbtn(null);
		
		
		System.out.println("<===========================>");
		System.out.println("<=========Account registration is compelete !!!! ========>");
		System.out.println("<===========================>");
	}
	
	
	
	@Test	
	(dataProvider="AccountLoginData")
	
	public static void UserAccountSignIn(String UserID, String UserPWD) throws Exception
	{
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		AccountLogin Login = new AccountLogin(driver);
		
		Login.EnterUserId();
		Login.EnterUserPWD();
		Login.ClickSignInBtn();
		
		
		System.out.println("<===========================>");
		System.out.println("<=========Account Login is compelete !!!! ========>");
		System.out.println("<===========================>");
		
		
		
	}
	
	
	
	@Test
	(priority=3)
	
	public static void SectionInfoValidation() throws Exception
	{
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		VerifySectionInfo Verification = new VerifySectionInfo(driver);
		
		Verification.VerifyVacation();
		Verification.Verifygifts();
		Verification.Verifytoys();
		Verification.Verifyclothing();
		Verification.Verifyaccessories();
		Verification.Verifyhome();
		Verification.Verifyparks();
		
		
		
		
		
		
		System.out.println("<===========================>");
		System.out.println("<=========Account SectionInfo Verification is compelete !!!! ========>");
		System.out.println("<===========================>");
		
		
		
		
	}
	
	
	
	
	
	@DataProvider(name="RegisterData")
	public Object[][] TestDateGenerator() throws Exception
	{
		FileInputStream datafile = new FileInputStream("/FoxProject1/ExcelFolder/sheet.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(datafile);
		XSSFSheet RegisterSheet = workbook.getSheet("Registerinfo");
		int numberofData = RegisterSheet.getPhysicalNumberOfRows();
		Object [][] testData = new Object [numberofData][2]; 
		
		
		for (int i=0; i<numberofData; i++)
		{
			
			XSSFRow row = RegisterSheet.getRow(i);
			XSSFCell usernameF = row.getCell(0);
			XSSFCell usernameL = row.getCell(1);
			XSSFCell emailaddr = row.getCell(2);
			XSSFCell accountPwd = row.getCell(3);
			XSSFCell repwd = row.getCell(4);
			XSSFCell dateofbirth = row.getCell(5);
			
			testData[i][0] = usernameF.getStringCellValue();
			testData[i][1] = usernameL.getStringCellValue();
			testData[i][2] = emailaddr.getStringCellValue();
			testData[i][3] = accountPwd.getStringCellValue();
			testData[i][4] = repwd.getStringCellValue();
			testData[i][5] = dateofbirth.getStringCellValue();
			
			
		}
		
		return testData; 
		
	}
	
	
	@DataProvider(name="AccountLoginData")
	public Object[][] LoginTestDateGenerator() throws Exception
	{
		FileInputStream datafile = new FileInputStream("/FoxProject1/ExcelFolder/AccountLoginInfo.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(datafile);
		XSSFSheet RegisterSheet = workbook.getSheet("LoginInfo");
		int numberofData = RegisterSheet.getPhysicalNumberOfRows();
		Object [][] testData = new Object [numberofData][2]; 
		
		
		for (int i=0; i<numberofData; i++)
		{
			
			XSSFRow row = RegisterSheet.getRow(i);
			XSSFCell usernameU = row.getCell(0);
			XSSFCell usernameP = row.getCell(1);
			testData[i][0] = usernameU.getStringCellValue();
			testData[i][1] = usernameP.getStringCellValue();
			
		}
		
		return testData; 
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
