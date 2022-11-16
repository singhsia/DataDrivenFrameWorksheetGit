package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		 WebDriver driver =new SafariDriver();
		driver.get("https://www.flipkart.com/");
		
	 driver.manage().window().maximize();
		 
	
	}

}
