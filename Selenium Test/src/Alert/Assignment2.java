package Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//mayank//Downloads//browser//chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();	
		
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email_create")).sendKeys("sonam.burbreek@gmail.com");
		driver.findElement(By.name("SubmitCreate")).click();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		Thread.sleep(5000);
		
		driver.findElement(By.className("page-heading")).click();
	WebElement radiobutton=driver.findElement(By.xpath("//*[@id=\"account-creation_form\"]/div[1]/div[1]/div[2]/label"));
		radiobutton.click();
		//isSelected
		boolean isselected = radiobutton.isSelected();
		System.out.println("Element is selected:"+isselected);
		
		driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]")).sendKeys("Sia");
		driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]")).sendKeys("Singh");
		driver.findElement(By.id("passwd")).sendKeys("Soanm@123");
		
		Select sel= new Select (driver.findElement(By.id("days")));
		sel.selectByIndex(8);
		
		Select sel1= new Select (driver.findElement(By.id("months")));	
		sel1.selectByValue("12");
		
	 Select sel2	=new Select(driver.findElement(By.id("years")));
	 sel2.selectByValue("1993");
	 
	 WebElement checkbox=driver.findElement(By.id("newsletter"));
	 boolean Isselected =checkbox.isSelected();
	 System.out.println("element selected condition:"+Isselected);
	 checkbox.click();
	 
     driver.findElement(By.name("address1")).sendKeys("54 ICL");
     driver.findElement(By.id("city")).sendKeys("tacoma");
     Select sel3 =new Select(driver.findElement(By.id("id_state")));
	 sel3.selectByVisibleText("Washington");
	 
	 driver.findElement(By.id("postcode")).sendKeys("98402");
	 Select sel4=new Select(driver.findElement(By.id("id_country")));
	 sel4.selectByVisibleText("United States");
	 
	 driver.findElement(By.id("phone_mobile")).sendKeys("8800177450");
	 driver.findElement(By.id("alias")).sendKeys("54 ICL ,359 c block ");
	// driver.findElement(By.id("submitAccount")).click();
}
}