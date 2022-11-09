package com.toolsQA.tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.toolsQA.basetest.basetest;
import com.toolsQA.constants.constants;
import com.toolsQA.pages.Widgetspageclick;

public class Widgetspagetest extends basetest {

	Widgetspageclick widgetspage;

	@BeforeClass
	public void before() {
		widgetspage = homepage.gotoWidgetspage();
	}

	@Test
	public void tooltippagetitle() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");
		String actual = widgetspage.gettooltippagetitle();
		String expected = constants.TOOLTIP_PAGE_TITLE;
		Assert.assertEquals(actual, expected);
	}

}
