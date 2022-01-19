package testNG_Concepts;

import org.testng.annotations.Test;

public class Expexted_Keyword {
	@Test(expectedExceptions=ArithmeticException.class)
	public void test1()
	{
		System.out.println(1/0);
	}
	
	
	//this keyword helps to handle exception without using try catch block

}
