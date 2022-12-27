package com.inetbanking.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.inetbanking.BaseClass.BaseClass;

public class DeleteCustomer extends BaseClass {

	public DeleteCustomer() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()=\"Delete Customer\"]")
	public WebElement DeleteCustomer;

	@FindBy(xpath = "//input[@name=\"cusid\"]")
	public WebElement CustID;

	@FindBy(xpath = "//input[@name=\"AccSubmit\"]")
	public WebElement SubmitButton;

	public void deletecustomer() {
		DeleteCustomer.click();
		driver.navigate().refresh();
		DeleteCustomer.click();
	}

	public void accountno(String custID) {
		CustID.sendKeys(custID);
	}

	public void submitbtn() {
		SubmitButton.click();
	}
}