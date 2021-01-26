package testingWithTestNG;

import utils.BrowserSetup;
import shopping.SignUp;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestClass extends SignUp {
	
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("Setting up the browser");
		driver = BrowserSetup.ChromeBrowser();
		System.out.println("Navigated to the Website");
	}
	
	@Test
	public void Shopping() throws InterruptedException 
	{
		Register();
	}
	@AfterTest
	public void AfterTest()
	{
		driver.close();
		System.out.println("Closed the Browser");
	}
}
