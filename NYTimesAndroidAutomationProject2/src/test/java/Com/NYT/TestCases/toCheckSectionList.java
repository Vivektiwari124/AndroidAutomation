package Com.NYT.TestCases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com.NYT.BasePackage.BasePackage;
import Com.NYT.Pages.Const;
import io.appium.java_client.MobileElement;

public class toCheckSectionList extends BasePackage {
	boolean res;

	public static List<MobileElement> GetSectionlistData() {
		return Const.driver
				.findElements(By.xpath("//android.widget.TextView[@resource-id='com.nytimes.android.debug:id/title']"));
	}

	//@Test
	public void toInvokeSectionlistItem() throws InterruptedException {
		List<String> notSoCoolStringList = new ArrayList<String>();
		List<String> SectionlistItem = Arrays.asList("Podcasts Beta", "CUSTOMIZED SECTIONS", "Home", "Most Popular",
				"Opinion", "World", "U.S.", "Business", "Sports", "Arts", "New York", "Magazine", "Video");
		System.out.println("Section list items are" + SectionlistItem);
		System.out.println(SectionlistItem.size());
		Const.driver.findElement(By.xpath("//android.widget.ImageButton[@index='0']")).click();
		System.out.println("SectionList Invoked Successfully");
		Thread.sleep(5000);
		int len = GetSectionlistData().size();
		System.out.println(len);
		for (MobileElement ele : GetSectionlistData()) {
			notSoCoolStringList.add(ele.getText());
		}
		System.out.println(notSoCoolStringList);
		Assert.assertEquals(notSoCoolStringList, SectionlistItem);

	}

}