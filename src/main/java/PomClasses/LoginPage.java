package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath = "//h3[text()='Login']")
	private WebElement pageHeader;
	
	@FindBy(id = "email")
	private WebElement usernameTF;
	
	@FindBy(id = "password")
	private WebElement passwordTF;
	
	@FindBy(name = "login")
	private WebElement loginButton;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String getPageHeader() {
		return pageHeader.getText();
	}
	
	public void setUsernameTF(String username) {
		usernameTF.sendKeys(username);
	}
	
	public void setPasswordTF(String password) {
		passwordTF.sendKeys(password);
	}
	
	public void clickLoginButton() {
		loginButton.click();
	}

}
