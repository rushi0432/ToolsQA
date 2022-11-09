package com.toolsQA.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.toolsQA.basetest.basetest;
import com.toolsQA.constants.constants;
import com.toolsQA.pages.Dreaggablepage;
import com.toolsQA.pages.Interactionspageclick;
import com.toolsQA.pages.Resizablepage;

public class Resizablepagetest extends basetest {

	Resizablepage resizable;

	@BeforeClass
	public void beforeclass() {
		Interactionspageclick interaction = homepage.gotoInteractionspage();
		resizable = interaction.intractionsRezisable();
	}

	@Test
	public void verifypagetitle() {
		String actual = resizable.getTitle();
		String expected = constants.RESIZABLE_PAGE_TITLE;
		Assert.assertEquals(actual, expected);
	}

}
