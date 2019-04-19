package Com.NYT.TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com.NYT.BasePackage.BasePackage;
import Com.NYT.Pages.Const;
import Com.NYT.Pages.HomePage;
import Com.NYT.Pages.OverflowMenu;
import Com.NYT.Pages.SettingPage;
import Com.NYT.Utils.UtilityClass;
import Com.Steps.SettingNavigation;
import io.appium.java_client.MobileElement;

public class ToVerifySettingOption extends BasePackage {

	@Test
	public void toCheckSettingItemPart1() throws InterruptedException  {

		System.out.println("sdsdsd");
		BasePackage b = new BasePackage();
		b.Appinvoke();
		System.out.println("sdsdsd");
		SettingNavigation.VerifySetting();
		Thread.sleep(2000);
		List<MobileElement> element = Const.driver.findElements(By.xpath("//android.widget.TextView"));
		for (MobileElement Settingitem1 : element) {
			System.out.println(Settingitem1.getText());
			boolean flag = Settingitem1.isDisplayed();
			Assert.assertTrue(flag,"ELement is not displayed");
			
		}
		System.out.println("All Elements displayed successfully");
		b.QuitApp();
		
		/*Thread.sleep(2000);
		UtilityClass.scrollvertical();
		List<MobileElement> element1 = Const.driver.findElements(By.xpath("//android.widget.TextView"));
		for (MobileElement Settingitem2 : element1) {
			System.out.println(Settingitem2.getText());
			boolean flag1 = Settingitem2.isDisplayed();
			Assert.assertTrue(flag1,"ELement is not displayed");
			
		}
		System.out.println("All Elements displayed successfully");
		*/

	}

	/*@Test(priority = 2)
	public void toCheckSettingItemPart2() throws InterruptedException {
		
		System.out.println("part2");
		
		SettingNavigation.VerifySetting();

		UtilityClass.scroll();
		System.out.println("dsdsdsd");

	}*/

}
