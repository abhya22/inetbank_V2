package inetBanking_V2;

import org.testng.annotations.Test;

import com.inetbanking.BaseClass.BaseClass;
import com.inetbanking.PageObject.DeleteCustomer;
import com.inetbanking.PageObject.LoginPage;

public class TC_DeleteCustomer_015 extends BaseClass {

	@Test
	public void TestDeleteCutomer() {

		// 1. Open Base URL
		driver.get(BaseURL);
		Logger.info("Open Base URL");

		// 2. Enter Login Credentials
		LoginPage LP = new LoginPage();
		LP.SetUserName(Username);
		Logger.info("Enter Username For Check The Functionality Of TestDeleteCutomer");
		LP.SetPassword(Password);
		Logger.info("Enter Password For Check The Functionality Of TestDeleteCutomer");
		LP.clicksbmt();
		Logger.info("Click On Submit Button For Check The Functionality Of TestDeleteCutomer");

		// 3. Fill Details For Delete Customer
		DeleteCustomer DC = new DeleteCustomer();
		DC.deletecustomer();
		Logger.info("Click On Delete Customer For Check The Functionality Of TestDeleteCutomer");
		DC.accountno("112220");
		Logger.info("Enter Account No For Check The Functionality Of TestDeleteCutomer");
		DC.submitbtn();
		Logger.info("Customer Deleted Succesfully");
	}
}
