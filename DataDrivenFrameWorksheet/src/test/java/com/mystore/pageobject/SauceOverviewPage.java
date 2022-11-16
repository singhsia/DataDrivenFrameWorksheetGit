package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceOverviewPage {
	
	
	WebDriver ldriver;
	
	//create constructor
	public  SauceOverviewPage(WebDriver rdriver) {
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
		@FindBy(id="finish")
		WebElement finishBtn;
		
		
		public void clickOnFinishBtn() {
			finishBtn.click();
		}
		
	}


