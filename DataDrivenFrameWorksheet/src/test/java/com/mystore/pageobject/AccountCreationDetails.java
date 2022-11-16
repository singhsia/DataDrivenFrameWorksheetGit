package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AccountCreationDetails {
	
	WebDriver ldriver;
	
	public AccountCreationDetails(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}	
		@FindBy(id="id_gender1")
		WebElement TitleMrs;

		@FindBy(id="customer_firstname")
		WebElement firstName;
		
		@FindBy(id="customer_lastname")
		WebElement lastName;
		
		@FindBy(id="passwd")
		WebElement Password;
		
		@FindBy(id="firstname")
		WebElement Addfirstname;
		
		@FindBy(id="lastname")
		WebElement Addlastname;
		
		@FindBy(id="address1")
		WebElement address;
		
		@FindBy(id="city")
		WebElement cityname;
		
		@FindBy(id="id_state")
		WebElement stateName;
		
		@FindBy(id="postcode")
		WebElement zipCode;
		
		@FindBy(id="id_country")
		WebElement countryName;
		
		@FindBy(id="phone_mobile")
		WebElement phoneNumber;
		
		@FindBy(id="alias")
		WebElement alias;
		
		@FindBy(id="submitAccount")
		WebElement registerBtn;
		
	public void selecttitle() {
		TitleMrs.click();
		
	}
	public void enterfirstname(String fname) {
	firstName.sendKeys(fname);
		
	}
	public void enterlastname(String lname) {
		lastName.sendKeys(lname);
	}
	
	public void enterpassword(String pass) {
		Password.sendKeys(pass);
		
	}
	public void enterAddFname(String Adfname){
		Addfirstname.sendKeys(Adfname);
	}
	
	public void enterAddLname(String Adlname){
		Addlastname.sendKeys(Adlname);
	}
	public void enterAddress(String Entaddress){
		address.sendKeys(Entaddress);
	}
	
	public void enterCityNamecity(String city){
		cityname.sendKeys(city);}
	public void enterphonenumber(String phone) {
		phoneNumber.sendKeys(phone);
	}
	public void enterZip(String zip){
		zipCode.sendKeys(zip);
	}
		
	public void enterAliasName(String aliasName){
		alias.sendKeys(aliasName);}
	
	public void selectstate(String text) {
		Select sel=new Select(stateName);
		sel.selectByVisibleText(text);
			
	}
	public void selectcounty(String text) {
		Select sel1=new Select(countryName);
		sel1.selectByVisibleText(text);
	}
	
		public void clickOnRegistrationbtn() {
			registerBtn.click();
			
		}
		
	}


