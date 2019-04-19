package Com.Steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Com.NYT.BasePackage.BasePackage;
import Com.NYT.Pages.Const;
import Com.NYT.Pages.HomePage;
import Com.NYT.Pages.OverflowMenu;
import Com.NYT.Pages.SettingPage;
import io.appium.java_client.MobileElement;

public class SettingNavigation extends BasePackage {
	
	
	public static void VerifySetting() {
		// TODO Auto-generated method stub
		
		new HomePage();
		System.out.println("dsdsdsdsdfdfdfdf");
		HomePage.getHomePageElemet(HomePage.overFlowicon).click();
		new OverflowMenu();
		OverflowMenu.getOverflowmenuElemet(OverflowMenu.Setting).click();
		
		

	}

}
