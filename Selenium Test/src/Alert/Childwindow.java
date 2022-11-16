package Alert;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childwindow {

		
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "//Users//mayank//Downloads//browser//chromedriver");
			WebDriver driver =new ChromeDriver();
			driver.get("https://demoqa.com/browser-windows");
			
			driver.manage().window().maximize();	
			
			driver.findElement(By.id("windowButton")).click();
	
	//Get window handle for parent window
	String parentWindow = driver.getWindowHandle();
	
	//Set window handle for child wind
	Set<String> childwindow=driver.getWindowHandles();
Iterator<String> iterator =childwindow.iterator();

while(iterator.hasNext()){
	String childWindow = iterator.next();
	if(!parentWindow.equalsIgnoreCase(childWindow)){
		driver.switchTo().window(childWindow);
	
WebElement text=	driver.findElement(By.id("sampleHeading"));

System.out.println("Child window text is : "+ text.getText());

	
	
	
	
}
	driver.switchTo().window(parentWindow);
	//driver.switchTo().defaultContent();
String title=	driver.getTitle();
System.out.println("Main window is :"+title);
	}

}
}