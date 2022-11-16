package Alert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFramecount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.chrome.driver", "//Users//mayank//Downloads//browser//chromedriver");
			WebDriver driver =new ChromeDriver();
			driver.get("https://demoqa.com/frames");
			//using element tag name
			driver.manage().window().maximize();	
			List<WebElement> iframe =driver.findElements(By.tagName("iframe"));
			System.out.println("Total no of iframe are:"+iframe.size());
			
		driver.switchTo().frame("frame1");
	WebElement ele=	driver.findElement(By.id("sampleHeading"));
	String text =ele.getText();
	System.out.println("iframe text value is:"+text);
	
	
	
			

	}

}
