package com.toolsQA.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.toolsQA.basetest.basetest;
import com.toolsQA.constants.constants;
import com.toolsQA.pages.Accordianpage;
import com.toolsQA.pages.Widgetspageclick;

public class Accordianpage_Test extends basetest {

	Accordianpage accordianpage;

	@BeforeClass
	public void beforeclass() {
		Widgetspageclick widgets = homepage.gotoWidgetspage();
		accordianpage = widgets.Widgetsaccordian();
	}

	@Test
	public void verifypagetitle() {
		String actual = accordianpage.pagetite();
		String expected = constants.ACCORDIAN_PAGE_TITLE;
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 3)
	public void verfiryfirstaccordian() {
		String actual = accordianpage.vefifyfirstaccordian();
		String expected = constants.FIRST_ACCORDIAN;
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 2)
	public void verfirysecondaccordian() {
		String actual = accordianpage.verifysecondaccordian();
		String expected = constants.SECOND_ACCORDIAN;
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 1)
	public void verfirythirdaccordian() {
		String actual = accordianpage.vefifythirdaccordian();
		String expected = constants.THIRD_ACCORDIAN;
		Assert.assertEquals(actual, expected);
	}

}
