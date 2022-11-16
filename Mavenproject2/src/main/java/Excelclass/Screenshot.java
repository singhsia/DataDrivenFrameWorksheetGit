package Excelclass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	@Test
	public void Test1() throws IOException {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
TakesScreenshot ts=(TakesScreenshot)driver;
File source =ts.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(source,new File("./Screenshot/test.png"));
}
}
