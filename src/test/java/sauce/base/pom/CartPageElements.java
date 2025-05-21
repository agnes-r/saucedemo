package sauce.base.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CartPageElements{
	WebDriver driver;
	
	@FindBy(xpath = "//button[@id='continue-shopping']")
	private WebElement continueShoppingBtn;
	
	@FindBy(xpath = "//button[@id='checkout']")
	private WebElement checkoutBtn;
	
	@FindBy(xpath = "//button[text()='Remove']")
	private List<WebElement> removeBtn;
	
	@FindBy(xpath = "//div[@class='inventory_item_name']")
	private List<WebElement> productLink;
	
	@FindBy(xpath = "//span[@class='shopping_cart_badge']")
	private WebElement cartBadge;
	
	public CartPageElements(WebDriver driver) {
		 this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getContinueShoppingBtn() {
		return continueShoppingBtn;
	}

	public WebElement getCheckoutBtn() {
		return checkoutBtn;
	}

	public List<WebElement> getRemoveBtn() {
		return removeBtn;
	}

	public List<WebElement> getProductLink() {
		return productLink;
	}

	public WebElement getCartBadge() {
		return cartBadge;
	}
	
	
}
