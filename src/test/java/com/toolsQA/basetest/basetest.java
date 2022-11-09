package com.toolsQA.basetest;

import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.toolsQA.driverfactory.driverfactory;
import com.toolsQA.pages.Homepage;
import com.toolsQA.utils.propconfi;
import com.toolsQA.utils.screenshotutil;

public class basetest {

	static Logger Log = Logger.getLogger(basetest.class.getName());

	private driverfactory df;
	protected WebDriver driver;
	protected Homepage homepage;
	protected Properties prop;

	@BeforeTest
	public void setup() throws IOException {
		prop = propconfi.loadproperties("ST");
		df = new driverfactory();
		driver = df.init_driver();
		driver.get(prop.getProperty("baseurl"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		homepage = new Homepage(driver);
	}

	@AfterTest
	public void aftertest() {
		driver.quit();
	}

	@AfterMethod
	public void aftertest(ITestResult result) {
		System.out.println("screenshot is captured succesfully");
		if (result.getStatus() == ITestResult.FAILURE) {
			String screenshotname = result.getMethod().getMethodName();
			screenshotutil.takescreenshot(driver, screenshotname);
		}
	}
}
