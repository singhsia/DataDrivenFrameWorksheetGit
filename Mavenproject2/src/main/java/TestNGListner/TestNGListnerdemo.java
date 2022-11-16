package TestNGListner;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNGListner1.class)


public class TestNGListnerdemo {
	
	@Test
	public void test1() {
		System.out.println("i am inside test 1");
	}
	

	@Test
	public void test2() {
		System.out.println("i am inside test 2");
		
	}
	@Test
	public void test3() {
		System.out.println("i am inside test 3");
		
	}
	//to failed
	@Test
	public void test4() {
		System.out.println("i am inside test 4");
		Assert.assertTrue(false);
	}
	//to skipped
	@Test
	public void test5() {
		System.out.println("i am inside test 5");
		throw new SkipException("this case has been skipped");
	}
}
