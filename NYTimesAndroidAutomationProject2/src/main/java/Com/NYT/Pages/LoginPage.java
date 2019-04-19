package Com.NYT.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Com.NYT.BasePackage.BasePackage;
import io.appium.java_client.MobileElement;

public class LoginPage extends BasePackage{

	public static MobileElement EmailField = Const.driver.findElementByXPath("//android.widget.EditText[@text='Email']");
	public static MobileElement passwordfield=Const.driver.findElementByXPath("//android.widget.EditText[@text='Password']");
	public static MobileElement loginButton= Const.driver.findElementByXPath("//android.widget.Button[@text='Log In']");
	public static String userName=prop.getProperty("username");
	public static String password=prop.getProperty("password");
	
	
	public static MobileElement getLoginFieldElement(MobileElement element) {
		return element;
	}
}
