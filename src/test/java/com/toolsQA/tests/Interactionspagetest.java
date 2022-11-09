package com.toolsQA.tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.toolsQA.basetest.basetest;
import com.toolsQA.constants.constants;
import com.toolsQA.pages.Interactionspageclick;

public class Interactionspagetest extends basetest{
	
	Interactionspageclick interaction;
	
	@BeforeClass
	public void before() {
	interaction = homepage.gotoInteractionspage();
	}
	
	@Test
	public void intractionpagetitle() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)","");
		String actual = interaction.getPageTitle();
		String expected = constants.INTRACTION_PAGE_TITLE;
		Assert.assertEquals(actual, expected);
	}
}
