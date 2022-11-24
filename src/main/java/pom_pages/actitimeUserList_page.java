package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actitimeUserList_page {
	
	@FindBy(xpath="//div[text()='New User']")
	private WebElement btnNewUser;
	
	public void clickNewUser()
	{
		this.btnNewUser.click();
	}
	
	public actitimeUserList_page(WebDriver driver) {
		//INITIALISE THE WEBELEMENTS
		PageFactory.initElements(driver, this);
	}

}
