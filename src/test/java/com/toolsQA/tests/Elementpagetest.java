package com.toolsQA.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.toolsQA.basetest.basetest;
import com.toolsQA.constants.constants;
import com.toolsQA.pages.Elementpage;

public class Elementpagetest extends basetest {

	Elementpage elementpage;

	@BeforeClass()
	public void before() {
		elementpage = homepage.goToElementPage();
	}

	@Test
	public void textbox() {
		String actual = homepage.getpagetitle();
		String expected = constants.Element_page_title;
		Assert.assertEquals(actual, expected);
	}
}
