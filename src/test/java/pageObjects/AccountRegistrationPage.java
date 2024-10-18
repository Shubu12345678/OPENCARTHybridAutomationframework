package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountRegistrationPage extends BasePage {

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);

	}
	
	
	

	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement txtFirstname;

	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement txtLastName;

	@FindBy(xpath = "//input[@id='input-email']")
	WebElement txtEmail;

	@FindBy(xpath = "//input[@id='input-telephone']")
	WebElement txttelephone;

	@FindBy(xpath = "//input[@id='input-password']")
	WebElement txtpassword;

	@FindBy(xpath = "//input[@id='input-confirm']")
	WebElement Passwordconfirm;

	@FindBy(xpath = "//input[@name='agree']")
	WebElement checkbox;

	@FindBy(xpath = "//input[@value='Continue']")
	WebElement continueButton;

	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement Confirmationmsg;

	public void setFirstName(String fname) {
		txtFirstname.sendKeys(fname);

	}

	public void setLastName(String lname) {
		txtLastName.sendKeys(lname);
	}

	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}

	public void setTelephone(String tel) {
		txttelephone.sendKeys(tel);

	}

	public void setPassword(String pwd) {
		txtpassword.sendKeys(pwd);
	}

	public void setconfirmpassword(String pwd) {

		Passwordconfirm.sendKeys(pwd);
	}

	public void setPrivacyPolicy() {
		checkbox.click();
	}

	public void clickforcontinue() {

		continueButton.click();
		// sol2
		//continueButton.submit();

		// sol2
		//Actions act = new Actions(driver);
		//act.moveToElement(continueButton).click().perform();

		// sol4
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("argument[0].click();", continueButton);

		// sol5
		//continueButton.sendKeys(Keys.RETURN);

		// sol6
		//WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//mywait.until(ExpectedConditions.elementToBeClickable(continueButton)).click();

	}
	
	public String getConfirmString() {
		try {
			return(Confirmationmsg.getText());
		}
		catch (Exception e) {
			return(e.getMessage());
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
