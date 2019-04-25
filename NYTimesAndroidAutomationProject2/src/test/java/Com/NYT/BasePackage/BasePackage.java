package Com.NYT.BasePackage;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import ConfigProperties.ApplicationInvoke;
import ConfigProperties.propertiesRead;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class BasePackage {

	public static AppiumDriver<MobileElement> driver;
	public static Properties prop;

	@BeforeSuite
	public void installApp() {
		prop = propertiesRead.readProperties();
	}

	@BeforeMethod
	public void Appinvoke() {
		try {
			driver = ApplicationInvoke.InvokeApp();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			System.out.println("App is invoked successfully");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@AfterMethod
	public void QuitApp() {
		try {
			driver.quit();
			System.out.println("Driver is closed");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
