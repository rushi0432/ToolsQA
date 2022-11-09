package com.toolsQA.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.toolsQA.basetest.basetest;
import com.toolsQA.constants.constants;
import com.toolsQA.pages.Interactionspageclick;
import com.toolsQA.pages.Sortablepage;

public class Sortablepagetest extends basetest {

	Sortablepage sortable;

	@BeforeClass
	public void beforeclass() {
		Interactionspageclick interaction = homepage.gotoInteractionspage();
		sortable = interaction.intractionsortable();
	}

	@Test
	public void verifypagetitle() {
		String actual = sortable.pagetitle();
		String expected = constants.SORTABLE_PAGE_TITLE;
		Assert.assertEquals(actual, expected);
	}
}
