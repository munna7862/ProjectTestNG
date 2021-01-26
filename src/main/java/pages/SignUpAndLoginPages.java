package pages;

import org.openqa.selenium.By;

public class SignUpAndLoginPages {
	
	public By SignIn = By.xpath("//a[contains(text(),'Sign in')]");
	public By EmailID = By.xpath("//input[@id='email_create']");
	public By CreateAccount = By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]");
	
	public By Mr = By.xpath("//input[@id='id_gender1']");
	public By Mrs = By.xpath("//input[@id='id_gender2']");
	
	public By FirstName = By.xpath("//input[@id='customer_firstname']");
	public By LastName = By.xpath("//input[@id='customer_lastname']");
	
	public By Password = By.xpath("//input[@id='passwd']");
	
	public By dd = By.xpath("//select[@id='days']");
	public By mm = By.xpath("//select[@id='months']");
	public By yy = By.xpath("//select[@id='years']");
	
	public By Newsletter = By.xpath("//input[@id='newsletter']");
	public By offers = By.xpath("//input[@id='optin']");
	
	public By AFirstName = By.xpath("//input[@id='firstname']");
	public By ALastName = By.xpath("//input[@id='lastname']");
	public By Company = By.xpath("//input[@id='company']");
	public By Address = By.xpath("//input[@id='address1']");
	public By Address2 = By.xpath("//input[@id='address2']");
	public By City = By.xpath("//input[@id='city']");
	public By PostalCode = By.xpath("//input[@id='postcode']");
	
	public By State = By.xpath("//select[@id='id_state']");
	public By Country = By.xpath("//select[@id='id_country']");
	
	public By AdditionalInfo = By.xpath("//textarea[@id='other']");
	public By Phone = By.xpath("//input[@id='phone']");
	public By MobileNo = By.xpath("//input[@id='phone_mobile']");
	public By Reference = By.xpath("//input[@id='alias']");
	
	public By Register = By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[4]/button[1]/span[1]");
	
	
	
}
