package com.toolsQA.tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.toolsQA.basetest.basetest;
import com.toolsQA.constants.constants;
import com.toolsQA.pages.Alerts;
import com.toolsQA.pages.Alerts_Frame_Windows;

public class Alert_Test extends basetest {

	Alerts alert;

	@BeforeClass
	public void before() {

		Alerts_Frame_Windows alertframe = homepage.goToAlertsFrameWindows();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		alert = alertframe.goToAlerts();
	}

	@Test(priority = 1)
	public void testAlert() {
		alert.getalert();
		boolean flag = alert.isAlertPresent();
		Assert.assertEquals(flag, true);
		String actual = alert.getAlertPopupMsg();
		String expected = constants.EXPECTED_ALERT_TEXT;
		Assert.assertEquals(actual, expected);
	}

	@Test()
	public void testTitle() {
		String actual = alert.getTitle();
		String expected = constants.ALERTS_PAGE_TITLE;
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 2)
	public void gettimeralert() {
		alert.getalert();
		boolean flag = alert.isAlertPresent();
		Assert.assertEquals(flag, true);
		String actual = alert.getTimerAlertPopopMsg();
		String expected = constants.EXPECTED_TIMER_ALERT_TEXT;
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 3)
	public void testConfirmAlertPopupMsg() {
		alert.getconformbuttonalert();
		boolean flag = alert.isAlertPresent();
		Assert.assertEquals(flag, true);
		String actual = alert.getConfirmAlertPopopMsg();
		String expected = constants.EXPECTED_CONFIRM_ALERT_POPUP_TEXT;
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 4)
	public void testConfirmAlertSuccesfullMsg() {
		String actual = alert.getConfirmAlertSuccesfullMsg();
		String expected = constants.PROMPT_ALERT_TEXT;
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 5)
	public void testPromptAlertPopupMsg() {
		alert.getPromptAlertPopopMsg();
		boolean flag = alert.isAlertPresent();
		Assert.assertEquals(flag, true);
		String actual = alert.getPromptAlertPopopMsg();
		String expected = constants.EXPECTED_PROMPT_ALERT_POPUP_TEXT;
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 6)
	public void testPromptAlertInputText() {
		String actual = alert.getPromptAlertInputText();
		String expected = constants.PROMPT_ALERT_TEXT;
		Assert.assertEquals(actual, expected);
	}
}
