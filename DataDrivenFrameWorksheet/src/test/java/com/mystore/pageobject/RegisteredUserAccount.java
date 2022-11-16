package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisteredUserAccount {
	WebDriver ldriver;
	public RegisteredUserAccount(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
		
		@FindBy(xpath="//a[@title='View my customer account']")
		WebElement Username;
		@FindBy(xpath="//a[title='Log me out']")
		WebElement LogoutBtn;
		
		public String getUsername(){
			String text = Username.getText();
			return text;
	}

		public void clickOnLogoutBtn() {
			LogoutBtn.click();
			
		}
	

}
