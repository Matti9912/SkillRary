package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewUserPage {
	
	@FindBy(xpath = "//h4[.='Add New User']")
	private WebElement pageHeader;

	@FindBy(xpath = "//input[@id='email' and @required]")
	private WebElement emailTF;

	@FindBy(xpath = "//input[@id='password' and @required]")
	private WebElement passwordTF;

	@FindBy(xpath = "//input[@id='firstname' and @required]")
	private WebElement firstNameTF;

	@FindBy(xpath = "//input[@id='lastname' and @required]")
	private WebElement lastNameTF;

	@FindBy(id = "address")
	private WebElement addressTA;

	@FindBy(id = "contact")
	private WebElement contactInfoTF;

	@FindBy(xpath = "(//input[@id='photo'])[2]")
	private WebElement photoFileUploadButton;

	@FindBy(xpath = "//button[@name='add']")
	private WebElement saveButton;
	
	public AddNewUserPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String getPageHeader() {
		return pageHeader.getText();
	}
	
	public void setEmailTF(String email) {
		emailTF.sendKeys(email);
	}
	
	public void setPasswordTF(String password) {
		passwordTF.sendKeys(password);
	}
	
	public void setFirstNameTF(String firstname) {
		firstNameTF.sendKeys(firstname);
	}
	
	public void setLastNameTF(String lastname) {
		lastNameTF.sendKeys(lastname);
	}
	
	public void setAddress(String address) {
		addressTA.sendKeys(address);
	}
	
	public void setContactInfo(String contact) {
		contactInfoTF.sendKeys(contact);
	}
	
	public void setPhotoFilePath(String photoPath) {
		photoFileUploadButton.sendKeys(photoPath);
	}
	
	public void clickSaveButton() {
		saveButton.click();
	}
}
