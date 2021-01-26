package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSetup {
	public static WebDriver driver;

	public  static WebDriver ChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sadhi\\Downloads\\Softwares\\eclipse-java-photon-R-win32-x86_64\\workspace\\ProjectTestNG\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		return driver;
	}
}
