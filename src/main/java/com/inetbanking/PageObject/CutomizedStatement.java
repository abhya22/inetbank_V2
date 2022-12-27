package com.inetbanking.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.inetbanking.BaseClass.BaseClass;

public class CutomizedStatement extends BaseClass {

	public CutomizedStatement() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()=\"Customised Statement\"]")
	public WebElement CutomizedStatement;

	@FindBy(xpath = "//input[@name=\"accountno\"]")
	public WebElement AccountNo;

	@FindBy(xpath = "//input[@name=\"fdate\"]")
	public WebElement FromDate;

	@FindBy(xpath = "//input[@name=\"tdate\"]")
	public WebElement ToDate;

	@FindBy(xpath = "//input[@name=\"amountlowerlimit\"]")
	public WebElement TransactionValue;

	@FindBy(xpath = "//input[@name=\"numtransaction\"]")
	public WebElement NoOfTransaction;

	@FindBy(xpath = "//input[@name=\"AccSubmit\"]")
	public WebElement SubmitButton;

	public void cutomizedtatement() {
		CutomizedStatement.click();
		driver.navigate().refresh();
		CutomizedStatement.click();
	}

	public void accountno(String accno) {
		AccountNo.sendKeys(accno);
	}

	public void FDate(String Date, String Month, String Year) {
		FromDate.sendKeys(Date);
		FromDate.sendKeys(Month);
		FromDate.sendKeys(Year);
	}

	public void TDate(String Date, String Month, String Year) {
		ToDate.sendKeys(Date);
		ToDate.sendKeys(Month);
		ToDate.sendKeys(Year);
	}

	public void TrnValue(String Trnvalue) {
		TransactionValue.sendKeys(Trnvalue);
	}

	public void NoOfTrn(String nooftrn) {
		NoOfTransaction.sendKeys(nooftrn);
	}

	public void submitbtn() {
		AccountNo.click();
	}
}