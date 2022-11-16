package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simplealert {
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "//Users//mayank//Downloads//browser//chromedriver");
	WebDriver driver =new ChromeDriver();
	driver.get("https://demoqa.com/alerts");
	//click on button to appear alert popup
	
	driver.findElement(By.id("alertButton")).click();
	
	Thread.sleep(2000);
	System.out.println("Alert popup displayed successfully");
	
	Alert simple= driver.switchTo().alert();
	
	simple.accept();
	}

}
