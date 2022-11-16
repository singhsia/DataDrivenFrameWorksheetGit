import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGFirst {
	WebDriver driver;
	@BeforeMethod
	public void beforetestmethod() {
		System.setProperty("webdriver.chrome.driver", "//Users//mayank//Downloads//browser//chromedriver");
	 driver =new ChromeDriver();
		
	}
	
	@Test
	public void test() {
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();	
		Actions act=new Actions(driver);
		
WebElement rightclick =driver.findElement(By.xpath("//input[@name='pass']"));
act.contextClick(rightclick).perform();
			
	}
	@Test
public void test1() {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
}
	
	@AfterMethod
	public void aftertestmethod() {
		driver.quit();
		
	}
}
