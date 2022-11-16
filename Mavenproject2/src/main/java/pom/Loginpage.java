package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	
	WebDriver driver;
	
	
	@FindBy(xpath="//a[@class='login']")
	WebElement signIn;
	
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="passwd")
	WebElement password;
	
	@FindBy(name="SubmitLogin")
	WebElement login;
	
	// create a constructor and initialize the webElements
		public Loginpage(WebDriver driver){
			this.driver= driver;
			PageFactory.initElements(driver, this);
		}
	//for sign in
	public void clickOnSignInBtn() {
	signIn.click();
	}
	//for user name
	public void enterUserName() {
		username.sendKeys("mnkrathore08@gmail.com");
	}
	//for password
	public void enterPassword() {
		password.sendKeys("Mayank@08");
	}
	//for login
	public void clickOnLoginbtn() {
		login.click();
	}
	
	
	

}
