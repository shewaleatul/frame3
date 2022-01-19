package testNG_Concepts;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo_Class {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
	}
	
	@Test(priority=-1)
	public void verifylogin()
	{
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@value='1']")).click();
	}
	
	@Test(priority=0,groups="abc")
	public void verifyFBLogo()
	{
		boolean logo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
		System.out.println(logo);
		
		//Assert.assertTrue(logo);
		//Assert.assertFalse(logo);
		//Assert.assertEquals(true, logo);
		Assert.assertEquals("This is not excepted output", false, logo);
		
		/*if(logo==true)
		{
			System.out.println("This is excepted output");
		}
		else
		{
			System.out.println("This is not excepted output");

		}*/
	}
	
	@Test(priority=1,groups="abc")
	public void verifycreatnewaccount()
	{
		driver.findElement(By.xpath("(//div[@class='_6ltg'])[2]")).click();
		driver.navigate().back();
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}


//priority keyword is used to set the priority for our testcases
//to see report---refresh the project ---test output folder will be displayed-- index.html(copy path)
//grouping keyword -- runs the test cases in the group
//validation point
