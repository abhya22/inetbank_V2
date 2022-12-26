package inetBanking_V2;

import org.testng.annotations.Test;

import com.inetbanking.BaseClass.BaseClass;
import com.inetbanking.PageObject.AddNewAccount;
import com.inetbanking.PageObject.LoginPage;

public class TC_AddNewAccount_004 extends BaseClass {
	
	@Test
	public void TestAddNewAccount() {
		
		driver.get(BaseURL);
		Logger.info("Open Base URL");
		
		LoginPage LP = new LoginPage();
		LP.SetUserName(Username);
		Logger.info("Enter UserName");
		LP.SetPassword(Password);
		Logger.info("Enter Password");
		LP.clicksbmt();
		
		AddNewAccount ANA = new AddNewAccount();
		ANA.AddNewCustAcc();
		Logger.info("Click On Add New Customer");
		
		ANA.CustomerID("11220");
		Logger.info("Enter Cutomer ID");
		
		ANA.CustomerAccType();
		Logger.info("Click On Customer Acoount Type");
		
		ANA.CustomerAccType1("Current");
		Logger.info("Enter Cutomer Account Type");
		
		ANA.CustomerInitialDepsoit("10000");
		Logger.info("Enter Cutomer Initial Deposit Amount");
		
		ANA.SubmitButton();
		Logger.info("Account Open Succesfully");
		
	}
}
