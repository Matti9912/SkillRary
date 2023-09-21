package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath = "//a[.=' Home']")
	private WebElement pageHeader;
	
	@FindBy(xpath = "//span[text()='Users']")
	private WebElement usersLink;
	
	@FindBy(xpath = "//span[text()='Courses']")
	private WebElement coursesLink;
	
	@FindBy(xpath = "//ul/li/a[.=' Course List']")
	private WebElement courseListLink;
	
	@FindBy(xpath = "//a[text()=' Category']")
	private WebElement categoryLink;
	
	@FindBy(xpath = "//span[text()='SkillRary Admin']")
	private WebElement adminIcon;
	
	@FindBy(xpath = "//a[text()='Sign out']")
	private WebElement signOutLink;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String getPageHeader() {
		return pageHeader.getText();
	}
	
	public void clickUsersLink() {
		usersLink.click();
	}
	
	public void clickCoursesLink() {
		coursesLink.click();
	}
	
	public void clickCourseListLink() {
		courseListLink.click();
	}
	
	public void clickCategoryLink() {
		categoryLink.click();
	}
	
	public void signOutOfSkillrary() {
		adminIcon.click();
		signOutLink.click();
	}

}
