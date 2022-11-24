package home_scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom_pages.actitimeEnterTimetrack_page;
import pom_pages.actitimeLogin_page;

public class ActiLogoutScript {

	@Test
	public void actiLogout() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		actitimeLogin_page ob1 = new actitimeLogin_page(driver);
		ob1.login("admin", "manager");
		
		actitimeEnterTimetrack_page ob2 = new actitimeEnterTimetrack_page(driver);
		ob2.clickLogout();
	}
}
