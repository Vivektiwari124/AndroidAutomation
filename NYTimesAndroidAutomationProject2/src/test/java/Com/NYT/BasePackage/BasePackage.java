package Com.NYT.BasePackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Com.NYT.Pages.Const;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class BasePackage {

	public static Properties prop;

	//@BeforeMethod
	public void Appinvoke() {
		try {

			File appp = new File(
					"C:\\Users\\vivek.tiwari\\git\\NYTApp\\NYTimesAndroidAutomationProject\\src\\main\\java\\ConfigProperties\\config.properties");
			FileInputStream fileInput = null;
			try {
				fileInput = new FileInputStream(appp);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			prop = new Properties();

			// load properties file
			try {
				prop.load(fileInput);
			} catch (IOException e) {
				e.printStackTrace();
			}

			File app = new File(
					"C:\\Users\\vivek.tiwari\\git\\NYTApp\\NYTimesAndroidAutomationProject\\Build\\reader-google-debug-7.6.0.apk");
			DesiredCapabilities capabilities = new DesiredCapabilities();

			// capabilities.setCapability("deviceName", "a5d166d1");
			// capabilities.setCapability("platformVersion", "7.0");

			capabilities.setCapability("deviceName", "9887fc35434f553850");
			capabilities.setCapability("platformVersion", "8.0.0");

			// capabilities.setCapability("deviceName", "Android Emulator");
			// capabilities.setCapability("platformVersion", "8.0");

			// capabilities.setCapability("deviceName", "06157df6add0b10e");
			// capabilities.setCapability("platformVersion", "6.0.1");

			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("app-package", "com.nytimes.android.debug");
			capabilities.setCapability("app-activity", "com.nytimes.android.welcome.WelcomeActivity");
			capabilities.setCapability("appWaitDuration",5000);
			capabilities.setCapability("fullReset", false);
			capabilities.setCapability("noReset", true);
			capabilities.setCapability("app", app.getAbsolutePath());

			Const.driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			Const.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			System.out.println("App is invoked successfully");
			

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	//@AfterMethod
	public void QuitApp() {
		try {

			Const.driver.quit();
			System.out.println("Driver is closed");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
