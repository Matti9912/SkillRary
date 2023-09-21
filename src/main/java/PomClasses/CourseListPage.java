package PomClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CourseListPage {
	
	
	@FindBy(xpath = "//h1[normalize-space(text())='Course List']")
	private WebElement pageHeader;

	@FindBy(xpath = "//a[@id='addproduct' and text()=' New']")
	private WebElement newButton;

	@FindBy(xpath = "//table/tbody/tr/td[@class='sorting_1']")
	private List<WebElement> courseNameList;

	@FindBy(xpath = "//ul[@class='pagination']/li[last()-1]/a")
	private WebElement lastCourseListPageLink;

	@FindBy(xpath = "//table/tbody/tr[last()]/descendant::button[text()=' Delete']")
	private WebElement deleteButton;

	@FindBy(name = "delete")
	private WebElement dialogDeleteButton;
	
	@FindBy(xpath = "//div[contains(@class,'alert')]")
	private WebElement deleteSuccessAlert;
	
	public CourseListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String getPageHeader() {
		return pageHeader.getText();
	}
	
	public void clickNewButton() {
		newButton.click();
	}
	
	public void clickCourseListLastPageLink() {
		lastCourseListPageLink.click();
	}
	
	public List<WebElement> getCourseNameList() {
		return courseNameList;
	}
	
	public void clickDeleteButton() {
		deleteButton.click();
	}
	
	public void clickDialogDeleteButton() {
		dialogDeleteButton.click();
	}
	
	public String getDeleteSuccessMessage() {
		return deleteSuccessAlert.getText();
	}

}
