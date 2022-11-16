package Testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MicrosoftEdge {

	public static void main(String[] args) {
System.setProperty("webdriver.edge.driver", "//Users//mayank//Downloads//browser//edgedriver_mac64//msedgedriver");
		
		WebDriver driver =new EdgeDriver();
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		driver.close();
	}

}
