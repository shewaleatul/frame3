package testNG_Concepts;

import org.testng.annotations.Test;

public class DependsOnMethodKeyword {
	@Test
	public void test1()
	{
		String str ="Swapnil";
		System.out.println(str.charAt(9));
	}
	
	@Test(dependsOnMethods="test1")
	public void test2()
	{
		System.out.println(3+1);
	}
	
	@Test(dependsOnMethods="test2")
	public void test3()
	{
		System.out.println("Software Engineer");
	}

}
