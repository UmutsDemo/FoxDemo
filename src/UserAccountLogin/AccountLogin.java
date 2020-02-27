/**
 * 
 */
package UserAccountLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Fox.Util.utility;

/**
 * @author umutx
 *
 */
public class AccountLogin {

	WebDriver driver;

	public AccountLogin(WebDriver driver) {

		this.driver = driver;

	}

	public void EnterUserId() throws Exception {
		String UserID = "xiaokelaiti.wumiti@gmail.com";

		// type UID
		driver.findElement(By.xpath(utility.fetchElementLocaterValue("signin_userid_xpath"))).sendKeys(UserID);

		return;

	}

	public void EnterUserPWD() throws Exception {
		String UserPWD = "umut8021059";

		// TypePWD
		driver.findElement(By.xpath(utility.fetchElementLocaterValue("signin_userpwd_xpath"))).sendKeys(UserPWD);

		return;
	}

	public void ClickSignInBtn() throws Exception {

		// click sign in Btn
		driver.findElement(By.xpath(utility.fetchElementLocaterValue("signin_usersigninbtn_xpath"))).click();

		return;
	}

	public void VerifyAccountLogin() throws Exception {
		String ACverify = "My Bag";

		// verify account
		WebElement el = driver
				.findElement(By.xpath(utility.fetchElementLocaterValue("accountverify_shoppingbag_xpath")));
		el.getText();

		if (el.equals(ACverify)) {

			System.out.println("you have log in to your account" + ACverify);
		} else if (el.equals("Bags")) {

			System.out.println("sorry you havent log in yet " + ACverify);

		}

	}

}
