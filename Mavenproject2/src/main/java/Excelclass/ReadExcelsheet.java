package Excelclass;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelsheet {

	public static void main(String[] args) {
	
getRowCount();
getCellValue();
getCellValueNumeric();
		
	}

public static void getRowCount(){	

	try{
		String path="/Users/mayank/Library/Containers/com.microsoft.Excel/Data/Downloads/TestData.xlsx";
		
		XSSFWorkbook wb = new XSSFWorkbook(path);
		XSSFSheet sheet= wb.getSheet("Sheet1");
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("Number of Row count is :"+rowCount);
	   
	}catch(Exception e){
		e.printStackTrace();
		
	}	

}
public static void getCellValue(){	

	try{
		String path="/Users/mayank/Library/Containers/com.microsoft.Excel/Data/Downloads/TestData.xlsx";
		
		XSSFWorkbook wb = new XSSFWorkbook(path);
		XSSFSheet sheet= wb.getSheet("Sheet1");
		String cellData=sheet.getRow(0).getCell(1).getStringCellValue();
		System.out.println("Number of cell value is :"+cellData);
	   
	}catch(Exception e){
		e.printStackTrace();

}
}
public static void getCellValueNumeric(){	

	try{
		String path="/Users/mayank/Library/Containers/com.microsoft.Excel/Data/Downloads/TestData.xlsx";
		
		XSSFWorkbook wb = new XSSFWorkbook(path);
		XSSFSheet sheet= wb.getSheet("Sheet1");
		double cellData=sheet.getRow(3).getCell(0).getNumericCellValue();
		System.out.println("Numeric cell is  :"+cellData);
	   
	}catch(Exception e){
		e.printStackTrace();

}
}
}


   
	