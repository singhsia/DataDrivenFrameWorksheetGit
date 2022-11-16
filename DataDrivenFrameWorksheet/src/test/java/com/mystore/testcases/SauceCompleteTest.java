package com.mystore.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.mystore.pageobject.SauceCartPage;
import com.mystore.pageobject.SauceCompletePage;
import com.mystore.pageobject.SauceInformationPage;
import com.mystore.pageobject.SauceLoginPage;
import com.mystore.pageobject.SauceOverviewPage;
import com.mystore.pageobject.SauceProductPage;
import com.mystore.utililties.ExtentListeners;

public class SauceCompleteTest {
	@Listeners(ExtentListeners.class)
	public class SauceProductTest extends Baseclass{
		
		@Test
		public void verifyProduct() throws InterruptedException, IOException {
			driver.get(url);
			logger.info("opened");
			
			SauceLoginPage lp=new SauceLoginPage(driver);
			lp.enterUsername("standard_user");
			lp.enterPassword("secret_sauce");
			lp.clickOnLoginBtn();
			Thread.sleep(5000);
			
			String title=driver.getTitle();
			System.out.println("product page title is:"+title);
			
			if(title.equals("Swag Labs"))
			{
				logger.info("VerifyLogin-Passed");
				AssertJUnit.assertTrue(true);
			}
			else
			{
				logger.info("VerifyLogin-failed");
				captureScreenshot(driver,"VerifyLogin");
				AssertJUnit.assertTrue(false);
				
		}
			SauceProductPage sp=new SauceProductPage(driver);
			sp.clickOnProductName();
			sp.clickOnCartButton();
			Thread.sleep(5000);
			
			String url=driver.getCurrentUrl();
			System.out.println("product page url is:"+url);
			if(url.equals("https://www.saucedemo.com/inventory-item.html?id=4"))
	{
				logger.info("VerifyLogin-Passed");
				AssertJUnit.assertTrue(true);
	}
			else
			{
				logger.info("VerifyLogin-failed");
				captureScreenshot(driver,"VerifyLogin");
				AssertJUnit.assertTrue(false);	
			}
				
			
		SauceCartPage cp=new SauceCartPage(driver);
	cp.clickOnCartBtn();
	cp.clickOnCheckOutBtn();
	Thread.sleep(5000);
	String checkouturl =driver.getCurrentUrl();
	System.out.println("checkouturl is:"+checkouturl);
	if(checkouturl.equals("https://www.saucedemo.com/checkout-step-one.html"))
	{

		logger.info("VerifyLogin-Passed");
		AssertJUnit.assertTrue(true);
	}
	else
	{
		logger.info("VerifyLogin-failed");
		captureScreenshot(driver,"VerifyLogin");
		AssertJUnit.assertTrue(false);

}
	SauceInformationPage ip=new SauceInformationPage(driver);
	ip.enterFirstName("sonam");
	ip.enterLastName("singh");
	ip.enterPostalCode("00000");
	ip.clickOnContinueBtn();
	Thread.sleep(50000);
	String overviewUrl=driver.getCurrentUrl();
	System.out.println("overviewpage url is:"+overviewUrl);
	if(overviewUrl.equals("https://www.saucedemo.com/checkout-step-two.html"))
	{
		logger.info("VerifyLogin--passed");
		AssertJUnit.assertTrue(true);
	}
	else
	{
		logger.info("VerifyLogin-failed");
		captureScreenshot(driver,"VerifyProduct");
		AssertJUnit.assertTrue(false);
	}
	SauceOverviewPage sv=new SauceOverviewPage(driver);
	sv.clickOnFinishBtn();
	Thread.sleep(5000);
	
	SauceCompletePage scp=new SauceCompletePage(driver);
	scp.getSuccessMsg();
	Thread.sleep(5000);
		}}}


