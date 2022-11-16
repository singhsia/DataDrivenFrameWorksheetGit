package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFirst {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "//Users//mayank//Downloads//chromedriver");

WebDriver driver = new ChromeDriver();

driver.get("https://www.amazon.com/");
 
driver.manage().window().maximize();

driver.close();

	}

}
