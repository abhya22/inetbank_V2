package inetBanking_V2;

import org.testng.annotations.Test;

import com.inetbanking.BaseClass.BaseClass;
import com.inetbanking.PageObject.LoginPage;
import com.inetbanking.PageObject.NewCutomer;

public class TC_NewCutomer_002 extends BaseClass {

		@Test
		public void TestNewCust() {	
			driver.get(BaseURL);
			Logger.info("Open BaseURL");
			
			
			LoginPage LP = new LoginPage();
			Logger.info("Enter Password");
			LP.SetUserName(Username);
			Logger.info("Enter Password");
			LP.SetPassword(Password);
			LP.clicksbmt();
			
			
			NewCutomer cust = new NewCutomer();
			cust.NC();
			Logger.info("Click On New Customer");
		}
}

