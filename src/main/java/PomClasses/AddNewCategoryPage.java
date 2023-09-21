package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCategoryPage {
	
	@FindBy(xpath = "//h4[.='Add New Category']")
	private WebElement pageHeader;
	
	@FindBy(xpath = "//input[@id='name']")
	private WebElement nameTF;
	
	@FindBy(xpath = "//button[@name='add']")
	private WebElement saveButton;
	
	public AddNewCategoryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String getPageHeader() {
		return pageHeader.getText();
	}
	
	public void setNameTF(String name) {
		nameTF.sendKeys(name);
	}
	
	public void clickSaveButton() {
		saveButton.click();
	}	
	
	

}
