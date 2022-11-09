package com.toolsQA.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.toolsQA.basetest.basetest;
import com.toolsQA.constants.constants;
import com.toolsQA.pages.Dreaggablepage;
import com.toolsQA.pages.Interactionspageclick;

public class Dreaggablepagetest extends basetest {

	Dreaggablepage draggable;

	@BeforeClass
	public void beforeclass() {
		Interactionspageclick interaction = homepage.gotoInteractionspage();
		draggable = interaction.intractionsDreaggable();
	}

	@Test
	public void verifypagetitle() {
		String actual = draggable.getTitle();
		String expected = constants.DRAGABBLE_PAGE_TITLE;
		Assert.assertEquals(actual, expected);
	}

}
