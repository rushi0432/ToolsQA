package com.toolsQA.utils;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenshotutil {

	public static void takescreenshot(WebDriver driver, String screenshotname) {
		String Pathname = System.getProperty("user.dir");
		String fullpath = Pathname + "\\screenshots\\" + screenshotname + ".jpg";
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File(fullpath));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
