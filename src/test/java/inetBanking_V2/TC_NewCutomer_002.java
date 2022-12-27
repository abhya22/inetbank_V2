package inetBanking_V2;

import org.testng.annotations.Test;

import com.inetbanking.BaseClass.BaseClass;
import com.inetbanking.PageObject.LoginPage;
import com.inetbanking.PageObject.NewCutomer;

public class TC_NewCutomer_002 extends BaseClass {

	@Test
	public void TestNewCust() {

		// 1. Open Base URL
		driver.get(BaseURL);
		Logger.info("Open BaseURL");

		// 2. Enter Login Credential
		LoginPage LP = new LoginPage();
		LP.SetUserName(Username);
		Logger.info("Enter Username For Check Functionality Of TestNewCust");
		LP.SetPassword(Password);
		Logger.info("Enter Password For Check Functionality Of TestNewCust");
		LP.clicksbmt();
		Logger.info("Click On Submit Buttton For Check Functionality Of TestNewCust");

		// 3. Click On New Customer
		NewCutomer cust = new NewCutomer();
		cust.NC();
		Logger.info("Click On New Customer Succesfully");
	}
}
