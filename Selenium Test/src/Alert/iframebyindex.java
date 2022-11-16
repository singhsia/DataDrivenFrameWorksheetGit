package Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframebyindex {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.chrome.driver", "//Users//mayank//Downloads//browser//chromedriver");
			WebDriver driver =new ChromeDriver();
			driver.get("https://demoqa.com/frames");
			driver.manage().window().maximize();	
			
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,350)");
			
	driver.switchTo().frame(2);
	WebElement ele=driver.findElement(By.id("sampleHeading"));
	String text= ele.getText();
	System.out.println("Ifarme text value  is:"+text);
	
	}
	
}




