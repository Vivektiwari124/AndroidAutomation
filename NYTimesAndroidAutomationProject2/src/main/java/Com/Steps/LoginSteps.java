package Com.Steps;
import org.testng.Assert;
import Com.NYT.BasePackage.BasePackage;
import Com.NYT.Pages.HomePage;
import Com.NYT.Pages.LoginLinkPage;
import Com.NYT.Pages.LoginPage;
import Com.NYT.Pages.OverflowMenu;
import Com.NYT.Pages.SectionList;
import Com.NYT.Pages.SettingPage;

public class LoginSteps extends BasePackage {
	

	public static void Login_Click() throws InterruptedException {

		//Thread.sleep(5000);
		System.out.println("aaa");
		new HomePage();
		System.out.println("aaa");
		HomePage.getHomePageElemet(HomePage.overFlowicon).click();
		//HomePage.getHomePageElemet(HomePage.hemberger).click();
		//new SectionList();
		//SectionList.getSectionListElement(SectionList.SearchIcon).click();
		Thread.sleep(5000);
		new OverflowMenu();
		OverflowMenu.getOverflowmenuElemet(OverflowMenu.LoginORCreateAccount).click();
		new LoginLinkPage();
		LoginLinkPage.getLoginPageElement(LoginLinkPage.loginWithEmaillink).click();
		new LoginPage();
		LoginPage.getLoginFieldElement(LoginPage.EmailField).sendKeys(LoginPage.userName);
		LoginPage.getLoginFieldElement(LoginPage.passwordfield).sendKeys(LoginPage.password);
		LoginPage.loginButton.click();
		Thread.sleep(2000);
		HomePage.getHomePageElemet(HomePage.overFlowicon).click();
		OverflowMenu.getOverflowmenuElemet(OverflowMenu.Setting).click();
		
		new SettingPage();
		String str = SettingPage.getSettingPageElemet(SettingPage.logintext).getText();
		System.out.println(str);
		Assert.assertEquals(prop.getProperty("username"), str);

	}
}
