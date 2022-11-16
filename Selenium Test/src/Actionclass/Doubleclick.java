package Actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {
		public static void main(String[] args) {
					// TODO Auto-generated method stub
				
						System.setProperty("webdriver.chrome.driver", "//Users//mayank//Downloads//browser//chromedriver");
						WebDriver driver =new ChromeDriver();
						driver.get("https://demoqa.com/buttons");
						driver.manage().window().maximize();	
						Actions act=new Actions(driver);
		WebElement doubleclick=	driver.findElement(By.id("doubleClickBtn"));
		act.doubleClick(doubleclick).perform();

	}

}
