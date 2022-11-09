package com.toolsQA.tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.toolsQA.basetest.basetest;
import com.toolsQA.constants.constants;
import com.toolsQA.pages.Droppablepage;
import com.toolsQA.pages.Interactionspageclick;

public class Droppablepagetest extends basetest {

	Droppablepage droppable;

	@BeforeClass
	public void beforeclass() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		Interactionspageclick interaction = homepage.gotoInteractionspage();
		droppable = interaction.intractionsDroppable();
	}

	@Test
	public void verifypagetitle() {
		String actual = droppable.getTitle();
		String expected = constants.DROPABLE_PAGE_TITLE;
		Assert.assertEquals(actual, expected);
	}

	@Test
	public void verifyDragDrop() throws InterruptedException {
		String actual = droppable.performDragDrop();
		String expected = constants.EXPECTED_DROP_TEST;
		Assert.assertEquals(actual, expected);
	}

	@Test
	public void verifyAccepatbleDragDrop() {
		String actual = droppable.performAcceptableDragDrop();
		String expected = constants.EXPECTED_DROP_TEST1;
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 1)
	public void verifyNotAccepatbleDragDrop() {
		String actual = droppable.performNotAcceptableDragDrop();
		String expected = constants.EXPECTED_NOT_ACCEPTABLE_DROP_TEXT;
		Assert.assertEquals(actual, expected);
	}

}
