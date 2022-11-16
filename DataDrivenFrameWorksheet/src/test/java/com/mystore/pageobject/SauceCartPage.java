package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceCartPage {
	
	WebDriver ldriver;
	
	public  SauceCartPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
		
		@FindBy(xpath="//a[@class='shopping_cart_link']")
		WebElement  addCart;
	@FindBy(id="checkout")
	WebElement checkOut;
	
	
	public void clickOnCartBtn() {
		addCart.click();
	}
		public void clickOnCheckOutBtn() {
			checkOut.click();}
		}
	


