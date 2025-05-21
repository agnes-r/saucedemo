package sauce.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CheckoutPageElements{
	WebDriver driver;
	
	@FindBy(id = "first-name")
	private WebElement firstnameTextfield;
	
	@FindBy(id = "last-name")
	private WebElement lastnameTextfield;
	
	@FindBy(id = "postal-code")
	private WebElement zipcodeTextfield;
	
	@FindBy(id = "cancel")
	private WebElement cancelBtn;
	
	@FindBy(id = "continue")
	private WebElement continueBtn;
	
	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	private WebElement cartIcon;

	
	public CheckoutPageElements(WebDriver driver) {
		 this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstnameTextfield() {
		return firstnameTextfield;
	}

	public WebElement getLastnameTextfield() {
		return lastnameTextfield;
	}

	public WebElement getZipcodeTextfield() {
		return zipcodeTextfield;
	}

	public WebElement getCancelBtn() {
		return cancelBtn;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public WebElement getCartIcon() {
		return cartIcon;
	}

	
	
}
