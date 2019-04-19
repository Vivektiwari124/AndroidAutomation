package Com.NYT.Pages;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;

public class SettingPage {
	
	public static MobileElement Backsection = Const.driver
			.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Navigate up']"));

	public static MobileElement LoginorRegitser = Const.driver
			.findElement(By.xpath("//android.widget.TextView[@text='Log In or Register']"));

	public static MobileElement notification = Const.driver
			.findElement(By.xpath("//android.widget.TextView[@text='Notifications']"));

	public static MobileElement TextSize = Const.driver
			.findElement(By.xpath("//android.widget.TextView[@text='Text Size']"));

	public static MobileElement VideoAutoplay = Const.driver
			.findElement(By.xpath("//android.widget.TextView[@text='Video Autoplay']"));

	public static MobileElement EnglishEdition = Const.driver
			.findElement(By.xpath("//android.widget.TextView[@text='English Edition']"));

	public static MobileElement SpanishEsiction = Const.driver
			.findElement(By.xpath("//android.widget.TextView[@text='NYT en Español']"));

	public static MobileElement BackgroundUpdate = Const.driver
			.findElement(By.xpath("//android.widget.TextView[@text='Background Update']"));

	public static MobileElement Offlinereading = Const.driver
			.findElement(By.xpath("//android.widget.TextView[@text='Offline Reading']"));

	public static MobileElement ImageDownloadSetting;

	public static MobileElement SuspendedDelivery;
	public static MobileElement DeleiveryProblem;

	public static MobileElement Support;
	public static MobileElement ChatWithUS;
	public static MobileElement AppFeedback;
	public static MobileElement NewsRoom;
	public static MobileElement FAQ;

	public static MobileElement AboutApplication;
	public static MobileElement AboutTeam;
	public static MobileElement NYTExperiments;

	public static MobileElement backButton = Const.driver
			.findElementByXPath("//android.widget.ImageButton[@index='0']");

	public static MobileElement Settingtext = Const.driver
			.findElementByXPath("//android.widget.TextView[@text='Settings']");

	public static MobileElement logintext = Const.driver.findElementById("android:id/title");

	public static MobileElement getSettingPageElemet(MobileElement element) {
		return element;
	}

	public static boolean validateLoginORRegiter() {
		return LoginorRegitser.isDisplayed();

	}

	public static boolean validatenotification() {
		return notification.isDisplayed();
	}
	
	public static boolean validateTextSize() {
		return notification.isDisplayed();
	}
	
	

}
