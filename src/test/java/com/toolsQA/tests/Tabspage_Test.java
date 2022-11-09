package com.toolsQA.tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.toolsQA.basetest.basetest;
import com.toolsQA.constants.constants;
import com.toolsQA.pages.Tabspage;
import com.toolsQA.pages.Widgetspageclick;

public class Tabspage_Test extends basetest {

	Tabspage tabspage;

	@BeforeClass
	public void beforeclass() {
		Widgetspageclick widgets = homepage.gotoWidgetspage();
		tabspage = widgets.Widgetstab();
	}

	@Test
	public void verifypagetitle() {
		String actual = tabspage.pagetite();
		String expected = constants.TABS_PAGE_TITLE;
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 1)
	public void verfitywhattab() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)", "");
		String actual = tabspage.verifywhattab();
		String expected = constants.WHAT_TAB_PAGE_;
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 2)
	public void verfityorigintab() {
		String actual = tabspage.verifyorigintab();
		String expected = constants.ORIGIN_TAB_PAGE_;
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 3)
	public void verfityusetab() {
		String actual = tabspage.verifyusertab();
		String expected = constants.USE_TAB_PAGE_;
		Assert.assertEquals(actual, expected);
	}
}
