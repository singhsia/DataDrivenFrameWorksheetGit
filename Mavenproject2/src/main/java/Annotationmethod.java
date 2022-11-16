import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotationmethod {
	
	 WebElement driver;
	 
	 @Test
	 public void testcase() {
		 System.out.println("This is Test annotation");
	 }
	 
	 @AfterMethod
	 public void aftermethodtest() {
		System.out.println("This is aftermethod annotaion");
		 
	 }
	 @AfterClass
	 public void afterclasstest(){
		 System.out.println("This is afterclass annotation"); 
	 }
	 @AfterSuite
	 public void aftersuittest() {
		 System.out.println("This is aftersuite annotation"); 
	 }
	 @AfterTest
	 public void aftertest() {
		 System.out.println("This is aftertest annotation");
		 
	 }
	 @BeforeTest
	 public void beforetest() {
		 System.out.println("This is beforetest annotation"); 
	 }
	 @BeforeMethod
	 public void beforemethodtest() {
		 System.out.println("This is beforemethod annotation"); 
	 }
	 @BeforeSuite
	 public void beforesuitetest() {
		 System.out.println("This is beforesuite annotation");
		 
	 }
	 @BeforeClass
	 public void beforeclasstest() {
		 System.out.println("This is beforeclass annotation");
	 }
	
	
	
	

}
