package extendReport;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class ExtentTestcaseDemo {
	
	
	@Test
	public void method1(){
		
		System.out.println("This is test method 1.........");
		Assert.assertTrue(true);
	}
	@Test
	public void method2(){
		
		System.out.println("This is test method 2.........");
		Assert.assertTrue(true);
	}
	@Test
	public void method3(){
		
		System.out.println("This is test method 3.........");
		Assert.assertTrue(true);
	}
	@Test
	public void method4(){
		
		System.out.println("This is test method 4.........");
		Assert.assertTrue(false);
	}
	@Test
	public void method5(){
		
		System.out.println("This is test method 5.........");
		throw new SkipException("Test skipped");

}
}
