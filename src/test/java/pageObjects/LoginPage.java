package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);

	}
	
	
	

	@FindBy(xpath = "//input[@id='input-email']")
	WebElement txtEmailAddress;

	@FindBy(xpath = "//input[@id='input-password']")
	WebElement txtPasword;

	@FindBy(xpath = "//input[@value='Login']")
	WebElement btnLogin;
	
	
	public void setEmail(String email) {
		txtEmailAddress.sendKeys(email);
	}
	
	public void setPassword(String pass) {
		txtPasword.sendKeys(pass);
	}
	
	public void clickLogin() {
	btnLogin.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}