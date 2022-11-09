package com.toolsQA.tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.toolsQA.basetest.basetest;
import com.toolsQA.constants.constants;
import com.toolsQA.pages.Alerts;
import com.toolsQA.pages.Alerts_Frame_Windows;

public class Alertspageclicktest extends basetest {

	Alerts alertspage;

	@BeforeClass
	public void before() {
		Alerts_Frame_Windows alertframe = homepage.goToAlertsFrameWindows();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		alertspage = alertframe.goToAlerts();
	}

	@Test
	public void verifypagetitle() {
		String actual = alertspage.getTitle();
		String expected = constants.ALERTS_PAGE_CLICK_PAGE_TITLE;
		Assert.assertEquals(actual, expected);
	}

}
