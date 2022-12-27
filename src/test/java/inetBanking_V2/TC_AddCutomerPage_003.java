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

		// 2. Enter Login Credential
		LoginPage LP = new LoginPage();
		LP.SetUserName(Username);
		Logger.info("Enter UserName For Check Functionality Of TestAddCustDetails");
		LP.SetPassword(Password);
		Logger.info("Enter Password For Check Functionality Of TestAddCustDetails");
		LP.clicksbmt();
		Logger.info("Click On Submit Button For Check Functionality Of TestAddCustDetails");

		// 3. Fill Details For Add Customer
		AddCutomerPage AC = new AddCutomerPage();
		AC.NewCutomer();
		Logger.info("Click On Add New Csutomer For Check Functionality Of TestAddCustDetails");
		AC.CutomerName("Abhishek Mudholkar");
		Logger.info("Enter Customer Name For Check Functionality Of TestAddCustDetails");
		AC.CutomerGender();
		Logger.info("Enter Gender For Check Functionality Of TestAddCustDetails");
		AC.CutomerDOB("22", "05", "1996");
		Logger.info("Enter Date Of Birth For Check Functionality Of TestAddCustDetails");
		AC.CutomerAddress("Mahal Nagpur");
		Logger.info("Enter Address For Check Functionality Of TestAddCustDetails");
		AC.CutomerCity("Nagpur");
		Logger.info("Enter City For Check Functionality Of TestAddCustDetails");
		AC.CutomerState("Maharashtra");
		Logger.info("Enter State For Check Functionality Of TestAddCustDetails");
		AC.CutomerPinNo("440032");
		Logger.info("Enter Pin COde For Check Functionality Of TestAddCustDetails");
		AC.CutomerMobNo("8888686511");
		Logger.info("Enter Mobile Number For Check Functionality Of TestAddCustDetails");
		AC.CutomerEmail("amudholkar52@gmail.com");
		Logger.info("Enter E-mail For Check Functionality Of TestAddCustDetails");
		AC.CutomerPassword("Abhishek@123");
		Logger.info("Enter Password For Check Functionality Of TestAddCustDetails");
		AC.submitbutton();
		Logger.info("Customer Details Add Succesfully");
	}
}
