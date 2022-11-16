package Excelclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dataproviderusingexcelsheet {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		XSSFWorkbook wb=null;
		XSSFSheet sheet=null;
		
		
	File path=new File("/Users/mayank/Library/Containers/com.microsoft.Excel/Data/Downloads/TestData.xlsx");
	FileInputStream file=new FileInputStream(path);
	
	//create workbook object to handle file
	wb=new XSSFWorkbook(file);
	
	//to access the sheet
	sheet=wb.getSheet("Sheet2");
	
	//total row count
	int totalrow=sheet.getLastRowNum();
	System.out.println("toal number row are:"+totalrow);
	//total cell
	int totalCell=sheet.getRow(0).getLastCellNum();
	System.out.println("total number cell are:"+totalCell);
	for(int currentRow=1;currentRow<totalrow;currentRow++) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		//FORLOGIN
		driver.findElement(By.id("user-name")).sendKeys(sheet.getRow(currentRow).getCell(0).toString());
		//for password
		driver.findElement(By.id("password")).sendKeys(sheet.getRow(currentRow).getCell(1).toString());
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(20000);
		driver.quit();
	}
          wb.close();
	}

}
