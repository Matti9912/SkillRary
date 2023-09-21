package PomClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtility;

public class CategoryPage {
	
	
private String deleteButtonPath = "//td[text()='%s']/following-sibling::td/button[text()=' Delete']";
	
	@FindBy(xpath = "//h1[normalize-space(text())='Category']")
	private WebElement pageHeader;
	
	@FindBy(xpath = "//a[text()=' New']")
	private WebElement newButton;
	
	@FindBy(xpath = "//ul[@class='pagination']/li/a[text()='Next']")
	private WebElement nextPageButton;
	
	@FindBy(xpath = "//table/tbody/tr/td[1]")
	private List<WebElement> categoryNames;
	
	@FindBy(name = "delete")
	private WebElement dialogDeleteButton;
	
	public CategoryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String getPageHeader() {
		return pageHeader.getText();
	}
	
	public void clickNewButton() {
		newButton.click();
	}
	
	public WebElement getNextPageButton() {
		return nextPageButton;
	}
	
	public void clickCategoryListNextPageLink() {
		nextPageButton.click();
	}
	
	public List<WebElement> getCategoryNamesList() {
		return categoryNames;
	}
	
	public void clickDeleteButton(WebDriverUtility web, String categoryName) {
		web.convertStringToDynamicXpath(deleteButtonPath, categoryName).click();
	}
	
	public void clickDialogDeleteButton() {
		dialogDeleteButton.click();
	}

}
