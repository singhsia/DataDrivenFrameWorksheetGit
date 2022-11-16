package com.mystore.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import com.mystore.pageobject.SauceLoginPage;
import com.mystore.utililties.ExtentListeners;

@Listeners(ExtentListeners.class)

public class SauceLoginTest extends Baseclass{
	
	@Test
	public void verifyLogin() throws InterruptedException, IOException {
		driver.get(url);
		logger.info("opened");
		
		SauceLoginPage lp=new SauceLoginPage(driver);
		lp.enterUsername("standard_user");
		lp.enterPassword("secret_sauce");
		lp.clickOnLoginBtn();
		Thread.sleep(5000);
		
		String title=driver.getTitle();
		System.out.println("product page title is:"+title);
		
		if(title.equals("Swag Labs1"))
		{
			logger.info("VerifyLogin-Passed");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("VerifyLogin-failed");
			captureScreenshot(driver,"VerifyLogin");
			Assert.assertTrue(false);
			
		}
	}
	

}
