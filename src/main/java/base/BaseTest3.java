package base;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
//parallel execution
public class BaseTest3 {
	
	
	WebDriver driver;
//	parameter fetch the data from xml
	@Parameters("BrowserName")
	@BeforeMethod
	public void precondition(String bn)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		if(bn.equals("chrome"))
		{
		driver = new ChromeDriver();
		}
		else if(bn.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	
	@AfterMethod
	public void postcondition()
	{
		driver.quit();
	}
	
	@Parameters("BrowserName")
	@BeforeTest
	public void beforetest(String bn)
	{
		System.out.println("test started the execution in "+bn);
	}
	
	@Parameters("BrowserName")
	@AfterTest
	public void aftertest(String bn)
	{
		System.out.println("test completed the execution in "+bn);
	}
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("suite started the execution ");
	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("suite completed the execution");
	}
	
}
