package com.toolsQA.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.toolsQA.basetest.basetest;
import com.toolsQA.constants.constants;
import com.toolsQA.pages.Interactionspageclick;
import com.toolsQA.pages.Selectablepage;

public class Selectablepagetest extends basetest {
	Selectablepage select;

	@BeforeClass
	public void beforeclass() {
		Interactionspageclick interaction = homepage.gotoInteractionspage();
		select = interaction.intractionsselectable();
	}

	@Test
	public void verifypagetitle() {
		String actual = select.pagetite();
		String expected = constants.SELECTABLE_PAGE_TITLE;
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 1)
	public void firstnameselected() {
		boolean actual = select.firstnameselect();
		boolean expected = constants.SELECTABLE_FIRST_NAME;
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 2)
	public void secondnameselected() {
		boolean actual = select.secondnameselect();
		boolean expected = constants.SELECTABLE_SECOND_NAME;
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 3)
	public void thirdnameselected() {
		boolean actual = select.thirdnameselect();
		boolean expected = constants.SELECTABLE_THIRD_NAME;
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 4)
	public void fourthnameselected() {
		boolean actual = select.fourthnameselect();
		boolean expected = constants.SELECTABLE_FOURTH_NAME;
		Assert.assertEquals(actual, expected);
	}
}
