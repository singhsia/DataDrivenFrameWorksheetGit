package Xmlclass;

import org.testng.annotations.Test;

public class TestNGGroup {
	
	@Test
	public void Strtingpointtest() {
		System.out.println("This is not group class");
		
	}
	@Test(groups = { "Regression"})
	public void Regression1() {
		System.out.println("Regression Group1");
	}
	@Test(groups = { "Regression"})
	public void Regression2() {
		System.out.println("Regression Group2");
	}
	@Test(groups= {"demo"})
	public void test2() {
		System.out.println("Demo group 2");
	

	}
}
