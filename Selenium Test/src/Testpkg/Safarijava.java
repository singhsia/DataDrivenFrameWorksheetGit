package Testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;


public class Safarijava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new SafariDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

	}

}
