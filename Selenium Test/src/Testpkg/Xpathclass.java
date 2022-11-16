package Testpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "//Users//mayank//Downloads//browser//chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		//Xpath using or operator
		driver.findElement(By.xpath("//input[@name='username' or @type='text']")).sendKeys("sonam.359c@gmail.com");
		
	     //Xpath using and operator
		driver.findElement(By.xpath("//input[@name='password' and @type='password']")).sendKeys("Sona@123");
		
		//Xpath using Chained Xpath operator
		//driver.findElement(By.xpath("//div[@class='-MzZI'] //input[@name='username']")).sendKeys("sonam singh");
		
		//Xpath using contain operator
		//driver.findElement(By.xpath("//div[contains(@class,'_4EzTm')]")).click();
		
		//Xpath using Starts-with operator
		//driver.findElement(By.xpath("//span[starts-with(text(),'Log in with Facebook')]")).click();
		
		//Xpath using Text operator
		//driver.findElement(By.xpath("//a[text()=\"Forgotten your password?\"]")).click();
		
		
		
		
	}

}
