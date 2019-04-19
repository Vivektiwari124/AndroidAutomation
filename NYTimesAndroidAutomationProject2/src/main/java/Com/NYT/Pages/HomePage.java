package Com.NYT.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Com.NYT.BasePackage.BasePackage;
import io.appium.java_client.MobileElement;

public class HomePage  {

	public static MobileElement hemberger = Const.driver
			.findElement(By.xpath("//android.widget.ImageButton[@index='0']"));

	public static MobileElement overFlowicon = Const.driver
			.findElement(By.xpath("//android.widget.ImageView[contains(@content-desc,'More options') and @index='0']"));

	public static MobileElement sectionname = Const.driver
			.findElement(By.xpath("//android.widget.TextView[@text='OPINION']"));
	public static MobileElement image = Const.driver.findElement(By.id("com.nytimes.android.debug:id/media_image"));
	public static MobileElement NamePlate = Const.driver.findElement(By.id("com.nytimes.android.debug:id/nameplate"));

	public static MobileElement getHomePageElemet(MobileElement element) {
		return element;

	}

	public static boolean validateHomePageImage() {
		return image.isDisplayed();

	}

	public static boolean validateTemplate() {
		return NamePlate.isDisplayed();

	}

	public static boolean validateHemberger() {
		return hemberger.isDisplayed();
	}
}
