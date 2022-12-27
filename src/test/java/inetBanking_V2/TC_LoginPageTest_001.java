package inetBanking_V2;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.inetbanking.BaseClass.BaseClass;
import com.inetbanking.PageObject.LoginPage;

public class TC_LoginPageTest_001 extends BaseClass {

	@Test
	public void TestLoginPage() {

		// 1. Open Base URL
		driver.get(BaseURL);
		Logger.info("Open BaseURL");

		// 2. Enter Login Credential
		LoginPage LP = new LoginPage();
		LP.SetUserName(Username);
		Logger.info("Enter Username For Check The Functionality Of TestLoginPage");
		LP.SetPassword(Password);
		Logger.info("Enter Password For Check The Functionality Of TestLoginPage");
		LP.clicksbmt();
		Logger.info("Click On Submit Button For Check The Functionality Of TestLoginPage");

		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			Logger.info("Login Test Case :- Pass");
		} else {
			Assert.assertTrue(true);
			Logger.info("Login Test Case :- Fail");
		}
	}
}
