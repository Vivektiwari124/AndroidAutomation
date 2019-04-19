package Com.NYT.TestCases;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com.NYT.BasePackage.BasePackage;
import Com.NYT.Pages.Const;
import Com.NYT.Pages.HomePage;

public class toVerifyHomePageData extends BasePackage {
	HomePage homepage;

	//@Test
	public void toCheckHomePage_NamePlate() {

		homepage = new HomePage();
		boolean flag = HomePage.validateTemplate();
		Assert.assertTrue(flag);

	}

	//@Test
	public void toCheckHomePage_Image() {

		homepage = new HomePage();
		boolean flag = HomePage.validateHomePageImage();
		Assert.assertTrue(flag);

	}

}

/*
 * try {
 * 
 * 
 * 
 * if (flag == true) { System.out.println("image is displayed"); } else {
 * System.out.println("image is not displayed"); }
 * Const.driver.findElement(By.xpath("//android.widget.TextView[@index='2']")).
 * click(); Thread.sleep(5000); boolean ct = Const.driver.findElement(By.xpath(
 * "//android.widget.RelativeLayout[@index='1']")) .isDisplayed(); if (ct ==
 * true) { count = count + 1; } else { count = 0;
 * 
 * }
 * 
 * System.out.println(count); } catch (Exception e) { // TODO: handle exception
 * }
 */
