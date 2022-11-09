package com.toolsQA.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.toolsQA.basetest.basetest;
import com.toolsQA.constants.constants;
import com.toolsQA.pages.Buttonspage;
import com.toolsQA.pages.Elementpage;

public class Buttonspage_Test extends basetest {
	Buttonspage button;

	@BeforeClass
	public void before() {
		Elementpage ele = homepage.goToElementPage();
		button = ele.buttons();
	}

	@Test
	public void verfiypagetitle() {
		String actual = button.pagetite();
		String expected = constants.BUTTONS_page_title;
		Assert.assertEquals(actual, expected);
	}

	@Test
	public void verfiybutton1() {
		String actual = button.verifybutton1();
		String expected = constants.BUTTONS_1;
		Assert.assertEquals(actual, expected);
	}

	@Test
	public void verfiybutton2() {
		String actual = button.verifybutton2();
		String expected = constants.BUTTONS_2;
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 1)
	public void verfiybutton3() {
		String actual = button.verifybutton3();
		String expected = constants.BUTTONS_3;
		Assert.assertEquals(actual, expected);
	}
}
