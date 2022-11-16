package Testpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "//Users//mayank//Downloads//browser//chromedriver");
WebDriver driver =new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();

//identify element using id attribute
//driver.findElement(By.id("email")).sendKeys("8800177450");

//identify element using name attribute
//driver.findElement(By.id("email")).sendKeys("sonam.359c@gmail.com");

//identify element using class attribute
//driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("sonam.359c@gmail.com");

// identify css selector # for id and .for class
driver.findElement(By.cssSelector("#email")).sendKeys("cssselector");

//identify css selector # for id and .for class
driver.findElement(By.cssSelector(".inputtext _55r1 _6luy")).sendKeys("cssselector");

//identify element using link text
//driver.findElement(By.linkText("Forgotten password?")).click();

//identify element using partialLinkText
driver.findElement(By.partialLinkText("password?")).click();

	}
	}


