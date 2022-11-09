package com.toolsQA.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.toolsQA.basetest.basetest;
import com.toolsQA.constants.constants;
import com.toolsQA.pages.Progressbarpage;
import com.toolsQA.pages.Widgetspageclick;

public class Progressbarpage_Test extends basetest {
	Progressbarpage progressbar;

	@BeforeClass
	public void beforeclass() {
		Widgetspageclick widgets = homepage.gotoWidgetspage();
		progressbar = widgets.Widgetsprogressbar();
	}

	@Test
	public void verifypagetitle() {
		String actual = progressbar.pagetite();
		String expected = constants.PROGRESSBAR_PAGE_TITLE;
		Assert.assertEquals(actual, expected);
	}

	@Test
	public void verifyProgressBar() {
		String actual = progressbar.handleProgressBar("50");
		String expected = constants.EXPECTED_PROGRESS_BAR_TEXT;
		Assert.assertEquals(actual, expected);
	}

}
