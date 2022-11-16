package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceInformationPage {

	WebDriver ldriver;
	
	public SauceInformationPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(id="first-name")
	WebElement firstName;
	
	@FindBy(id="last-name")
	WebElement lastName;
	
	@FindBy(id="postal-code")
	WebElement postalCode;
	
	@FindBy(id="continue")
	WebElement submitContinue;
	
	
	public void enterFirstName(String firtsname) {
		firstName.sendKeys(firtsname);
	}
	public void enterLastName(String lastname) {
		lastName.sendKeys(lastname);}
	public void enterPostalCode(String postalcode) {
		postalCode.sendKeys(postalcode);
	}
	public void clickOnContinueBtn() {
		submitContinue.click();
	}
	
	}

