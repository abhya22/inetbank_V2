package com.inetbanking.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.inetbanking.BaseClass.BaseClass;

public class LogOut extends BaseClass {

	public LogOut() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()=\"Log out\"]")
	public WebElement SubmitButton;

	public void submitbtn() throws InterruptedException {
		Thread.sleep(3000);
		SubmitButton.click();
	}
}
