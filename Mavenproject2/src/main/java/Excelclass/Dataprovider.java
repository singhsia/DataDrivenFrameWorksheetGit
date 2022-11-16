package Excelclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dataprovider {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	}
	@Test(dataProvider="SearchDataProvider")
			public void searchKeyword(String keyword) {
		WebElement searchbox=driver.findElement(By.name("q"));
		searchbox.sendKeys(keyword);
		searchbox.sendKeys(Keys.ENTER);
		
	}
	@org.testng.annotations.DataProvider(name="SearchDataProvider")
	public Object[][]searchDataProviderMethod(){
		Object[][] searchData = new Object[2][1];
		searchData[0][0]= "Taj Mahal"; 
		searchData[1][0]= "India Gate";
		return searchData;
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	
	
	
	}
}

