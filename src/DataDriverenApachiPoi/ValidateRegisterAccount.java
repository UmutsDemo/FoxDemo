/**
 * 
 */
package DataDriverenApachiPoi;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.FoxAutomation.driver.DriverInstances;
import com.disney.registerAccount.AccountRegisteration;

/**
 * @author umutx
 *
 */
public class ValidateRegisterAccount extends DriverInstances{

	
	@Test(dataProvider="RegisterData")
	public static void validateAccountRegistration(String FirstName, String LastName, String EmailAdrress, String Passwrod, String ReenterPassword, String DateOfBirth ) throws Exception
	
	{
	
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
		//register.clicksinginbtn(null);
		
		
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
			testData[i][0] = usernameF.getStringCellValue();
			testData[i][1] = usernameL.getStringCellValue();
			
		}
		
		return testData; 
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
