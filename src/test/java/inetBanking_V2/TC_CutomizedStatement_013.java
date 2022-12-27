package inetBanking_V2;

import org.testng.annotations.Test;
import com.inetbanking.BaseClass.BaseClass;
import com.inetbanking.PageObject.CutomizedStatement;
import com.inetbanking.PageObject.LoginPage;

public class TC_CutomizedStatement_013 extends BaseClass {

	@Test
	public void TeetCutomizedStatement() {

		// 1. Open Base URL
		driver.get(BaseURL);
		Logger.info("Open Base URL");

		// 2. Enter Login Credentials
		LoginPage LP = new LoginPage();
		LP.SetUserName(Username);
		Logger.info("Enter Username For Check The Functionality Of TeetCutomizedStatement");
		LP.SetPassword(Password);
		Logger.info("Enter Password For Check The Functionality Of TeetCutomizedStatement");
		LP.clicksbmt();
		Logger.info("Click On Submit Button For Check The Functionality Of TeetCutomizedStatement");

		// 3. Fill Details For Mini Statement
		CutomizedStatement CS = new CutomizedStatement();
		CS.cutomizedtatement();
		Logger.info("Click On Customized Statement For Check The Functionality Of TeetCutomizedStatement");
		CS.accountno("117021");
		Logger.info("Enter Account No For Check The Functionality Of TeetCutomizedStatement");
		CS.FDate("26", "12", "2022");
		Logger.info("Enter FDate For Check The Functionality Of TeetCutomizedStatement");
		CS.TDate("27", "12", "2022");
		Logger.info("Enter TDate For Check The Functionality Of TeetCutomizedStatement");
		CS.TrnValue("5000");
		Logger.info("Enter Transaction Value For Check The Functionality Of TeetCutomizedStatement");
		CS.NoOfTrn("1");
		Logger.info("Enter No Of Transaction For Check The Functionality Of TeetCutomizedStatement");
		CS.submitbtn();
		Logger.info("Customized Statement Show Succesfully");
	}
}
