package sauce;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import sauce.pom.LoginPageElements;
import sauce.pom.SideBarElements;

public class BaseClassForLoginTests {

	public static WebDriver driver;
	
	public Properties prop;
	public FileInputStream fis;
	public LoginPageElements lpe;

	public String username;
	public String password;
	public String url;

	public boolean isLoggedIn = false;

	@BeforeMethod
	public void openBrowser() {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-save-password-bubble");
		options.addArguments("--disable-infobars");
		Map<String, Object> prefs = new HashMap<>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		options.setExperimentalOption("prefs", prefs);

		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		prop = new Properties();

		try {
			fis = new FileInputStream("./src/test/resources/sauce.login.credentials.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		url = prop.getProperty("url");
		username = prop.getProperty("username");
		password = prop.getProperty("password");

		driver.get(url);
		lpe = new LoginPageElements(driver);

	}

	@AfterMethod
	public void logout() {
		if (isLoggedIn) {
			SideBarElements sbe = new SideBarElements(driver);
			sbe.openSideBar();
			sbe.getLogoutLink().click();
		}
		isLoggedIn = false;
		driver.quit();
	}

}
