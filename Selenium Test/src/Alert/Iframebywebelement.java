package Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframebywebelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//mayank//Downloads//browser//chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();	
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		WebElement frame=driver.findElement(By.id("frame1"));
		
	driver.switchTo().frame(frame);
	
	WebElement ele=driver.findElement(By.id("sampleHeading"));
	String text =ele.getText();
	System.out.println("Iframe value is :"+text);
	//parent window switch
	//driver.switchTo().parentFrame();
	driver.switchTo().defaultContent();
	String title=driver.getTitle();
	System.out.println("parent window title is:"+title);
	}

}
