package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wrappers.GenericWrappers;

public class BooksPage extends GenericWrappers {

	public BooksPage() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "login")
	WebElement loginButton;

	public BookResultPage clickSearchResult(String searchText) {
		clickByXpath("//a[contains(text(),'" + searchText + "')]");
		return new BookResultPage();

	}

	public LoginPage clickLogOut() {
		clickByXpath("//button[@id='submit']");
		return new LoginPage();
	}

}
