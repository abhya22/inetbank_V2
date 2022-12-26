package inetBanking_V2;

import org.testng.annotations.Test;

import com.inetbanking.BaseClass.BaseClass;
import com.inetbanking.PageObject.AddCutomerPage;
import com.inetbanking.PageObject.LoginPage;

public class TC_AddCutomerPage_003 extends BaseClass {

	@Test
	public void TestAddCustDetails() {
		// 1. Open Base URL
		driver.get(BaseURL);
		Logger.info("URL is Open");

		// 2. Enter Username & Password
		LoginPage LP = new LoginPage();
		LP.SetUserName(Username);
		Logger.info("Enter UserName");
		LP.SetPassword(Password);
		Logger.info("Enter Password");
		LP.clicksbmt();

		// 3. Adding Cutomer Details
		AddCutomerPage AC = new AddCutomerPage();
		AC.NewCutomer();
		Logger.info("Click On New Customer");

		AC.CutomerName("Abhishek Mudholkar");
		Logger.info("Cutomer Name");

		AC.CutomerGender();
		Logger.info("Cutomer Gender");

		AC.CutomerDOB("22", "05", "1996");
		Logger.info("Cutomer Date of Birth");

		AC.CutomerAddress("Mahal Nagpur");
		Logger.info("Cutomer Address");

		AC.CutomerCity("Nagpur");
		Logger.info("Cutomer City");

		AC.CutomerState("Maharashtra");
		Logger.info("Cutomer State");

		AC.CutomerPinNo("440032");
		Logger.info("Cutomer PinCode");

		AC.CutomerMobNo("8888686511");
		Logger.info("Cutomer Mobile Number");

		AC.CutomerEmail("amudholkar52@gmail.com");
		Logger.info("Cutomer Email Address");

		AC.CutomerPassword("Abhi@123");
		Logger.info("Cutomer Password");

		AC.submitbutton();
		Logger.info("Succesfully Click On Submit Button");
	}
}
