package com.toolsQA.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.toolsQA.basetest.basetest;
import com.toolsQA.constants.constants;
import com.toolsQA.pages.Tooltippage;
import com.toolsQA.pages.Widgetspageclick;

public class Tooltippage_test extends basetest {

	Tooltippage tooltippage;

	@BeforeClass
	public void beforeclass() {
		Widgetspageclick widgets = homepage.gotoWidgetspage();
		tooltippage = widgets.Widgetstooltip();
	}

	@Test(priority = 1)
	public void verifytitle() {
		String actual = tooltippage.getpagetite();
		String expected = constants.TOOLTIP_PAGE_TITLE;
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 2)
	public void verfifybuttonhover() {
		String actual = tooltippage.verifybuttonhover();
		String expected = constants.TOOLTIP_BUTTON_HOVER;
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 3)
	public void verfifycontainerhover() {
		String actual = tooltippage.verifycontainerhover();
		String expected = constants.TOOLTIP_CONTAINOR_HOVER;
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 4)
	public void verfifytexthover() {
		String actual = tooltippage.verifytexthover();
		String expected = constants.TOOLTIP_TEXT_HOVER;
		Assert.assertEquals(actual, expected);
	}

	@Test
	public void verfifynumberhover() {
		String actual = tooltippage.verifynumberhover();
		String expected = constants.TOOLTIP_NUMBER_HOVER;
		Assert.assertEquals(actual, expected);
	}
}
