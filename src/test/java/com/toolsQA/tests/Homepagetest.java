package com.toolsQA.tests;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.toolsQA.basetest.basetest;
import com.toolsQA.constants.constants;

public class Homepagetest extends basetest{
	
	static Logger Log = Logger.getLogger(Homepagetest.class.getName());

	
	@Test
	public void pagetitletest() {
		String actual = homepage.getpagetitle();
		String expected = constants.HOME_PAGE_TITLE;
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void elementtobepresenttest() {
		String actual = homepage.getelementtobepresent();
		String exprected = constants.HOME_PAGE_ELEMENTS;
		Assert.assertEquals(actual, exprected);	
	}
	
	@Test
	public void getformstobepresent() {
		String actual = homepage.getformstobepresent();
		String expected = constants.HOME_PAGE_FORMS;
		Assert.assertEquals(actual, expected);	
	}
	
	@Test
	public void getalertstobepresent() {
		String actual = homepage.getalertstobepresent();
		String expected = constants.HOME_PAGE_Alerts_Frame_Windows;
		Assert.assertEquals(actual, expected);	
	}
	
	@Test
	public void getwidgetstobepresent() {
		String actual = homepage.getwidgetstobepresent();
		String expected = constants.HOME_PAGE_Widgets;
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void getintrectionstobepresent() {
		String actual = homepage.getintrectionstobepresent();
		String expected = constants.HOME_PAGE_Interactions;
		Assert.assertEquals(actual, expected);
		
	}
	
	@Test
	public void getbooktobepresent() {
		String actual = homepage.getbooktobepresent();
		String expected = constants.HOME_PAGE_Book_Store_Application;
		Assert.assertEquals(actual, expected);
		
	}
}
