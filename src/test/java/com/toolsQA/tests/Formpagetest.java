package com.toolsQA.tests;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.toolsQA.basetest.basetest;
import com.toolsQA.constants.constants;
import com.toolsQA.pages.Formpage;

public class Formpagetest extends basetest {

	static Logger Log = Logger.getLogger(Formpagetest.class.getName());

	Formpage formpage;

	@BeforeClass()
	public void before() {
		formpage = homepage.gotoFormpage();
	}

	@Test
	public void practiseformpagetitle() {
		String actual = formpage.getPageTitle();
		String expected = constants.FORM_TO_BE_DISPLAYED;
		Assert.assertEquals(actual, expected);
	}
}
