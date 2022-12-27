package inetBanking_V2;

import org.testng.annotations.Test;

import com.inetbanking.BaseClass.BaseClass;
import com.inetbanking.PageObject.LoginPage;
import com.inetbanking.PageObject.Withdrawal;

public class TC_Withdrawal_008 extends BaseClass {

	@Test
	public void TestWithdrawal() {

		// 1. Open Base URL
		driver.get(BaseURL);
		Logger.info("Open Base URL");

		// 2. Enter Login Credential
		LoginPage LP = new LoginPage();
		LP.SetUserName(Username);
		Logger.info("Enter Username for check functionality of TestWithdrawal");
		LP.SetPassword(Password);
		Logger.info("Enter Password for check functionality of TestWithdrawal");
		LP.clicksbmt();
		Logger.info("Click On Submit Button for check functionality of TestWithdrawal");

		// 3. Fill Up Withdrawal Details
		Withdrawal WA = new Withdrawal();
		WA.Withdraw();
		Logger.info("Click On Withdrawal for check functionality of TestWithdrawal");
		WA.AccountNo("117021");
		Logger.info("Enter Account Number for check functionality of TestWithdrawal");
		WA.WithdrawAmount("10000");
		Logger.info("Enter Amount for check functionality of TestWithdrawal");
		WA.Perticular("For Purchasing Plot");
		Logger.info("Enter Narration for check functionality of TestWithdrawal");
		WA.Submitbtn();
		Logger.info("Amount Withdrawal Succesfully");
	}
}
