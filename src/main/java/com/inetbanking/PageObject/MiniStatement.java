package com.inetbanking.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.inetbanking.BaseClass.BaseClass;

public class MiniStatement extends BaseClass {

	public MiniStatement() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()=\"Mini Statement\"]")
	public WebElement MiniStatement;

	@FindBy(xpath = "//input[@name=\"accountno\"]")
	public WebElement AccountNo;

	@FindBy(xpath = "//input[@name=\"AccSubmit\"]")
	public WebElement SubmitButton;

	public void ministatement() {
		MiniStatement.click();
		driver.navigate().refresh();
		MiniStatement.click();
	}

	public void accountno(String accno) {
		AccountNo.sendKeys(accno);
	}

	public void submitbtn() {
		AccountNo.click();
	}
}