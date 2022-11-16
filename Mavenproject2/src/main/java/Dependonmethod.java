import org.testng.annotations.Test;

public class Dependonmethod {
	
	
	@Test(dependsOnMethods= {"OpenBrowser"})
	
	public void Signin() {
		System.out.println("This will execute second(Signin)");
		
	}
	@Test
	public void OpenBrowser() {
		System.out.println("Ths will execute first (Open Browser)");
	}

	
	
	

}
