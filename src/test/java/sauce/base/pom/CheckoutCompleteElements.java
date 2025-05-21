package sauce.base.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CheckoutCompleteElements {
	WebDriver driver;
	
	@FindBy(id = "back-to-products")
	private WebElement backToHomeBtn;
	
	@FindBy(xpath = "//h2[@class='complete-header']")
	private WebElement orderConfirmation;
	
	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	private WebElement cartIcon;
	
	public CheckoutCompleteElements(WebDriver driver) {
		 this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getBackToHomeBtn() {
		return backToHomeBtn;
	}

	public WebElement getOrderConfirmation() {
		return orderConfirmation;
	}

	public WebElement getCartIcon() {
		return cartIcon;
	}
	
}
