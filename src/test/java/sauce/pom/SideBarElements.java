package sauce.pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SideBarElements {
	WebDriver driver;

	@FindBy(xpath = "//button[@id='react-burger-menu-btn']")
	private WebElement hamburgerIcon;

	@FindBy(xpath = "//div[@class='bm-menu']")
	private WebElement sideBarContainer;

	@FindBy(xpath = "//a[@id='logout_sidebar_link']")
	private WebElement logoutLink;

	@FindBy(xpath = "//a[@id='inventory_sidebar_link']")
	private WebElement allItemsLink;

	@FindBy(xpath = "//a[@id='about_sidebar_link']")
	private WebElement aboutLink;

	@FindBy(xpath = "//a[@id='reset_sidebar_link']")
	private WebElement resetAppStateLink;
	
	@FindBy(xpath = "//button[@id='react-burger-cross-btn']")
	private WebElement cancelButton;

	public void openSideBar() {
		hamburgerIcon.click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(sideBarContainer));

	}

	public SideBarElements(WebDriver driver) {
		 this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getHamburgerIcon() {
		return hamburgerIcon;
	}

	public WebElement getSideBarContainer() {
		return sideBarContainer;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public WebElement getAllItemsLink() {
		return allItemsLink;
	}

	public WebElement getAboutLink() {
		return aboutLink;
	}

	public WebElement getResetAppStateLink() {
		return resetAppStateLink;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}
	
	
}
