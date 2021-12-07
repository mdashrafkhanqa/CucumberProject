package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wrappers.GenericWrappers;

public class ProfilePage extends GenericWrappers {

	public ProfilePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@id='submit']")
	WebElement logoutButton;

	@FindBy(xpath = "//span[contains(text(),'Book Store')]")
	WebElement bookStore;

	@FindBy(xpath = "//input[@id='searchBox']")
	WebElement searchBox;

	public LoginPage clickLogOut() {
		logoutButton.clear();
		return new LoginPage();
	}

	public ProfilePage enterSearchText(String searchText) {
		searchBox.sendKeys(searchText);
		return this;
	}

	public BooksPage clickBookStore() throws InterruptedException {
		Thread.sleep(2000);
		scrollToElement(bookStore);
		Thread.sleep(2000);
		bookStore.click();
		return new BooksPage();
	}

}
