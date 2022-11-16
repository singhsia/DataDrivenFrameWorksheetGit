package Xmlclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class xmlclass1 {
	
	@Test
	public void xmlTest1() {
		System.setProperty("webdriver.chrome.driver", "//Users//mayank//Downloads//browser//chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://web.whatsapp.com/");
	}
@Test
public void xmlTest2() {
	System.setProperty("webdriver.chrome.driver", "//Users//mayank//Downloads//browser//chromedriver");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in/");
}
	
}

