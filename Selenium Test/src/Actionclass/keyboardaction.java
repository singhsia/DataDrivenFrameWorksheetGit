package Actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardaction {
		public static void main(String[] args) {
					// TODO Auto-generated method stub
				
						System.setProperty("webdriver.chrome.driver", "//Users//mayank//Downloads//browser//chromedriver");
						WebDriver driver =new ChromeDriver();
						driver.get("https://demoqa.com/text-box");
						driver.manage().window().maximize();	
						Actions act=new Actions(driver);
		driver.findElement(By.id("userName")).sendKeys("sonam singh");
		driver.findElement(By.id("userEmail")).sendKeys("sonam.359c@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("359c block bhopal");
		
		act.keyDown(Keys.COMMAND);
		act.sendKeys("a");
		act.keyUp(Keys.COMMAND);
		act.build().perform();
		
		act.keyDown(Keys.COMMAND);
		act.sendKeys("c");
		act.keyUp(Keys.COMMAND);
		act.build().perform();
           act.sendKeys(Keys.TAB);
act.build().perform();
act.keyDown(Keys.COMMAND);
act.sendKeys("v");
act.keyUp(Keys.COMMAND);
act.build().perform();
	}

}
