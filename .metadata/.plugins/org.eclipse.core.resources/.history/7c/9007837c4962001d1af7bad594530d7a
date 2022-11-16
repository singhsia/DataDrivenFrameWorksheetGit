package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceProductPage {
	WebDriver ldriver;
	
	//create constructor
	
	public SauceProductPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
		
		@FindBy(xpath="//*[@id=\"item_4_title_link\"]/div")
			WebElement productName;
		
		@FindBy(id="add-to-cart-sauce-labs-backpack")
		WebElement addtoCart;
		
		public void clickOnProductName() {
			productName.click();
			}
			
			public void clickOnCartButton() {
				addtoCart.click();
			}
		
		}
	
	


