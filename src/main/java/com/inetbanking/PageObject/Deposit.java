package com.inetbanking.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.inetbanking.BaseClass.BaseClass;

public class Deposit extends BaseClass {

	public Deposit() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()=\"Deposit\"]")
	public WebElement Deposit;

	@FindBy(xpath = "//input[@name=\"accountno\"]")
	public WebElement AccountNo;

	@FindBy(xpath = "//input[@name=\"ammount\"]")
	public WebElement Amount;

	@FindBy(xpath = "//input[@name=\"desc\"]")
	public WebElement Description;

	@FindBy(xpath = "//input[@name=\"AccSubmit\"]")
	public WebElement SubmitButton;

	public void NewDeposit() {
		Deposit.click();
		driver.navigate().refresh();
		Deposit.click();
	}

	public void AccNo(String accno) {
		AccountNo.sendKeys(accno);
	}

	public void amount(String amt) {
		Amount.sendKeys(amt);
	}

	public void Perticular(String narration) {
		Description.sendKeys(narration);
	}

	public void sumbitbtn() {
		SubmitButton.click();
	}
}
