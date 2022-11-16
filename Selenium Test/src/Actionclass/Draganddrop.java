package Actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "//Users//mayank//Downloads//browser//chromedriver");
	WebDriver driver =new ChromeDriver();
	driver.get("https://demoqa.com/droppable");
    driver.manage().window().maximize();
    Actions act=new Actions(driver);
 WebElement source=   driver.findElement(By.id("draggable"));
 
 WebElement target=   driver.findElement(By.id("droppable"));
 
 act.dragAndDrop(source, target).perform();
 
    
    

	}

}
