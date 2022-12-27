package inetBanking_V2;

import org.testng.annotations.Test;
import com.inetbanking.BaseClass.BaseClass;
import com.inetbanking.PageObject.EditAccount;
import com.inetbanking.PageObject.LoginPage;

public class TC_EditAccount_006 extends BaseClass {

	@Test
	public void TestEditAccount() {

		// 1. Open Base URL
		driver.get(BaseURL);
		Logger.info("Open Base URL");

		// 2. Enter Login Credential
		LoginPage LP = new LoginPage();
		LP.SetUserName(Username);
		Logger.info("Enter Username for check functionality of TestEditAccount");
		LP.SetPassword(Password);
		Logger.info("Enter Password for check functionality of TestEditAccount");
		LP.clicksbmt();
		Logger.info("Click On Submit Button for check functionality of TestEditAccount");
		
		//3. Fill Up EditAccount Details
		EditAccount EA = new EditAccount();
		EA.Editaccount();
		Logger.info("Click on Edit Account check functionality of TestEditAccount");
		EA.Accountno("117021");
		Logger.info("Enter Account Number check functionality of TestEditAccount");
		EA.submitbtn();
		Logger.info("Account Edit Succesfully");
	}
}
