package Testpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "//Users//mayank//Downloads//browser//chromedriver");
	WebDriver driver =new ChromeDriver();
	driver.get("https://demoqa.com/automation-practice-form");
	driver.manage().window().maximize();

	WebElement radiobutton=driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label"));
	
	//isSelected
	boolean isselected = radiobutton.isSelected();
	System.out.println("Element is selected:"+isselected);
	
	//isdisplayed
	boolean isdisplayed = radiobutton.isDisplayed();
	System.out.println("Element is dispalyed:"+isdisplayed);
	
	//isenabled
	boolean isenabled= radiobutton.isEnabled();
	System.out.println("Element is enabled:"+isenabled);
	
	//radiobutton clcik
	radiobutton.click();
	
	

	}

}
