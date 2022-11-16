package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Logintest {
	
	
	WebDriver driver;
	
	@Test
	public void test1(){
		
		WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	
	
	Loginpage lp=  new Loginpage(driver);
	
	lp.clickOnSignInBtn();
	
	lp.enterUserName();
	
	lp.enterPassword();
	lp.clickOnLoginbtn();
	
	driver.close();
	
		
	}
	
	

}
