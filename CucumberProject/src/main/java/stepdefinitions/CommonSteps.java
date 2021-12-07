package stepdefinitions;

import io.cucumber.java.en.Given;
import wrappers.GenericWrappers;

public class CommonSteps extends GenericWrappers {


	@Given("Opening the browser")
	public void opening_the_browser() {
		invokeApp("chrome", "https://demoqa.com/login");
	}

}
