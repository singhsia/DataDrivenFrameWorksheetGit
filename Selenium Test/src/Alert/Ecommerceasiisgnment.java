package Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ecommerceasiisgnment {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "//Users//mayank//Downloads//browser//chromedriver");
	WebDriver driver=new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.findElement(By.name("search_query")).sendKeys("women");
	driver.findElement(By.xpath("//button[@name='submit_search']")).click();
	driver.findElement(By.className("sf-with-ul")).click();
	Select sel= new Select (driver.findElement(By.id("selectProductSort")));
	sel.selectByValue("price:desc");
	driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img")).click();
	
	Select sel1 =new Select(driver.findElement(By.id("group_1")));
	sel1.selectByValue("1");
WebElement radiobutton=	driver.findElement(By.xpath("//a[@id='color_13']"));
boolean isselected=radiobutton.isSelected();
System.out.println("Elemenet is selected"+isselected);
driver.findElement(By.name("Submit"));
	
	
	
}
}	
	
