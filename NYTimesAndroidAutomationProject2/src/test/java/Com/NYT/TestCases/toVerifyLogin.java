package Com.NYT.TestCases;

import org.testng.annotations.Test;
import Com.NYT.BasePackage.businessComponent;

public class toVerifyLogin extends businessComponent {

	@Test
	public void toVerifyLoginfunc() {

		try {
			Login_Click();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
