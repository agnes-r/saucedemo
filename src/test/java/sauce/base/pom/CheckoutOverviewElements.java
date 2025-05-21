package sauce.base.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CheckoutOverviewElements{
	WebDriver driver;
	
	@FindBy(id = "cancel")
	private WebElement cancelBtn;
	
	@FindBy(id = "finish")
	private WebElement finishBtn;
	
	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	private WebElement cartIcon;
	
	@FindBy(xpath = "//div[@class='inventory_item_name']")
	private List<WebElement> productLink;
	
	public CheckoutOverviewElements(WebDriver driver) {
		 this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCancelBtn() {
		return cancelBtn;
	}

	public WebElement getFinishBtn() {
		return finishBtn;
	}

	public WebElement getCartIcon() {
		return cartIcon;
	}

	public List<WebElement> getProductLink() {
		return productLink;
	}
	
	
}
