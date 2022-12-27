package com.inetbanking.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.inetbanking.BaseClass.BaseClass;

public class AddCutomerPage extends BaseClass {

	public AddCutomerPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()=\"New Customer\"]")
	public WebElement NewCust;

	@FindBy(xpath = "//input[@name=\"name\"]")
	public WebElement CustName;

	@FindBy(xpath = "//input[@name=\"rad1\"]")
	public WebElement Gender;

	@FindBy(xpath = "//input[@name=\"dob\"]")
	public WebElement DOB;

	@FindBy(xpath = "//textarea[@name=\"addr\"]")
	public WebElement Address;

	@FindBy(xpath = "//input[@name=\"city\"]")
	public WebElement City;

	@FindBy(xpath = "//input[@name=\"state\"]")
	public WebElement State;

	@FindBy(xpath = "//input[@name=\"pinno\"]")
	public WebElement PinCode;

	@FindBy(xpath = "//input[@name=\"telephoneno\"]")
	public WebElement MobileNo;

	@FindBy(xpath = "//input[@name=\"emailid\"]")
	public WebElement Email;

	@FindBy(xpath = "//input[@name=\"password\"]")
	public WebElement Password;

	@FindBy(xpath = "//input[@name=\"sub\"]")
	public WebElement SubmitButton;

	public void NewCutomer() {
		NewCust.click();
		driver.navigate().refresh();
		NewCust.click();
	}

	public void CutomerName(String name) {
		CustName.sendKeys(name);
	}

	public void CutomerGender() {
		Gender.click();
	}

	public void CutomerDOB(String date, String month, String year) {
		DOB.sendKeys(date);
		DOB.sendKeys(month);
		DOB.sendKeys(year);
	}

	public void CutomerAddress(String address) {
		Address.sendKeys(address);
	}

	public void CutomerCity(String city) {
		City.sendKeys(city);
	}

	public void CutomerState(String state) {
		State.sendKeys(state);
	}

	public void CutomerPinNo(String pincode) {
		PinCode.sendKeys(pincode);
	}

	public void CutomerMobNo(String mobileno) {
		MobileNo.sendKeys(mobileno);
	}

	public void CutomerEmail(String mail) {
		Email.sendKeys(mail);
	}

	public void CutomerPassword(String password) {
		Password.sendKeys(password);
	}

	public void submitbutton() {
		SubmitButton.click();
	}
}
