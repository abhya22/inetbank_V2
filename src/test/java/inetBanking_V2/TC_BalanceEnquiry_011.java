package inetBanking_V2;

import org.testng.annotations.Test;

import com.inetbanking.BaseClass.BaseClass;
import com.inetbanking.PageObject.BalanceEnquiry;
import com.inetbanking.PageObject.LoginPage;

public class TC_BalanceEnquiry_011 extends BaseClass {

	@Test
	public void TestBalanceEnquiry() {

		// 1. Open Base URL
		driver.get(BaseURL);
		Logger.info("Open Base URL");

		// 2. Enter Login Credentials
		LoginPage LP = new LoginPage();
		LP.SetUserName(Username);
		Logger.info("Enter Username For Check The Functionality Of TestBalanceEnquiry");
		LP.SetPassword(Password);
		Logger.info("Enter Password For Check The Functionality Of TestBalanceEnquiry");
		LP.clicksbmt();
		Logger.info("Click On Submit Button For Check The Functionality Of TestBalanceEnquiry");

		// 3. Fill Details For Balance Enquiry
		BalanceEnquiry BE = new BalanceEnquiry();
		BE.balanceenquiry();
		Logger.info("Click On Balance Enquiry For Check The Functionality Of TestBalanceEnquiry");
		BE.accountno("117021");
		Logger.info("Enter Account No For Check The Functionality Of TestBalanceEnquiry");
		BE.submitbtn();
		Logger.info("Balance Check Succesfully");
	}
}
