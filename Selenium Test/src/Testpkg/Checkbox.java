package Testpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "//Users//mayank//Downloads//browser//chromedriver");
	WebDriver driver =new ChromeDriver();
	driver.get("https://demoqa.com/automation-practice-form");
	driver.manage().window().maximize();
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,400)");
	
	//driver.findElement(By.cssSelector("#hobbiesWrapper > div.col-md-9.col-sm-12 > div:nth-child(1) > label")).click();
	//driver.findElement(By.xpath("//*[@id='hobbiesWrapper']/div[2]/div[1]/label")).click();
	
WebElement checkbox	=driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label"));

//is selected()
boolean isselected=checkbox.isSelected();
System.out.println("Element selected condition:"+isselected);

//is displayed
boolean isdisplayed=checkbox.isDisplayed();
System.out.println("Element selected condition:"+isdisplayed);

//isEnabled
boolean isenabled=checkbox.isEnabled();
System.out.println("Element selected condition:"+isenabled);

//checkbox click
checkbox.click();



	
	
	
	}

}
