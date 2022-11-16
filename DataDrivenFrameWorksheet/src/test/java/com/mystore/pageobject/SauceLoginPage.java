package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceLoginPage {
	
	
	//create object for WebDiver
	WebDriver ldriver;
	
	//CREATE CONSTRUCTOR
	public SauceLoginPage(WebDriver rdriver) {
	ldriver=rdriver;
	PageFactory.initElements(rdriver, this);
	}
@FindBy(id="user-name")
WebElement userName;

@FindBy(id="password")
WebElement password;

@FindBy(id="login-button")
WebElement login;

public void enterUsername(String username) {

userName.sendKeys(username);
}
public void enterPassword(String Pass) {
	password.sendKeys(Pass);
}
public void clickOnLoginBtn() {
	login.click();
}
}
