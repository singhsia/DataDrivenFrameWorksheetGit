package com.mystore.testcases;



import org.testng.annotations.Test;

import com.mystore.pageobject.AccountCreationDetails;
import com.mystore.pageobject.Indexpage;
import com.mystore.pageobject.MyAccount;

public class TC_MyAccountPageTest extends Baseclass {
@Test
	public void verifyRegistrationandLogin() throws InterruptedException{
		
		driver.get(url);
		logger.info("Url opened");
		
		Indexpage ip = new Indexpage(driver);
		ip.clickOnsignInBtn();
		logger.info("Clicked on Sign In button successfully.");	
		
		MyAccount myAcc = new MyAccount(driver);
		myAcc.enterEmailAddress("sonam1234@gmail.com");
		logger.info("Email address entered successfully.");
		myAcc.clickOnSubmitCreatebtn();
		logger.info("Clicked on Create Button successfully.");
		Thread.sleep(5000);
		
		AccountCreationDetails acd =  new AccountCreationDetails(driver);
		acd.selecttitle();
		acd.enterAddFname("Selenium");
		acd.enterAddLname("Testtt");
		acd.enterpassword("selenium645");
		acd.enterfirstname("Selenium");
		acd.enterlastname("Test");
		acd.enterAddress("18/8 worli road");
		acd.enterCityNamecity("Mumbai");
		acd.selectstate("Alabama");
		acd.enterZip("00000");
		acd.selectcounty("United States");
		acd.enterphonenumber("8978675698");
		acd.enterAliasName("Home");
		logger.info("Entered all required details for registration process.");
		acd.clickOnRegistrationbtn();
		logger.info("Clicked on Registration Button successfully.");
	}

}
