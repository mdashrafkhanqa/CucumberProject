package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BookResultPage;
import wrappers.GenericWrappers;

public class BookResultSteps extends GenericWrappers {

	BookResultPage bookResultPage = new BookResultPage();

	@Then("Get title of the book")
	public void get_title_of_the_book() {
		bookResultPage.getTitle();
	}
	
	@Then("Get publisher of the book")
	public void get_publisher_of_the_book() {
		bookResultPage.getPublisher();
	}
	
	@When("Scroll to add to your collection")
	public void scroll_to_add_to_your_collection() {
		bookResultPage.scrollAddToYourCollection();
	}
	
	@Then("Click to add to your collection")
	public void click_to_add_to_your_collection() {
		bookResultPage.clickAddToYourCollection();
	}
	
	@Then("Handle alart")
	public void handle_alart() {
	    acceptAlert();
	}


	@Then("Click logout")
	public void click_logout() {
		bookResultPage.clickLogOut();
		driver.close();
	}

}
