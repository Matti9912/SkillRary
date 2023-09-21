package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {
	@FindBy(xpath = "//h1[normalize-space(text())='Users']")
	private WebElement pageHeader;
	
	@FindBy(xpath = "//a[text()=' New']")
	private WebElement newButton;
	
	@FindBy(xpath = "//ul[@class='pagination']/li[last()-1]/a")
	private WebElement usersListLastPageLink;
	
	@FindBy(xpath = "//table/tbody/tr[last()]/td[3]")
	private WebElement userName;
	
	@FindBy(xpath = "//table/tbody/tr[last()]/descendant::button[text()=' Delete']")
	private WebElement deleteButton;
	
	@FindBy(name = "delete")
	private WebElement dialogDeleteButton;
	
	public UsersPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String getPageHeader() {
		return pageHeader.getText();
	}
	
	public void clickNewButton() {
		newButton.click();
	}
	
	public void clickUsersListLastPageLink() {
		usersListLastPageLink.click();
	}
	
	public String getUserName() {
		return userName.getText();
	}
	
	public void clickDeleteButton() {
		deleteButton.click();
	}
	
	public void clickDialogDeleteButton() {
		dialogDeleteButton.click();
	}

}
