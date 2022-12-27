package inetBanking_V2;

import org.testng.annotations.Test;

import com.inetbanking.BaseClass.BaseClass;
import com.inetbanking.PageObject.EditCustomer;
import com.inetbanking.PageObject.LoginPage;

public class TC_EditCustomer_004 extends BaseClass {

	@Test
	public void TestEditCustomer() throws InterruptedException {

		// 1. Open Base URL
		driver.get(BaseURL);
		Logger.info("Open Base URL");

		// 2. Enter Login Credentials
		LoginPage LP = new LoginPage();
		LP.SetUserName(Username);
		Logger.info("Enter Username For Check The Functionality Of TestEditCustomer");
		LP.SetPassword(Password);
		Logger.info("Enter Password For Check The Functionality Of TestEditCustomerr");
		LP.clicksbmt();
		Logger.info("Click On Submit Button For Check The Functionality Of TestEditCustomer");

		//3. Fill Details For Edit
		EditCustomer EC = new EditCustomer();
		EC.Editcustomer();
		Logger.info("Click On Edit Customer For Check The Functionality Of TestFundTrf");
		EC.CustID("11220");
		Logger.info("Enter Cust ID For Check The Functionality Of TestFundTrf");
		EC.SubBtn();
		Logger.info("Click On Submit Button For Check The Functionality Of TestFundTrf");
		EC.Address("Walker Road Mahal Nagpur");
		Logger.info("Enter Address For Check The Functionality Of TestFundTrf");
		EC.Submit();
		Logger.info("Customer Edit Succesfully");
	}
}

