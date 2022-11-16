package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "//Users/mayank/eclipse-workspace/TestSelenium//chromedriver.exe");

WebDriver driver =new ChromeDriver();

driver.get("https://www.google.co.in/");
	}

}
