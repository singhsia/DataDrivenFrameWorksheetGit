package Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//mayank//Downloads//browser//chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();	
		
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email_create")).sendKeys("Singhsia0808@gmail.com");
		driver.findElement(By.name("SubmitCreate")).click();
	
		
		
				
		
	}
	
}
