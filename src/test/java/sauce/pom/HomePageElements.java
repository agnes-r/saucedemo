package sauce.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePageElements {
	WebDriver driver;

	@FindBy(xpath = "//button[text()='Add to cart']")
	private List<WebElement> addToCartButton;

	@FindBy(xpath = "//div[@class='inventory_item_name ']")
	private List<WebElement> productLink;

	@FindBy(xpath = "//select[@class='product_sort_container']")
	private WebElement filterDropdown;

	public void dropdownElements(String value) {
		Select sel = new Select(filterDropdown);
		sel.selectByValue(value);
	}

	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	private WebElement cartIcon;

	public HomePageElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public List<WebElement> getFirstProductAddToCartButton() {
		return addToCartButton;
	}

	public List<WebElement> getFirstProductLink() {
		return productLink;
	}

	public WebElement getFilterDropdown() {
		return filterDropdown;
	}

	public WebElement getCartIcon() {
		return cartIcon;
	}

}
