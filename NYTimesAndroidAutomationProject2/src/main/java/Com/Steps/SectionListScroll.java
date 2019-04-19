package Com.Steps;

import org.openqa.selenium.By;

import Com.NYT.Pages.Const;
import Com.NYT.Utils.UtilityClass;

public class SectionListScroll {

	public static void scrollSectionList() {
		Const.driver.findElement(By.xpath("//android.widget.ImageButton[@index='0']")).click();
		UtilityClass.scrollSectionListVertical();

	}
}
