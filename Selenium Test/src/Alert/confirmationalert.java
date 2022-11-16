package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class confirmationalert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "//Users//mayank//Downloads//browser//chromedriver");
	WebDriver driver =new ChromeDriver();
	driver.get("https://demoqa.com/alerts");
	driver.findElement(By.id("confirmButton")).click();
	
	Thread.sleep(2000);
	Alert alert= driver.switchTo().alert();
	
	//method for get Text pop up
String text	=alert.getText();

System.out.println("Alert text is :"+text);

	// method to dismiss alert
	//alert.dismiss();
	
//method to accept alert pop up
	//alert.accept();
	

	}

}
