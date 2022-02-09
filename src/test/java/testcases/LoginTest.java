package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;
import pages.LandingPage;


public class LoginTest {
	
	@Test
	public void loginTest() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		HomePage home = new HomePage(driver);
	
		LandingPage lp = home.doLogin("prakash.nutulapati@gmail.com", "");
		lp.profilePage();

		
	}

}
