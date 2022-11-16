package Testpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "//Users//mayank//Downloads//browser//chromedriver");
WebDriver driver =new ChromeDriver();
driver.get("https://www.instagram.com/");
driver.manage().window().maximize();

//identify element using name attribute
//driver.findElement(By.name("username")).sendKeys("sonam.359c@gmail.com");

//identify element using name attribute
//driver.findElement(By.name("username")).sendKeys("8800177450");

//identify element using name attribute
//driver.findElement(By.name("username")).sendKeys("sonam singh");

//identify element using class attribute
//driver.findElement(By.className("_2hvTZ pexuQ zyHYP")).sendKeys("sonam.359c@gmail.com");

//identify element using css selector # for id and .for class
//driver.findElement(By.cssSelector("._2hvTZ pexuQ zyHYP")).sendKeys("cssselector");


//identify element using link text
//driver.findElement(By.linkText("Forgotten your password?")).click();

//identify element using partial link text
//driver.findElement(By.partialLinkText("password")).click();


	}

}
