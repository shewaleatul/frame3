package testNG_Concepts;

import org.testng.annotations.Test;

public class InvocationCountClass {
	@Test(invocationCount=10)
	public void addition()
	{
		System.out.println(3+5);
	}

}


//invocation count keyword to run testcases multiple times.
//package---right click---other---file---testng.xml