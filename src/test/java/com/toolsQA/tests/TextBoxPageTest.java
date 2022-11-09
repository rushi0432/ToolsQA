package com.toolsQA.tests;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.toolsQA.basetest.basetest;
import com.toolsQA.constants.constants;
import com.toolsQA.pages.Elementpage;
import com.toolsQA.pages.TextBoxPage;
import com.toolsQA.utils.ExcelReader;

public class TextBoxPageTest extends basetest {
	TextBoxPage textbox;

	@BeforeClass
	public void before() {
		Elementpage ele = homepage.goToElementPage();
		textbox = ele.textbox();
	}

	@Test(dataProvider = "dp1")
	public void verifyFullName(String s1, String s2, String s3, String s4) {
		String actual = textbox.enterFullname(s1);
		String expected = constants.full_name;
		Assert.assertEquals(actual, expected);
	}

	@DataProvider()
	public Object[][] dp1() throws IOException {
		String path = System.getProperty("user.dir");
		String fullpath = path + File.separator + "src\\main\\resources\\testboxdata.xlsx";
		String sheetName = "sheet1";
		ExcelReader excel = new ExcelReader(fullpath, sheetName);
		return excel.getAllData();
	}

	@Test(dataProvider = "dp2")
	public void verifyemail(String s1, String s2, String s3, String s4) {
		String actual = textbox.enterEmail(s2);
		String expected = constants.email;
		Assert.assertEquals(actual, expected);
	}

	@DataProvider()
	public Object[][] dp2() throws IOException {
		String path = System.getProperty("user.dir");
		String fullpath = path + File.separator + "src\\main\\resources\\testboxdata.xlsx";
		String sheetName = "sheet1";
		ExcelReader excel = new ExcelReader(fullpath, sheetName);
		return excel.getAllData();
	}

	@Test(dataProvider = "dp3")
	public void verifycurrentaddress(String s1, String s2, String s3, String s4) {
		String actual = textbox.entercurrentaddress(s3);
		String expected = constants.currentaddress;
		Assert.assertEquals(actual, expected);
	}

	@DataProvider()
	public Object[][] dp3() throws IOException {
		String path = System.getProperty("user.dir");
		String fullpath = path + File.separator + "src\\main\\resources\\testboxdata.xlsx";
		String sheetName = "sheet1";
		ExcelReader excel = new ExcelReader(fullpath, sheetName);
		return excel.getAllData();
	}

	@Test(dataProvider = "dp4")
	public void verifypermenentaddress(String s1, String s2, String s3, String s4) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)", "");
		String actual = textbox.entercurrentaddress(s4);
		String expected = constants.permenentaddress;
		Assert.assertEquals(actual, expected);
	}

	@DataProvider()
	public Object[][] dp4() throws IOException {
		String path = System.getProperty("user.dir");
		String fullpath = path + File.separator + "src\\main\\resources\\testboxdata.xlsx";
		String sheetName = "sheet1";
		ExcelReader excel = new ExcelReader(fullpath, sheetName);
		return excel.getAllData();
	}
}
