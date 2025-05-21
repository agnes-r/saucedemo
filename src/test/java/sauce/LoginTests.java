package sauce;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import sauce.pom.LoginPageElements;

@Listeners(ListenerImplementation.class)
@Test(enabled = false)
public class LoginTests extends BaseClassForLoginTests {
	LoginPageElements lpe;

	@Test
	public void validCred() {

		String username = prop.getProperty("username");
		String password = prop.getProperty("password");

		lpe = new LoginPageElements(driver);
		lpe.getUsernameTextfield().sendKeys(username);
		lpe.getPasswordTextfield().sendKeys(password);
		lpe.getLoginButton().click();

		isLoggedIn = true;
	}

	@Test
	public void InvalidUN() {
		String password = prop.getProperty("password");
		lpe = new LoginPageElements(driver);

		lpe.getUsernameTextfield().sendKeys("invalidUsername");
		lpe.getPasswordTextfield().sendKeys(password);
		lpe.getLoginButton().click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(lpe.getErrorMsg()));

		Assert.assertEquals(lpe.getErrorMsg().getText(),
				"Epic sadface: Username and password do not match any user in this service",
				"Proper Error message is not displayed");

	}
}
