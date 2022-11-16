package com.mystore.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;


import com.mystore.pageobject.Indexpage;
import com.mystore.pageobject.MyAccount;
import com.mystore.pageobject.RegisteredUserAccount;

public class TC_VerifyLoginPage  extends Baseclass{
	
	
	@Test
	public void verifyLoginPage() throws InterruptedException, IOException {

		driver.get(url);
		logger.info("Url opened");
		
		Indexpage ip = new Indexpage(driver);
		ip.clickOnsignInBtn();
		logger.info("Clicked on Sign In button successfully.");	
		
		MyAccount myAcc = new MyAccount(driver);
		myAcc.enterRegEmail("mnkrathore08@gmail.com");
		myAcc.enterpassword("Mayank@1234");
		myAcc.clickOnLoginBtn();
		Thread.sleep(5000);
		RegisteredUserAccount rnv = new RegisteredUserAccount(driver);		
		String vusername=	rnv.getUsername();
		
		if(vusername.equals("Mayank"))
		{
			logger.info("VerifyLogin - Passed");
			Assert.assertTrue(true);
			rnv.clickOnLogoutBtn();
			logger.info("Clicked on Logout button successfully.");
		}
		else
		{
			logger.info("VerifyLogin - Failed");
			captureScreenshot(driver,"VerifyLogin");
			Assert.assertTrue(false);

		}
		
		logger.info("******TestCase Verify login ends******");		
		
	}
	}


