package shopping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.SignUpAndLoginPages;
import utils.HelperMethods;

public class SignUp extends SignUpAndLoginPages{
	
	public WebDriver driver = null;
	int time = 3000;
	HelperMethods h = new HelperMethods();
	
	public void Register() throws InterruptedException
	{
		driver.findElement(SignIn).click();
		Thread.sleep(time);
		
		String email = h.email();
		driver.findElement(EmailID).sendKeys(email);
		Thread.sleep(time);
		
		driver.findElement(CreateAccount).click();
		Thread.sleep(time);
		
		driver.findElement(Mr).click();
		Thread.sleep(time);
		
		driver.findElement(FirstName).sendKeys(h.Name());
		Thread.sleep(time);
		
		driver.findElement(LastName).sendKeys(h.Name());
		Thread.sleep(time);
		
		String pass = h.Passw();
		driver.findElement(Password).sendKeys(pass);
		Thread.sleep(time);
		
		WebElement e1 = driver.findElement(dd);
		Select s1 = new Select(e1);
		s1.selectByValue("10");
		Thread.sleep(time);
		
		WebElement e2 = driver.findElement(mm);
		Select s2 = new Select(e2);
		s2.selectByValue("10");
		Thread.sleep(time);
		
		WebElement e3 = driver.findElement(yy);
		Select s3 = new Select(e3);
		s3.selectByValue("2000");
		Thread.sleep(time);
		
		
		driver.findElement(Newsletter).click();
		Thread.sleep(time);
		
		driver.findElement(offers).click();
		Thread.sleep(time);
		
		driver.findElement(Company).sendKeys(h.Name());
		Thread.sleep(time);
		
		driver.findElement(Address).sendKeys(h.RandomString(10));
		Thread.sleep(time);
		
		driver.findElement(Address2).sendKeys(h.RandomString(10));
		Thread.sleep(time);
		
		driver.findElement(City).sendKeys(h.Name());
		Thread.sleep(time);
		
		WebElement e4 = driver.findElement(State);
		Select s4 = new Select(e4);
		s4.selectByValue("10");
		Thread.sleep(time);
		
		driver.findElement(PostalCode).sendKeys(String.valueOf(h.RandomNumber(5)));
		Thread.sleep(time);
		
		WebElement e5 = driver.findElement(Country);
		Select s5 = new Select(e5);
		s5.selectByValue("21");
		Thread.sleep(time);
		
		driver.findElement(AdditionalInfo).sendKeys(h.RandomString(10));
		Thread.sleep(time);
		
		driver.findElement(Phone).sendKeys(String.valueOf(h.RandomNumber(10)));
		Thread.sleep(time);
		
		driver.findElement(MobileNo).sendKeys(String.valueOf(h.RandomNumber(10)));
		Thread.sleep(time);
		
		driver.findElement(Reference).sendKeys(h.RandomString(10));
		Thread.sleep(time);
		
		driver.findElement(Register).click();
		Thread.sleep(time);
		
		System.out.println("Account Created");
		System.out.println("Email Id is: "+email);
		System.out.println("Password is: "+pass);
	}
}
