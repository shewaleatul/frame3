package testNG_Program;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg_1 {
	
	@BeforeMethod
	public void Initialize() {
		System.out.println("Swapnil Navale Ki Jay");
	}
		
	@Test
	public void Test3()
	{
		System.out.println("Atul");
	}
	
	@Test
	public void Test1()
	
	{
	System.out.println("Pavan");
	}
	
	
	@AfterMethod
	public void Test12()
	{
		System.out.println("Software Tester");
	}
	
}
	


