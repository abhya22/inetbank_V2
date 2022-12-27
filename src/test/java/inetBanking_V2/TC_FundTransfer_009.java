package inetBanking_V2;

import org.testng.annotations.Test;

import com.inetbanking.BaseClass.BaseClass;
import com.inetbanking.PageObject.FundTransfer;
import com.inetbanking.PageObject.LoginPage;

public class TC_FundTransfer_009 extends BaseClass {

	@Test
	public void TestFundTrf() {
		
		//1. Open Base URL
		driver.get(BaseURL);
		Logger.info("Open Base URL");
		
		//2. Enter Login Credentials
		LoginPage LP = new LoginPage();
		LP.SetUserName(Username);
		Logger.info("Enter Username For Check The Functionality Of TestFundTrf");
		LP.SetPassword(Password);
		Logger.info("Enter Password For Check The Functionality Of TestFundTrf");
		LP.clicksbmt();
		Logger.info("Click On Submit Button For Check The Functionality Of TestFundTrf");
		
		//3. Fill Up Fund Transfer Details
		FundTransfer FT = new FundTransfer();
		FT.FundTrf();
		Logger.info("Click On Fund Trf For Check The Functionality Of TestFundTrf");
		FT.ApplicantAccNo("117020");
		Logger.info("Enter Applicant Acc No For Check The Functionality Of TestFundTrf");
		FT.BeneficiaryAccNo("10018133");
		Logger.info("Enter Beneficiary Acc No For Check The Functionality Of TestFundTrf");
		FT.Amount("5000");
		Logger.info("Enter Amount For Check The Functionality Of TestFundTrf");
		FT.Decription("Fund Trf Via NEFT");
		Logger.info("Enter Narration For Check The Functionality Of TestFundTrf");
		FT.SubmitBtn();
		Logger.info("Fund Trf Succesfully");
	}
}
