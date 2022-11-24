package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actitimeLogin_page{
	@FindBy(name="username")
	private WebElement tbUsername;
	
	@FindBy(name="pwd")
	private WebElement tbPassword;
	
	@FindBy(id="loginButton")
	private WebElement btnLogin;
	
	public void login(String un,String pw)
	{
		this.tbUsername.sendKeys(un);
		this.tbPassword.sendKeys(pw);
		this.btnLogin.click();
	}
	
	public actitimeLogin_page(WebDriver driver) {
		//INITIALISE THE WEBELEMENTS
		PageFactory.initElements(driver, this);
		
	}
	

}
