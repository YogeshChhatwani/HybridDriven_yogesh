package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.ControlActions;

public class loginPage extends ControlActions {

	public void login(String email, String password) {
		System.out.println("STEP:Enter Username");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(email);
		System.out.println("STEP:Enter Password");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		System.out.println("STEP:Click on Login Button");
		driver.findElement(By.xpath("//input[@id='login']")).click();

	}
	
	public boolean isLoginSuccessfully() {
		WebElement loginSuccessfulElement = getElement("XPATH", "//div[@aria-label='Login Successfully']", true);
		return loginSuccessfulElement.isDisplayed();
	
	}
}
