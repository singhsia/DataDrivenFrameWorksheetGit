package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Indexpage {
	//create object for WebDriver
	
WebDriver ldriver;

//Constructor
public Indexpage(WebDriver rdriver) {
	ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
}
	//identify web elements

@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
WebElement signIn;

//method
	public void clickOnsignInBtn(){
		
		signIn.click();
	}
		}




