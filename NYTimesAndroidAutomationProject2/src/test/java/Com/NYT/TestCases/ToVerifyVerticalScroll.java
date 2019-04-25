package Com.NYT.TestCases;
import org.testng.annotations.Test;
import Com.NYT.BasePackage.businessComponent;


public class ToVerifyVerticalScroll extends businessComponent {

	@Test
	public void ScrollTest() throws InterruptedException {
		Thread.sleep(5000);
		scrollvertical();

	}

}
