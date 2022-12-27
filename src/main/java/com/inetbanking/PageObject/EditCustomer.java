package com.inetbanking.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.inetbanking.BaseClass.BaseClass;

public class EditCustomer extends BaseClass {

	public EditCustomer() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()=\"Edit Customer\"]")
	public WebElement EditCust;

	@FindBy(xpath = "//input[@name=\"cusid\"]")
	public WebElement CustomerID;

	@FindBy(xpath = "//input[@name=\"AccSubmit\"]")
	public WebElement SubmitButton;

	@FindBy(xpath = "//textarea[@name=\"addr\"]")
	public WebElement Address;

	@FindBy(xpath = "//input[@name=\"sub\"]")
	public WebElement EditSubmit;

	public void Editcustomer() {
		EditCust.click();
		driver.navigate().refresh();
		EditCust.click();
	}

	public void CustID(String custID) {
		CustomerID.sendKeys(custID);
	}

	public void SubBtn() {
		SubmitButton.click();
	}

	public void Address(String Add) {
		Address.sendKeys(Add);
	}

	public void Submit() {
		EditSubmit.click();
	}
}
