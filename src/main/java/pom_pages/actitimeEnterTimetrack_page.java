package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actitimeEnterTimetrack_page {
	@FindBy(xpath="//a[@class='content reports']")
	private WebElement lnkReports;
	
	@FindBy(xpath="//a[@class='content users']")
	private WebElement lnkUsers;
	
	@FindBy(id="logoutLink")
	private WebElement btnLogout;
	
	public void clickReports()
	{
		this.lnkReports.click();
	}
	
	public void clickUsers()
	{
		this.lnkUsers.click();
	}
	
	public void clickLogout()
	{
		this.btnLogout.click();
	}
	
	public actitimeEnterTimetrack_page(WebDriver driver) {
		//INITIALISE THE WEBELEMENTS
		PageFactory.initElements(driver, this);
	
	}

}
