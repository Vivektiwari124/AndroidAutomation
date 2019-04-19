package Com.NYT.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.MobileElement;

public class SectionList {

	public static MobileElement SearchIcon = Const.driver.findElement(By.id("com.nytimes.android.debug:id/search"));
	public static MobileElement Settingicon = Const.driver.findElement(By.id("com.nytimes.android.debug:id/settings"));
	public static MobileElement SubscribeText = Const.driver
			.findElement(By.xpath("//android.widget.TextView[@text='Subscribe']"));

	public static MobileElement loginaccounttext = Const.driver.findElement(
			By.xpath("//android.widget.TextView[contains(@resource-id,'profileSecondary') and @index='0']"));

	public static MobileElement profileSummary = Const.driver
			.findElement(By.xpath("//android.widget.TextView[@text='vivek.tiwari@nytimes.com']"));

	// public static MobileElement profileSummaryy = Const.driver
	// .findElement(By.id("com.nytimes.android.debug:id/profilePrimary"));

	public static MobileElement podcastText = Const.driver
			.findElementByXPath("//android.widget.TextView[@text='Podcasts Beta']");

	public static MobileElement CustText = Const.driver
			.findElementByXPath("//android.widget.TextView[@text='CUSTOMIZED SECTIONS']");

	public static MobileElement EditText = Const.driver.findElementByXPath("//android.widget.TextView[@text='EDIT']");

	public static MobileElement HomeSection = Const.driver
			.findElementByXPath("//android.widget.TextView[@text='Home']");

	public static MobileElement MostPopularSection = Const.driver
			.findElementByXPath("//android.widget.TextView[@text='Most Popular']");

	public static MobileElement OpinionSection = Const.driver
			.findElementByXPath("//android.widget.TextView[@text='Opinion']");

	public static MobileElement WorldSection = Const.driver
			.findElementByXPath("//android.widget.TextView[@text='World']");

	public static MobileElement USSection = Const.driver.findElementByXPath("//android.widget.TextView[@text='U.S.']");

	public static MobileElement BusinessSection = Const.driver
			.findElementByXPath("//android.widget.TextView[@text='Business']");

	public static MobileElement SportsSection = Const.driver
			.findElementByXPath("//android.widget.TextView[@text='Sports']");

	public static MobileElement ArtsSection = Const.driver
			.findElementByXPath("//android.widget.TextView[@text='Arts']");

	public static MobileElement NewYorkSection = Const.driver
			.findElementByXPath("//android.widget.TextView[@text='New York']");

	public static MobileElement MagazineSection = Const.driver
			.findElementByXPath("//android.widget.TextView[@text='Magazine']");

	/*
	 * List<MobileElement> elements =
	 * driver.findElements(By.className("android.widget.ImageView"));
	 * for(MobileElement element : elements) {
	 * if(element.getAttribute("contentDescription").equals("Search")) {
	 * element.click(); break; } }
	 */

	// This is the common method to get all WebElement present in Section list
	public static MobileElement getSectionListElement(MobileElement element) {
		return element;
	}

}
