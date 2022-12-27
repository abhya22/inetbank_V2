package inetBanking_V2;

import org.testng.annotations.Test;

import com.inetbanking.BaseClass.BaseClass;
import com.inetbanking.PageObject.AddNewAccount;
import com.inetbanking.PageObject.LoginPage;

public class TC_AddNewAccount_005 extends BaseClass {

	@Test
	public void TestAddNewAccount() {

		// 1. Open Base URL
		driver.get(BaseURL);
		Logger.info("Open Base URL");

		// 2. Enter Login Credential
		LoginPage LP = new LoginPage();
		LP.SetUserName(Username);
		Logger.info("Enter Username For Check The Functionalilty Of TestAddNewAccount");
		LP.SetPassword(Password);
		Logger.info("Enter Password For Check The Functionalilty Of TestAddNewAccount");
		LP.clicksbmt();
		Logger.info("Click On Submit Button For Check The Functionalilty Of TestAddNewAccount");

		// 3. Fill Details For Add New Account
		AddNewAccount ANA = new AddNewAccount();
		ANA.AddNewCustAcc();
		Logger.info("Click On Add New Customer For Check The Functionalilty Of TestAddNewAccount");
		ANA.CustomerID("11220");
		Logger.info("Enter Customer ID For Check The Functionalilty Of TestAddNewAccount");
		ANA.CustomerAccType();
		Logger.info("Enter Account Type For Check The Functionalilty Of TestAddNewAccount");
		ANA.CustomerAccType1("Current");
		Logger.info("Select Account Type For Check The Functionalilty Of TestAddNewAccount");
		ANA.CustomerInitialDepsoit("10000");
		Logger.info("Enter Deposit Amount For Check The Functionalilty Of TestAddNewAccount");
		ANA.SubmitButton();
		Logger.info("Account Open Succesfully");
	}
}
