package com.toolsQA.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.toolsQA.basetest.basetest;
import com.toolsQA.constants.constants;
import com.toolsQA.pages.Menupage;
import com.toolsQA.pages.Widgetspageclick;

public class Menupage_Test extends basetest {

	Menupage menupage;

	@BeforeClass
	public void beforeclass() {
		Widgetspageclick widgets = homepage.gotoWidgetspage();
		menupage = widgets.Widgetsmenu();
	}

	@Test
	public void verifypagetitle() {
		String actual = menupage.pagetite();
		String expected = constants.MENU_PAGE_TITLE;
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 5)
	public void Verifymenuitems1() {
		String actual = menupage.verifysubsubitem1();
		String expected = constants.SUB_SUB_ITEM_2;
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 4)
	public void Verifymenuitems2() {
		String actual = menupage.verifysubsubitem2();
		String expected = constants.SUB_SUB_ITEM_1;
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 1)
	public void Verifymainitems1() {
		String actual = menupage.verifymainitem1();
		String expected = constants.MAIN_ITEM_1;
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 3)
	public void Verifymainitems2() {
		String actual = menupage.verifymainitem2();
		String expected = constants.MAIN_ITEM_2;
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 2)
	public void Verifymainitems3() {
		String actual = menupage.verifymainitem3();
		String expected = constants.MAIN_ITEM_3;
		Assert.assertEquals(actual, expected);
	}
}
