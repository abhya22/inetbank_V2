package com.inetbanking.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.inetbanking.BaseClass.BaseClass;

public class DeleteAccount extends BaseClass {

	public DeleteAccount() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()=\"Delete Account\"]")
	public WebElement DeleteAccount;

	@FindBy(xpath = "//input[@name=\"accountno\"]")
	public WebElement AccountNo;

	@FindBy(xpath = "//input[@name=\"AccSubmit\"]")
	public WebElement SubmitButton;

	public void deleteaccount() {
		DeleteAccount.click();
		driver.navigate().refresh();
		DeleteAccount.click();
	}

	public void accountno(String accno) {
		AccountNo.sendKeys(accno);
	}

	public void submitbtn() {
		SubmitButton.click();
	}
}