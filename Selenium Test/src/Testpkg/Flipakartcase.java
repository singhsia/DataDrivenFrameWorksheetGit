package Testpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipakartcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.chrome.driver", "//Users//mayank//Downloads//browser//chromedriver");
			WebDriver driver =new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			
			//Xpath using or operator
			driver.findElement(By.xpath("//input[@autocomplete='off' or @class='_2IX_2- VJZDxU']]")).sendKeys("sonam.359c@gmail.com");
			

	}

}
