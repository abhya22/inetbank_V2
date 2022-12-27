package com.inetbanking.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.inetbanking.BaseClass.BaseClass;

public class BalanceEnquiry extends BaseClass {

	public BalanceEnquiry() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()=\"Balance Enquiry\"]")
	public WebElement BalanceEnquiry;

	@FindBy(xpath = "//input[@name=\"accountno\"]")
	public WebElement AccountNo;

	@FindBy(xpath = "//input[@name=\"AccSubmit\"]")
	public WebElement SubmitButton;

	public void balanceenquiry() {
		BalanceEnquiry.click();
		driver.navigate().refresh();
		BalanceEnquiry.click();
	}

	public void accountno(String accno) {
		AccountNo.sendKeys(accno);
	}

	public void submitbtn() {
		AccountNo.click();
	}

}
