package Com.NYT.BasePackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.testng.Assert;

import Com.NYT.Pages.HomePage;
import Com.NYT.Pages.LoginLinkPage;
import Com.NYT.Pages.LoginPage;
import Com.NYT.Pages.OverflowMenu;
import Com.NYT.Pages.SectionList;
import Com.NYT.Pages.SettingPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class businessComponent extends BasePackage {

	public void checkSections() throws InterruptedException {
		HomePage h= new HomePage(driver);
		h.clickHemberger();
		
		SectionList st =new SectionList(driver);
		st.clickSearch();
		Thread.sleep(2000);
	}
	
	
	
	
	public void checkSettingoption() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		hp.clickOverFlow();

		OverflowMenu ov = new OverflowMenu(driver);
		ov.clickSetting();

		Thread.sleep(5000);

		List<MobileElement> element = driver.findElements(By.xpath("//android.widget.TextView"));
		for (MobileElement Settingitem1 : element) {
			System.out.println(Settingitem1.getText());
			boolean flag = Settingitem1.isDisplayed();
			Assert.assertTrue(flag, "ELement is not displayed");

		}
		System.out.println("All Elements displayed successfully");
		// b.QuitApp();

		/*
		 * Thread.sleep(2000); UtilityClass.scrollvertical(); List<MobileElement>
		 * element1 = Const.driver.findElements(By.xpath("//android.widget.TextView"));
		 * for (MobileElement Settingitem2 : element1) {
		 * System.out.println(Settingitem2.getText()); boolean flag1 =
		 * Settingitem2.isDisplayed();
		 * Assert.assertTrue(flag1,"ELement is not displayed");
		 * 
		 * } System.out.println("All Elements displayed successfully");
		 */

	}

	public void swipe() {
		try {

			Dimension dim = driver.manage().window().getSize();
			int height = dim.getHeight();
			int width = dim.getWidth();

			int stx = (int) (dim.getWidth() * 0.80);
			int ex = (int) (dim.getWidth() * 0.05);
			int sty = height / 2;
			int ey = height / 2;
			new TouchAction((PerformsTouchActions) driver).press(PointOption.point(stx, sty))
					.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(ex, ey))
					.release().perform();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<MobileElement> getSectionName() {

		return driver.findElements(By.xpath("//android.widget.TextView[@text='SPORTS']"));

	}

	public void scrollhorizontal() {
		System.out.println("dsdsdsd");
		int len = getSectionName().size();
		System.out.println(len);
		while (getSectionName().size() == 0) {
			swipe();
		}

		if (getSectionName().size() > 0) {
			System.out.println("done");
			getSectionName().get(0).getText();
		}

	}

	public static void scrollvertical() {
		HomePage h = new HomePage(driver);
		int len = h.getGroupName().size();
		// System.out.println(len);
		while (h.getGroupName().size() == 0) {
			scroll();
		}

		if (h.getGroupName().size() > 0) {
			// System.out.println("done");
			// getGroupName().get(0).getText();
			// len=0;

		}

	}

	public void checkSeekBar() {
		/*
		 * MobileElement
		 * slider=driver.findElementById("com.nytimes.android:id/fontDlgSeekBar"); int
		 * xAxisStartPoint = slider.getLocation().getX(); int xAxisEndPoint =
		 * xAxisStartPoint + slider.getSize().getWidth(); int yAxis =
		 * slider.getLocation().getY(); //TouchAction act=new TouchAction(driver);
		 * //pressed x axis & y axis of seekbar and move seekbar till the end
		 * 
		 * new TouchAction((PerformsTouchActions)
		 * driver).press(PointOption.point(xAxisStartPoint, yAxis))
		 * .moveTo(PointOption.point(xAxisEndPoint-1, yAxis)) .release().perform();
		 */

		MobileElement seekBar = driver.findElement(By.id("com.nytimes.android:id/fontDlgSeekBar"));
		// Get start point of seekbar.
		int startX = seekBar.getLocation().getX();
		System.out.println(startX);
		// Get end point of seekbar.
		int endX = seekBar.getSize().getWidth();
		System.out.println(endX);
		// Get vertical location of seekbar.
		int yAxis = seekBar.getLocation().getY();
		// Set slidebar move to position.
		// this number is calculated based on (offset + 3/4width)
		int moveToXDirectionAt = 1000 - startX;
		System.out.println("Moving seek bar at " + moveToXDirectionAt + " In X direction.");
		// Moving seekbar using TouchAction class.
		// TouchAction act=new TouchAction(driver);
		new TouchAction((PerformsTouchActions) driver).longPress(PointOption.point(startX, yAxis))
				.moveTo(PointOption.point(moveToXDirectionAt, yAxis)).release().perform();

	}

	public List<MobileElement> getSectionListSectionName() {
		return driver.findElements(By.xpath("//android.widget.TextView[@text='Technology']"));

	}

	public void scrollSectionListVertical() {
		int len = getSectionListSectionName().size();
		System.out.println(len);
		while (getSectionListSectionName().size() == 0) {
			scroll();
		}

		if (getSectionListSectionName().size() > 0) {
			System.out.println("done");
			getSectionListSectionName().get(0).getText();
			// String str = getGroupName().get(0).getText();
			// System.out.println(str);

		}
	}

	public static void scroll()
	// if you are using appium client less then 6.0.0 then no need to use
	// pointoption & wait method action method
	// we can directly use press method & in that we can pass perameters of x axis &
	// y axis & move to
	// method
	{
		try {

			HomePage h = new HomePage(driver);
			Dimension dim = driver.manage().window().getSize();
			int height = dim.getHeight();
			int width = dim.getWidth();
			int startx = width / 2;
			int endx = width / 2;
			int starty = (int) (dim.getHeight() * 0.40);
			int endy = (int) (dim.getHeight() * 0.05);
			new TouchAction((PerformsTouchActions) driver).press(PointOption.point(startx, starty))
					.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(endx, endy))
					.release().perform();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void Login_Click() throws InterruptedException {

		Thread.sleep(2000);
		HomePage hp = new HomePage(driver);
		hp.clickOverFlow();
		Thread.sleep(5000);
		OverflowMenu ov = new OverflowMenu(driver);
		ov.clickSetting();
		SettingPage st = new SettingPage(driver);
		st.clickLogin();
		LoginLinkPage lp = new LoginLinkPage(driver);
		lp.clickLoginLink();
		LoginPage lpage = new LoginPage(driver);
		lpage.Enterlogindetail();
		Thread.sleep(2000);
		String str = st.readdata();
		System.out.println(str);
		Assert.assertEquals(lpage.userName, str);

	}
}
