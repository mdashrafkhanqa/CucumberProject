package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wrappers.GenericWrappers;

public class LoginPage extends GenericWrappers {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "userName")
	WebElement username;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(id = "login")
	WebElement loginButton;

	public LoginPage enterUserName() {
		enterById("userName", UN);
		// username.sendKeys("test");
		return this;
	}

	public LoginPage enterPassword() {
		password.sendKeys(prop.getProperty("PW"));
		return this;
	}

	public ProfilePage clickLogin() {
		clickById("login");
		return new ProfilePage();
	}

	public LoginPage clickLoginForFailure() {
		clickById("login");
		return this;
	}

	public LoginPage clickNewUser() {
		clickById("newUser");
		return this;
	}

}
