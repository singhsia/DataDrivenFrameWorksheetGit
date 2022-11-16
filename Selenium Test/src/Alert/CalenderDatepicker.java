package Alert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderDatepicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String expectedDay ="20";
		String expectedMonth ="December";
		String expectedYear ="2022";
		
		System.setProperty("webdriver.chrome.driver", "//Users//mayank//Downloads//browser//chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		//switch to frame
		driver.switchTo().frame(0);
		WebElement datepicked=driver.findElement(By.id("datepicker"));
		datepicked.click();
		while(true) {
		String calenderMonth=	driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String calenderYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		if(calenderMonth.equals(expectedMonth) && calenderYear.equals(expectedYear)) {
		List<WebElement> dayList=	driver.findElements(By.xpath("//table/tbody/tr/td"));
		for(WebElement e:dayList) {
			String calenderDay=e.getText();
			if(calenderDay.equals(expectedDay)) {
				e.click();
				break;
			}
			
		} 
		break;
			
		}
		else {
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		
		}
	}
}
	


