package Com.NYT.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.MobileElement;

public class LoginLinkPage {

	public static MobileElement loginWithEmaillink = Const.driver
			.findElementByXPath("//android.widget.TextView[@text='Log in with email instead »']");

	public static MobileElement getLoginPageElement(MobileElement element) {
		return element;
	}
}
