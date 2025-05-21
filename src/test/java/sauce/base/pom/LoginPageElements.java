package sauce.base.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPageElements {
	WebDriver driver;
	
	@FindBy(xpath = "//input[@id='user-name']")
	private WebElement usernameTextfield;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement passwordTextfield;
	
	@FindBy(id = "login-button")
	private WebElement loginButton;
	
	@FindBy(xpath = "//h3[@data-test='error']")
	private WebElement errorMsg;
	
	public LoginPageElements(WebDriver driver) {
		 this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsernameTextfield() {
		return usernameTextfield;
	}

	public WebElement getPasswordTextfield() {
		return passwordTextfield;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getErrorMsg() {
		return errorMsg;
	}
	
	
	
}
