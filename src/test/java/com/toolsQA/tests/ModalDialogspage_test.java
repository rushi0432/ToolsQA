package com.toolsQA.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.toolsQA.basetest.basetest;
import com.toolsQA.pages.Alerts_Frame_Windows;
import com.toolsQA.pages.ModalDialogspage;

public class ModalDialogspage_test extends basetest{
	
	
	ModalDialogspage modalpage;
	
	@BeforeClass
	public void before() {
		Alerts_Frame_Windows alertframe = homepage.goToAlertsFrameWindows();
		modalpage = alertframe.gotomodalpage();
	}
	
	@Test
	public void verifysmallmodal() {
		
	}

}
