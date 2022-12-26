package com.inetbanking.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.inetbanking.BaseClass.BaseClass;

public class AddNewAccount extends BaseClass {
	
	public AddNewAccount() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()=\"New Account\"]")
	public WebElement AddNewAccount;
	
	@FindBy(xpath = "//input[@name=\"cusid\"]")
	public WebElement CustID;
	
	@FindBy(xpath = "//select[@name=\"selaccount\"]")
	public WebElement AccountType;
	
	@FindBy(xpath = "//option[text()=\"Current\"]")
	public WebElement AccountType1;
	
	@FindBy(xpath = "//input[@name=\"inideposit\"]")
	public WebElement InitialDeposit;
	
	@FindBy(xpath = "//input[@name=\"button2\"]")
	public WebElement SubmitBtn;
	
	public void AddNewCustAcc() {
		AddNewAccount.click();
		driver.navigate().refresh();
		AddNewAccount.click();
	}
	
	public void CustomerID(String CID) {
		CustID.sendKeys(CID);
	}
	
	public void CustomerAccType() {
		AccountType.click();
	}
	
	public void CustomerAccType1(String AccType1) {
		AccountType.sendKeys(AccType1);
	}
	
	public void CustomerInitialDepsoit(String DepositAmt) {
		InitialDeposit.sendKeys(DepositAmt);
	}
	
	public void SubmitButton() {
		SubmitBtn.click();
	}
}
