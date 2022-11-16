package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceCompletePage {
	
	WebDriver ldriver;
	
	public SauceCompletePage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
		
	@FindBy(xpath="//*[@id=\"checkout_complete_container\"]/h2")	
	WebElement completePage;
	
	public void getSuccessMsg() {
		completePage.click();
		
	}

}
