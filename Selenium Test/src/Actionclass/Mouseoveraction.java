package Actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseoveraction {


		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "//Users//mayank//Downloads//browser//chromedriver");
			WebDriver driver =new ChromeDriver();
			driver.get("https://demoqa.com/menu");
		    driver.manage().window().maximize();
		    Actions act=new Actions(driver);
		   WebElement menu =driver.findElement(By.xpath("//a[text()='Main Item 2']"));
		   act.moveToElement(menu).perform();
             Thread.sleep(2000);

         WebElement submenu=driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"));
           act.moveToElement(submenu).perform();
           
     WebElement submenu1     = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]/ul/li[1]/a"));
     System.out.println(submenu1.getText());
	}

}
