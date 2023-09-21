package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	
	
	@FindBy(xpath = "//div[@class='navbar-header']")
	private WebElement pageLogo;
	
	@FindBy(xpath = "//a[text()='LOGIN']")
	private WebElement loginButton;
	
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String getPageHeader() {
		return pageLogo.getText();
	}
	
	public void clickLoginButton() {
		loginButton.click();
	}

}
