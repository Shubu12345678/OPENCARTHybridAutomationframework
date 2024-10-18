package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath="//i[@class='fa fa-user']")
	WebElement InkMyAccount;

	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement Inkregister;
	
	@FindBy(linkText= "Login")
	WebElement linkLogin;
	

	public void ClickMyAccount() {
		InkMyAccount.click();
	}

	public void clickRegister() {
		Inkregister.click();
	}
	
	public void clickLogin() {
		linkLogin.click();
	}

}
