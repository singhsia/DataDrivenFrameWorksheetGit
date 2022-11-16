package Testpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelements {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "//Users//mayank//Downloads//browser//chromedriver");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.google.co.in/");
	driver.manage().window().maximize();
	List<WebElement> alltags = driver.findElements(By.tagName("input"));
	System.out.println("All tags are:"+alltags.size());	
	for(int i=0;i<alltags.size(); i++) {
		System.out.println("link on page are:"+alltags.get(i).getAttribute("name"));
	}

	}

}