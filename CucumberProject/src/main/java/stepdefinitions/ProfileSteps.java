package stepdefinitions;

import io.cucumber.java.en.When;
import pages.ProfilePage;
import wrappers.GenericWrappers;

public class ProfileSteps extends GenericWrappers {

	ProfilePage profilePage = new ProfilePage();

	@When("Click bookstore")
	public void i_click_bookstore() throws InterruptedException {
		profilePage.clickBookStore();
	}

	@When("^Enter search text as \\\"([^\\\"]*)\\\"$")
	public void enter_search_text(String searchText) {
		profilePage.enterSearchText(searchText);
	}
	


}
