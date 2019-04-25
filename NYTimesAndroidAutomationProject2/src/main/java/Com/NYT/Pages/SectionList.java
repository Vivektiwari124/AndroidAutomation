package Com.NYT.Pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SectionList {

	AppiumDriver<MobileElement> driver;

	public SectionList(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Settings']")
	MobileElement Settingtext;

	@AndroidFindBy(id = "com.nytimes.android:id/search")
	MobileElement Search;
	@AndroidFindBy(id = "com.nytimes.android:id/settings")
	MobileElement Settingicon;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Subscribe']")
	MobileElement SubscribeText;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Log In or Create Account']")
	MobileElement loginaccounttext;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='vivek.tiwari@nytimes.com']")
	MobileElement profileSummary;
	@AndroidFindBy(xpath = "com.nytimes.android.debug:id/profilePrimary")
	MobileElement profileSummaryy;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Podcasts Beta']")
	MobileElement podcastText;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='CUSTOMIZED SECTIONS']")
	MobileElement CustText;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='EDIT']")
	MobileElement EditText;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Home']")
	MobileElement HomeSection;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Most Popular']")
	MobileElement MostPopularSection;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Opinion']")
	MobileElement OpinionSection;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='World']")
	MobileElement WorldSection;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='U.S.']")
	MobileElement USSection;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Business']")
	MobileElement BusinessSection;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Sports']")
	MobileElement SportsSection;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Arts']")
	MobileElement ArtsSection;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='New York']")
	MobileElement NewYorkSection;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Magazine']")
	MobileElement MagazineSection;

	public void clickSearch() {
		Search.click();
	}

	public void clickSettingicon() {
		Settingicon.click();
	}

}
