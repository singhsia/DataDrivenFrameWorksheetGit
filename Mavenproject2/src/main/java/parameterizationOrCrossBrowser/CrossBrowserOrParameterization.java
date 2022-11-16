package parameterizationOrCrossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserOrParameterization {
	WebDriver driver;
	@BeforeTest
	@Parameters("browser")
	public void setUp(String browser) throws Exception{
		
		if(browser.equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("ff")){
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("edge")){
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
		}
		else {
			throw new Exception ("Browser is not supported");
		}
		}
	
	
	@Test
	public void testParameterizationOrCrossBrowser(){
		
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.close();
	}
}
	
	
