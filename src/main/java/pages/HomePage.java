package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;


public class HomePage extends BasePage {

	
	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	@FindBy(id="email")
	public WebElement username;
	
	@FindBy(id="pass")
	public WebElement password;
	
	@FindBy(xpath="//div/div/div/div[2]/div/div[1]/form/div[2]/button")
	public WebElement login;
	
		
	public LandingPage doLogin(String user, String pass) {
		
		username.sendKeys(user);
		
		password.sendKeys(pass);
		
		login.click();
		return new LandingPage(driver);
	}

	
}
