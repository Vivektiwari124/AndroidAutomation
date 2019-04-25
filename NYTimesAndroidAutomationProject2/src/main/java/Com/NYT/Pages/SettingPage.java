package Com.NYT.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SettingPage {

	AppiumDriver<MobileElement> driver;

	public SettingPage(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='vivek.tiwari@nytimes.com']")
	MobileElement logindetail;


	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Navigate up']")
	MobileElement Backsection;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Log In or Register']")
	MobileElement LoginorRegitser;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Notifications']")
	MobileElement notification;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Text Size']")
	MobileElement TextSize;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Video Autoplay']")
	MobileElement VideoAutoplay;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='English Edition']")
	MobileElement EnglishEdition;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='NYT en Español']")
	MobileElement SpanishEsiction;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Background Update']")
	MobileElement BackgroundUpdate;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Offline Reading']")
	MobileElement Offlinereading;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[@index='0']")
	MobileElement backButton;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Settings']")
	MobileElement Settingtext;

	public void clickLogin() {
		LoginorRegitser.click();
	}
	
	public String readdata() {
		return logindetail.getText();
	}

	public boolean validatenotification() {
		return notification.isDisplayed();
	}

	public boolean validateTextSize() {
		return TextSize.isDisplayed();
	}

	public boolean validateLoginORRegiter() {
		return LoginorRegitser.isDisplayed();

	}

}
