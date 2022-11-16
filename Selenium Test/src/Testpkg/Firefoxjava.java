package Testpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "//Users//mayank//Downloads//browser//geckodriver");
		WebDriver driver =new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.className("login"));
		element.click();
		WebElement userName = driver.findElement(By.id("email)"));
		userName.sendKeys("mnkrathore08@gmail.com");
		WebElement pass= driver.findElement(By.id("passwd"));
		
		pass.sendKeys("Mayank@123");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]")).click();



		
		
		
		
		
		
		
	}
	}


