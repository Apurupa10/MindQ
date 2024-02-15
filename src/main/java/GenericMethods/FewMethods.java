package GenericMethods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BasePackage.BaseClass;

public class FewMethods extends BaseClass {
	public static String TakeScreen() throws IOException {
		String screenshotPath = "";
		TakesScreenshot pic = (TakesScreenshot)driver;
		File srcFile = pic.getScreenshotAs(OutputType.FILE);
		File destPath = new File("D://NEW//" + "ScreenCapture" + System.currentTimeMillis() + ".png");
		FileUtils.copyFile(srcFile, destPath);
		screenshotPath = destPath.getAbsolutePath();
		return screenshotPath;
	}
	
	

}
