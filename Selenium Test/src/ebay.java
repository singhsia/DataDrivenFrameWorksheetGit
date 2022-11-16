import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ebay {


		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "//Users//mayank//Downloads//browser//chromedriver");
			WebDriver driver =new ChromeDriver();
			driver.get("https://www.facebook.com/");
		    driver.manage().window().maximize();
		   // driver.findElement(By.id("email")).sendKeys("sonam.359c@gmail.com");
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("sia");
		driver.findElement(By.name("lastname")).sendKeys("singh");
		driver.findElement(By.name("reg_email__")).sendKeys("sonam.burbreek@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("sonam.burbreek@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("password_step_input");
		Select sel=new Select(driver.findElement(By.id("day")));
		sel.selectByIndex(7);
		Select sel1 =new Select(driver.findElement(By.id("month")));
		sel1.selectByValue("4");
		Select sel2=new Select(driver.findElement(By.id("year")));
		sel2.selectByValue("1993");
		WebElement radiobutton=driver.findElement(By.xpath("//label[text()='Female']"));
		boolean isselected=radiobutton.isSelected();
		radiobutton.click();
		
		//driver.findElement(By.name("websubmit")).click();


		    

			
	}

}
