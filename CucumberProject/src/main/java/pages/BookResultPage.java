package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wrappers.GenericWrappers;

public class BookResultPage extends GenericWrappers {

	public BookResultPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@id='ISBN-wrapper']//following-sibling::div/label")
	WebElement ISBN;

	@FindBy(xpath = "//div[@id='title-wrapper']//following-sibling::div/label")
	WebElement Title;

	@FindBy(xpath = "//div[@id='subtitle-wrapper']//following-sibling::div/label")
	WebElement SubTitle;

	@FindBy(xpath = "//div[@id='author-wrapper']//following-sibling::div/label")
	WebElement Author;

	@FindBy(xpath = "//div[@id='publisher-wrapper']//following-sibling::div/label")
	WebElement Publisher;

	@FindBy(xpath = "//div[@id='pages-wrapper']//following-sibling::div/label")
	WebElement TotalPages;

	@FindBy(xpath = "//div[@id='description-wrapper']//following-sibling::div/label")
	WebElement Description;

	@FindBy(xpath = "//div[@id='website-wrapper']//following-sibling::div/label")
	WebElement Website;

	@FindBy(xpath = "//button[@id='addNewRecordButton']")
	WebElement AddNewRecordButton;

	@FindBy(xpath = "//button[contains(text(),'Add To Your Collection')]")
	WebElement AddToYourcollectionButton;

	@FindBy(xpath = "//label[contains(text(),'User Name :')]//following-sibling::label")
	WebElement UserName;

	@FindBy(xpath = "//button[@id='submit']")
	WebElement logoutButton;

	public String getISBN() {
		String ISBNText = ISBN.getText();
		System.out.println(ISBNText);
		return ISBNText;
	}

	public String getTitle() {

		String TitleText = Title.getText();
		System.out.println(TitleText);
		return TitleText;
	}

	public String getSubTitle() {
		String SubTitleText = SubTitle.getText();
		System.out.println(SubTitleText);
		return SubTitleText;
	}

	public String getAuthor() {
		String AuthorText = Author.getText();
		System.out.println(AuthorText);
		return AuthorText;
	}

	public String getPublisher() {
		String PublisherText = Publisher.getText();
		System.out.println(PublisherText);
		return PublisherText;
	}

	public String getTotalPages() {
		String TotalPagesText = TotalPages.getText();
		System.out.println(TotalPagesText);
		return TotalPagesText;
	}

	public String getDescription() {
		String DescriptionText = Description.getText();
		System.out.println(DescriptionText);
		return DescriptionText;
	}

	public String getWebsite() {
		String WebsiteText = Website.getText();
		System.out.println(WebsiteText);
		return WebsiteText;
	}

	public BooksPage clickBackToBookStore() {
		AddNewRecordButton.clear();
		return new BooksPage();

	}
	
	public BookResultPage scrollAddToYourCollection() {
		scrollToElement(AddToYourcollectionButton);
		return this;
	}

	public BookResultPage clickAddToYourCollection() {
		AddToYourcollectionButton.click();
		return this;
	}

	public String getUserName() {
		String UserNameText = UserName.getText();
		System.out.println(UserNameText);
		return UserNameText;
	}

	public LoginPage clickLogOut() {
		logoutButton.click();
		return new LoginPage();
	}

}
