package login_scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom_pages.actitimeLogin_page;

public class ActiLogin {

	@Test
	public void actiLogin() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		actitimeLogin_page ob = new actitimeLogin_page(driver);
		ob.login("admin", "manager");
	}
}
