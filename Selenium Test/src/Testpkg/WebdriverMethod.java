package Testpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethod {
	public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver", "//Users//mayank//Downloads//browser//chromedriver");
WebDriver driver =new ChromeDriver();
driver.get("http://automationpractice.com/index.php");
driver.manage().window().maximize();
WebElement elemet = driver.findElement(By.className("login"));
elemet.click();
WebElement userName =driver.findElement(By.id("email"));
userName.sendKeys("mnkrathore08@gmail.com");
WebElement pass =driver.findElement(By.id("passwd"));
pass.sendKeys("Mayank@123");
driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]")).click();

//getTitle
String pageTitle = driver.getTitle();
System.out.println("page title is:"+pageTitle);

//get CurrentURL
String pageURL = driver.getCurrentUrl();
System.out.println("page URL is:"+pageURL);

// getPageSource
  String pageSource = driver.getPageSource();
	System.out.println("page source is:"+pageSource);
	
	//delete cookies
	driver.manage().deleteAllCookies();
	
	WebElement contactus = driver.findElement(By.xpath("//a[@title='Contact Us']"));
	String tageName = contactus.getTagName();
	System.out.println("Tage name is :"+tageName);
	String attributename = contactus.getAttribute("title");
	System.out.println("Attribute name is:"+attributename);
	
	driver.close();
	driver.quit();
	}

}
