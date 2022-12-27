package com.inetbanking.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.inetbanking.BaseClass.BaseClass;

public class NewCutomer extends BaseClass {

	public NewCutomer() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()=\"New Customer\"]")
	public WebElement NewCust;

	public void NC() {
		NewCust.click();
		driver.navigate().refresh();
		NewCust.click();
	}

}
