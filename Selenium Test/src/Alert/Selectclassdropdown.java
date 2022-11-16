package Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Selectclassdropdown {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "//Users//mayank//Downloads//browser//chromedriver");
	WebDriver driver =new ChromeDriver();
	driver.get("https://demoqa.com/select-menu");
	driver.manage().window().maximize();
	
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,250)");
	
	Select sel=new Select(driver.findElement(By.id("oldSelectMenu")));
	
	//select element using selectByindex()
	//sel.selectByIndex(4);
	
	//select element using selectByvalue()
	//sel.selectByValue("2");
	
	//select element using selectbyText()
	sel.selectByVisibleText("Yellow");
	


	}

}
