package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class ContactPage extends BaseClass{
	@FindBy(xpath = "//html/body/div[1]/div/div[1]/div[3]/a/span")
	private WebElement contactLink;

	@FindBy(xpath = "//a[@href='/contacts/new']")
	private WebElement createButton;

	@FindBy(name = "first_name")
	private WebElement fname;

	@FindBy(name = "last_name")
	private WebElement lname;

	@FindBy(name = "middle_name")
	private WebElement mname;

	@FindBy(name = "value")
	private WebElement emailid;

	@FindBy(xpath = "//button[text()='Save']")
	private WebElement saveButton;

	public ContactPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickOnContactLink() {
		contactLink.click();
	}

	public String verifyUserOnContactPage() {
		return driver.getCurrentUrl();
	}

	public void clickOnCreatebutton() {
		createButton.click();
	}

	public void createUser(String firstname, String lastname, String middlename, String email) {
		fname.sendKeys(firstname);
		lname.sendKeys(lastname);
		mname.sendKeys(middlename);
		emailid.sendKeys(email);
	}

	public void clickOnSaveButton() {
		saveButton.click();
	}
}
