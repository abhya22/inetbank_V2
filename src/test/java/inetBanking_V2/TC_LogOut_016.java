package inetBanking_V2;

import org.testng.annotations.Test;

import com.inetbanking.BaseClass.BaseClass;
import com.inetbanking.PageObject.LogOut;
import com.inetbanking.PageObject.LoginPage;

public class TC_LogOut_016 extends BaseClass {

	@Test
	public void TestLogOut() throws InterruptedException {

		// 1. Open Base URL
		driver.get(BaseURL);
		Logger.info("Open Base URL");

		// 2. Enter Login Credentials
		LoginPage LP = new LoginPage();
		LP.SetUserName(Username);
		Logger.info("Enter Username For Check The Functionality Of TestLogOut");
		LP.SetPassword(Password);
		Logger.info("Enter Password For Check The Functionality Of TestLogOut");
		LP.clicksbmt();
		Logger.info("Click On Submit Button For Check The Functionality Of TestLogOut");

		// 3. Fill Details For LogOut
		LogOut LO = new LogOut();
		LO.submitbtn();
		Logger.info("LogOut Succesfully");
		System.out.println();
		System.out.println("Congratulations Abhishek You've Pass All 16 Test Cases");
	}
}
