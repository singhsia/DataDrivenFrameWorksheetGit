package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount {
	
	
	WebDriver ldriver;
	
	//create constructor
	public MyAccount(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	
		
	}
@FindBy(id="email_create")
WebElement enterEmail;

@FindBy(id="SubmitCreate")
WebElement submitCreate;

@FindBy(id="email")
WebElement registeredUserEmail;

@FindBy(id="passwd")
WebElement registeredUserPassword;

@FindBy(xpath="//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]")
WebElement loginBtn;

public void enterEmailAddress(String emailAdress) {
	enterEmail.sendKeys(emailAdress);
	
}

public void clickOnSubmitCreatebtn() {
	submitCreate.click();
	
}
public void enterRegEmail(String loginEmail) {
registeredUserEmail.sendKeys(loginEmail);

}
public void enterpassword(String loginPassword) {
	registeredUserPassword.sendKeys(loginPassword);
}
public void clickOnLoginBtn(){
	loginBtn.click();
}
}