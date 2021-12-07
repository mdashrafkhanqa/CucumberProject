package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.LoginPage;
import wrappers.GenericWrappers;

public class LoginSteps extends GenericWrappers {

	LoginPage loginPage = new LoginPage();

	@And("Enter username")
	public void enter_username() {
		loginPage.enterUserName();
	}

	@Given("Enter password")
	public void enter_password() {
		loginPage.enterPassword();
	}

	@When("Click login")
	public void click_login() {
		loginPage.clickLogin();
	}

}
