package testscripts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.ControlActions;
import pages.loginPage;

public class LoginTest {

	@BeforeMethod
	public void setup() {
		ControlActions.launchBrowser();
	}

	@Test
	public void verifyLogin() {
		loginPage login = new loginPage();
		login.login("yogeshchhatwani9@gmail.com", "Yogesh@1997");
		boolean flag = login.isLoginSuccessfully();
		Assert.assertTrue(flag);
	}

	@AfterMethod
	public void close() {
		ControlActions.close();
	}
}
