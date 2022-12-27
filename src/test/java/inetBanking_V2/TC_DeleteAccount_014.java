package inetBanking_V2;

import org.testng.annotations.Test;

import com.inetbanking.BaseClass.BaseClass;
import com.inetbanking.PageObject.DeleteAccount;
import com.inetbanking.PageObject.LoginPage;

public class TC_DeleteAccount_014 extends BaseClass {

	@Test
	public void TestDeleteAccount() {

		// 1. Open Base URL
		driver.get(BaseURL);
		Logger.info("Open Base URL");

		// 2. Enter Login Credentials
		LoginPage LP = new LoginPage();
		LP.SetUserName(Username);
		Logger.info("Enter Username For Check The Functionality Of TestDeleteAccount");
		LP.SetPassword(Password);
		Logger.info("Enter Password For Check The Functionality Of TestDeleteAccount");
		LP.clicksbmt();
		Logger.info("Click On Submit Button For Check The Functionality Of TestDeleteAccount");

		// 3. Fill Details For Delete Account
		DeleteAccount DA = new DeleteAccount();
		DA.deleteaccount();
		Logger.info("Click On Delete Account For Check The Functionality Of TestDeleteAccount");
		DA.accountno("117021");
		Logger.info("Enter Account No For Check The Functionality Of TestDeleteAccount");
		DA.submitbtn();
		Logger.info("Account Deleted Succesfully");
	}
}
