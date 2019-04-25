package Com.NYT.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {

	AppiumDriver<MobileElement> driver;

	public HomePage(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
	}

	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc,'More options') and @index='0']")
	MobileElement overflowIcon;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[@index='0']")
	MobileElement hemberger;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='OPINION']")
	MobileElement sectionname;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Opinion']")
	List<MobileElement> allelements;

	public List<MobileElement> getGroupName() {
		return allelements;

	}

	
	
	
	
	
	public void clickOverFlow() {
		overflowIcon.click();
	}

	public void clickHemberger() {
		hemberger.click();
	}

	public void clickSectionname() {
		sectionname.click();
	}

}
