package Com.NYT.Pages;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;

public class OverflowMenu {

	public static MobileElement LoginORCreateAccount = Const.driver
			.findElement(By.xpath("//android.widget.TextView[@text='Log In or Create Account']"));

	public static MobileElement Setting = Const.driver
			.findElement(By.xpath("//android.widget.TextView[@text='Settings']"));

	
	public static MobileElement getOverflowmenuElemet(MobileElement element) {
		return element;

	}

}
