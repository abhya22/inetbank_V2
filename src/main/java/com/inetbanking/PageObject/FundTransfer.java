package com.inetbanking.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.inetbanking.BaseClass.BaseClass;

public class FundTransfer extends BaseClass {

	public FundTransfer() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()=\"Fund Transfer\"]")
	public WebElement FundTransfer;

	@FindBy(xpath = "//input[@name=\"payersaccount\"]")
	public WebElement Payersaccountno;

	@FindBy(xpath = "//input[@name=\"payeeaccount\"]")
	public WebElement Payeesaccountno;

	@FindBy(xpath = "//input[@name=\"ammount\"]")
	public WebElement Amount;

	@FindBy(xpath = "//input[@name=\"desc\"]")
	public WebElement Description;

	@FindBy(xpath = "//input[@name=\"AccSubmit\"]")
	public WebElement SubmitButton;

	public void FundTrf() {
		FundTransfer.click();
		driver.navigate().refresh();
		FundTransfer.click();
	}

	public void ApplicantAccNo(String CustAccNo) {
		Payersaccountno.sendKeys(CustAccNo);
	}

	public void BeneficiaryAccNo(String BenAccNo) {
		Payeesaccountno.sendKeys(BenAccNo);
	}

	public void Amount(String Amt) {
		Amount.sendKeys(Amt);
	}

	public void Decription(String Narration) {
		Description.sendKeys(Narration);
	}

	public void SubmitBtn() {
		SubmitButton.click();
	}

}
