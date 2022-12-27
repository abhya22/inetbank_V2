package inetBanking_V2;

import org.testng.annotations.Test;

import com.inetbanking.BaseClass.BaseClass;
import com.inetbanking.PageObject.ChangePassword;
import com.inetbanking.PageObject.LoginPage;

public class TC_ChangePassword_010 extends BaseClass {

	@Test
	public void TestChangePassword() {

		// 1. Open Base URL
		driver.get(BaseURL);
		Logger.info("Open Base URL");

		// 2. Enter Login Credentials
		LoginPage LP = new LoginPage();
		LP.SetUserName(Username);
		Logger.info("Enter Username For Check The Functionality Of TestChangePassword");
		LP.SetPassword(Password);
		Logger.info("Enter Password For Check The Functionality Of TestChangePassword");
		LP.clicksbmt();
		Logger.info("Click On Submit Button For Check The Functionality Of TestChangePassword");

		// 3. Fill Details For Change Password
		ChangePassword CP = new ChangePassword();
		CP.changepassword();
		Logger.info("Click On Change Password For Check Functionality Of TestChangePassword");
		CP.oldpassword("Abhishek@123");
		Logger.info("Enter Old Password For Check Functionality Of TestChangePassword");
		CP.newpassword("Abhishek@1234");
		Logger.info("Enter New Password For Check Functionality Of TestChangePassword");
		CP.confirmnewpassword("Abhishek@1234");
		Logger.info("Enter Confirm Password For Check Functionality Of TestChangePassword");
		CP.submitbtn();
		Logger.info("PAssword Change Succesfully");
	}
}
