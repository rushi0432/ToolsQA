package com.toolsQA.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.toolsQA.basetest.basetest;
import com.toolsQA.constants.constants;
import com.toolsQA.pages.Datepickerpage;
import com.toolsQA.pages.Widgetspageclick;

public class Datepickerpage_Test extends basetest {

	Datepickerpage datepicker;
	
	@BeforeClass
	public void beforeclass() {
		Widgetspageclick widgets = homepage.gotoWidgetspage();
		datepicker= widgets.Widgestdatepicker();
	}
	
	@Test
	public void verifypagetitle() {
		String actual = datepicker.pagetite();
		String expected = constants.DATE_PICKER_PAGE_TITLE;
		Assert.assertEquals(actual, expected);
	}
}
