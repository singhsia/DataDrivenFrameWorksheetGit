package Testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigator {

	public static void main(String[] args) throws InterruptedException {
					
		System.setProperty("webdriver.chrome.driver", "//Users//mayank//Downloads//browser//chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
	}

}
