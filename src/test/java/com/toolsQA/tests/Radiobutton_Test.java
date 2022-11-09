package com.toolsQA.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.toolsQA.basetest.basetest;
import com.toolsQA.constants.constants;
import com.toolsQA.pages.Elementpage;
import com.toolsQA.pages.Radiobutton;

public class Radiobutton_Test extends basetest {

	Radiobutton radiobutton;

	@BeforeClass
	public void before() {
		Elementpage ele = homepage.goToElementPage();
		radiobutton = ele.Radiobtn();
	}

	@Test
	public void verfiypagetitle() {
		String actual = radiobutton.pagetite();
		String expected = constants.RADIO_BUTTON_TITLE;
		Assert.assertEquals(actual, expected);
	}

	@Test
	public void verfiyyesbutton() {
		boolean actual = radiobutton.verifyyes();
		boolean expected = constants.RADIO_BUTTON_YES;
		Assert.assertEquals(actual, expected);
	}

	@Test
	public void verfiyimpressiverbutton() {
		boolean actual = radiobutton.verifyimpressivebutton();
		boolean expected = constants.RADIO_BUTTON_Impressive;
		Assert.assertEquals(actual, expected);
	}
}
