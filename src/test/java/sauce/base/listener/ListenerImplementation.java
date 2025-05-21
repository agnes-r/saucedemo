package sauce.base.listener;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import sauce.base.BaseClassForLoginTests;

public class ListenerImplementation extends BaseClassForLoginTests implements ITestListener  {
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("TEST SCRIPT IS PASSED", true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("TEST SCRIPT IS FAILED", true);

		
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/error-"+timestamp+".png");
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("TEST SCRIPT IS SKIPPED", true);
	}
}
