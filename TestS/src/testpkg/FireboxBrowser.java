package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireboxBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "//Users//mayank//Downloads//geckodriver");
		
		// WebDriver	driver = new ChromeDriver();
		
  WebDriver driver =new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		
 		driver.manage().window().maximize();
		
		driver.close();
	}
	}


