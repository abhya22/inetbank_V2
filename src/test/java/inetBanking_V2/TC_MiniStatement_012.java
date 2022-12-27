package inetBanking_V2;

import org.testng.annotations.Test;
import com.inetbanking.BaseClass.BaseClass;
import com.inetbanking.PageObject.LoginPage;
import com.inetbanking.PageObject.MiniStatement;

public class TC_MiniStatement_012 extends BaseClass {

	@Test
	public void TestMiniStatement() {

		// 1. Open Base URL
		driver.get(BaseURL);
		Logger.info("Open Base URL");

		// 2. Enter Login Credentials
		LoginPage LP = new LoginPage();
		LP.SetUserName(Username);
		Logger.info("Enter Username For Check The Functionality Of TestMiniStatement");
		LP.SetPassword(Password);
		Logger.info("Enter Password For Check The Functionality Of TestMiniStatement");
		LP.clicksbmt();
		Logger.info("Click On Submit Button For Check The Functionality Of TestMiniStatement");

		// 3. Fill Details For Mini Statement
		MiniStatement MS = new MiniStatement();
		MS.ministatement();
		Logger.info("Click On Mini Statement For Check The Functionality Of TestMiniStatement");
		MS.accountno("117021");
		Logger.info("Enter Account No For Check The Functionality Of TestMiniStatement");
		MS.submitbtn();
		Logger.info("Mini Statement Show Succesfully");
	}
}
