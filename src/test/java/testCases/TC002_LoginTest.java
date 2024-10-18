package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass {

	@Test(groups={"Sanity"})
	public void Verify_Login() {
		logger.info("*****Starting TC_002_LoginTest");

		try {
			// HomePage
			HomePage hp = new HomePage(driver);
			hp.ClickMyAccount();
			hp.clickLogin();

			// Login
			LoginPage lp = new LoginPage(driver);
			lp.setEmail(p.getProperty("email"));
			lp.setPassword(p.getProperty("password"));
			lp.clickLogin();

			// My Account
			MyAccountPage macc = new MyAccountPage(driver);
			boolean targetPage = macc.isMyAccountPageExists();

			// We can use this also 2nd option
			Assert.assertTrue(targetPage); // Assert.assertEquals(targetPage, true, "Login failed");
		} catch (Exception e) {
			Assert.fail();

		}
		logger.info("*********Finishaeed TC_002_Logintest*******");
		driver.quit();
	}
}
