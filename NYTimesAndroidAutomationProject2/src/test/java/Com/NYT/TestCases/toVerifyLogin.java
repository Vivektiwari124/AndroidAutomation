package Com.NYT.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import Com.Steps.*;
import Com.NYT.BasePackage.BasePackage;
import Com.NYT.Pages.Const;
import Com.NYT.Pages.HomePage;

public class toVerifyLogin extends BasePackage{

	@Test
	public void toVerifyLoginfunc() {

		try {

			//Thread.sleep(2000);
			BasePackage b = new BasePackage();
			b.Appinvoke();
			LoginSteps.Login_Click();
			b.QuitApp();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
