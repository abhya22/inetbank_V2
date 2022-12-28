package inetBanking_V2;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.BaseClass.BaseClass;
import com.inetbanking.PageObject.Deposit;
import com.inetbanking.PageObject.LoginPage;
import com.inetbanking.Utilities.ScreenShots;

public class TC_Deposit_007 extends BaseClass {
	public boolean Test;

	@Test
	public void TestDeposit() throws InterruptedException {

		// 1. Open Base URL
		driver.get(BaseURL);
		Logger.info("Open Base URL");

		// 2. Enter Login Credential
		LoginPage LP = new LoginPage();
		LP.SetUserName(Username);
		Logger.info("Enter Username For Check The Functionality Of TestDeposit");
		LP.SetPassword(Password);
		Logger.info("Enter Password For Check The Functionality Of TestDeposit");
		LP.clicksbmt();
		Logger.info("Click On Submit Button For Check The Functionality Of TestDeposit");

		// 3. Fill Details For Deposit Amount
		Deposit FD = new Deposit();
		FD.NewDeposit();
		Logger.info("Click On New Deposit For Check The Functionality Of TestDeposit");
		FD.AccNo("117021");
		Logger.info("Enter Account Number For Check The Functionality Of TestDeposit");
		FD.amount("500000");
		Logger.info("Enter Deposit Amount For Check The Functionality Of TestDeposit");
		FD.Perticular("New Depsoit");
		Logger.info("Enter Narration For Check The Functionality Of TestDeposit");
		FD.sumbitbtn();
		Logger.info("Succesfully Created Deposit Account");
	
	}
}
