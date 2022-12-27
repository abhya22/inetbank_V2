package com.inetbanking.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.inetbanking.BaseClass.BaseClass;

public class Withdrawal extends BaseClass {

	public Withdrawal() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()=\"Withdrawal\"]")
	public WebElement Withdrawal;

	@FindBy(xpath = "//input[@name=\"accountno\"]")
	public WebElement AccountNo;

	@FindBy(xpath = "//input[@name=\"ammount\"]")
	public WebElement Amount;

	@FindBy(xpath = "//input[@name=\"desc\"]")
	public WebElement Description;

	@FindBy(xpath = "//input[@name=\"AccSubmit\"]")
	public WebElement SubmitButton;

	public void Withdraw() {
		Withdrawal.click();
		driver.navigate().refresh();
		Withdrawal.click();
	}

	public void AccountNo(String AccNo) {
		AccountNo.sendKeys(AccNo);
	}

	public void WithdrawAmount(String AccNo) {
		Amount.sendKeys(AccNo);
	}

	public void Perticular(String Narration) {
		Description.sendKeys(Narration);
	}

	public void Submitbtn() {
		SubmitButton.click();
	}
}
