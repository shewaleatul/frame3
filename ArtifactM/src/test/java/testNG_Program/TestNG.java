package testNG_Program;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	@BeforeSuite
		public void beforesuite1(){
		System.out.println("1- Before Suite");	
	}
	
	@BeforeTest
		public void beforeTest1(){
		System.out.println("2- Before Test");
	}
	
	@BeforeClass
	public void beforeClass1() {
		System.out.println("3- Before Class");

	}
	@BeforeMethod	
	public void beforeMethod1() {
		System.out.println("4- Before Method");
	}
	
	
	@Test
	public void Test() {
		System.out.println("Test-10");
	}
	@AfterMethod
	public void AfterMethod1() {
		System.out.println("6- After Method");
	}
	@AfterClass
	public void AfterClass1() {
		System.out.println("15- After Class");
	}
	@AfterTest
	public void AfterTest1() {
		System.out.println("8- After Test");
	}
	@AfterSuite
	public void AfterSuite1() {
		System.out.println("9- After Test");
	}
	
	@Test
	public void Test1() {
		System.out.println(10/0);
	}
	
	@Test
	public void Test2() {
		System.out.println("Test -2");
	}
	
	@Test
	public  static void Test3(){
		System.out.println("Test-3");
	}

}
