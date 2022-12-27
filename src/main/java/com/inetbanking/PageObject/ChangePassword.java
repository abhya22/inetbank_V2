package com.inetbanking.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.inetbanking.BaseClass.BaseClass;

public class ChangePassword extends BaseClass {

	public ChangePassword() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()=\"Change Password\"]")
	public WebElement ChangePassword;

	@FindBy(xpath = "//input[@name=\"oldpassword\"]")
	public WebElement OldPassword;

	@FindBy(xpath = "//input[@name=\"newpassword\"]")
	public WebElement NewPassword;

	@FindBy(xpath = "//input[@name=\"confirmpassword\"]")
	public WebElement ConfirmPassword;

	@FindBy(xpath = "//a[text()=\"Change Password\"]")
	public WebElement SubmitButton;

	public void changepassword() {
		ChangePassword.click();
		driver.navigate().refresh();
		ChangePassword.click();
	}

	public void oldpassword(String oldpass) {
		OldPassword.sendKeys(oldpass);
	}

	public void newpassword(String newpass) {
		OldPassword.sendKeys(newpass);
	}

	public void confirmnewpassword(String connewpass) {
		OldPassword.sendKeys(connewpass);
	}

	public void submitbtn() {
		OldPassword.click();
	}
}
