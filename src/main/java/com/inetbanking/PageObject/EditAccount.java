package com.inetbanking.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.inetbanking.BaseClass.BaseClass;

public class EditAccount extends BaseClass {

	public EditAccount() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()=\"Edit Account\"]")
	public WebElement EditAccount;

	@FindBy(xpath = "//input[@name=\"accountno\"]")
	public WebElement AccountNo;

	@FindBy(xpath = "//input[@name=\"AccSubmit\"]")
	public WebElement SubmitButton;

	public void Editaccount() {
		EditAccount.click();
		driver.navigate().refresh();
		EditAccount.click();
	}

	public void Accountno(String accno) {
		AccountNo.sendKeys(accno);
	}

	public void submitbtn() {
		AccountNo.click();
	}

}
