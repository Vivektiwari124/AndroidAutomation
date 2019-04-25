package ConfigProperties;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
public class propertiesRead {

	public static Properties readProperties() {
		try {
			// System.getProperty("user.dir")
			File appp = new File(
					"C:\\Users\\Vivek\\git\\AndroidAutomation\\NYTimesAndroidAutomationProject2\\src\\main\\java\\ConfigProperties\\config.properties");
			FileInputStream fileInput = new FileInputStream(appp);
			Properties prop = new Properties();
			prop.load(fileInput);
			return prop;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
}
