package Com.NYT.TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Com.NYT.Pages.Const;
import Com.NYT.Utils.UtilityClass;
import Com.Steps.SectionListScroll;

public class toVerifySectionListScrolling extends UtilityClass {

	//@Test
	public void ToVerifySectionListScroll() {

		SectionListScroll.scrollSectionList();

	}

}
