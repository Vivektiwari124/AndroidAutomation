package ConfigProperties;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ApplicationInvoke {

	public static AppiumDriver<MobileElement> InvokeApp() throws MalformedURLException {

		File app = new File(
				"C:\\Users\\Vivek\\git\\AndroidAutomation\\NYTimesAndroidAutomationProject2\\Build\\reader-google-beta-7.5.0.apk");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "244a401cd70d7ece");
		capabilities.setCapability("platformVersion", "8.0.0");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("app-package", "com.nytimes.android.debug");
		capabilities.setCapability("app-activity", "com.nytimes.android.welcome.WelcomeActivity");
		capabilities.setCapability("fullReset", false);
		capabilities.setCapability("noReset", true);
		capabilities.setCapability("app", app.getAbsolutePath());
		AppiumDriver<MobileElement> driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),
				capabilities);
		return driver;
	}
	
}
