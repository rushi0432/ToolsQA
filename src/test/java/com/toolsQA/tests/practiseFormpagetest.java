package com.toolsQA.tests;

import java.io.File;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.toolsQA.basetest.basetest;
import com.toolsQA.constants.constants;
import com.toolsQA.pages.Formpage;
import com.toolsQA.pages.practiseFormpage;
import com.toolsQA.utils.ExcelReader;

public class practiseFormpagetest extends basetest {

	practiseFormpage practise;

	@BeforeClass
	public void before() {
		Formpage form = homepage.gotoFormpage();
		practise = form.goToPractiseformpage();
	}

	@Test(dataProvider = "dp1")
	public void verifyFirstName(String s1, String s2, String s3, String s4, String s5, String s6) {
		String actual = practise.enterfirstname(s1);
		String expected = constants.First_name;
		Assert.assertEquals(actual, expected);
	}

	@DataProvider()
	public Object[][] dp1() throws IOException {
		String path = System.getProperty("user.dir");
		String fullpath = path + File.separator + "\\src\\main\\resources\\formdata.xlsx";
		String sheetName = "sheet1";
		ExcelReader excel = new ExcelReader(fullpath, sheetName);
		return excel.getAllData();
	}

	@Test(dataProvider = "dp2")
	public void verifyLasttName(String s1, String s2, String s3, String s4, String s5, String s6) {
		String actual = practise.enterlastname(s2);
		String expected = constants.LAST_NAME;
		Assert.assertEquals(actual, expected);
	}

	@DataProvider()
	public Object[][] dp2() throws IOException {
		String path = System.getProperty("user.dir");
		String fullpath = path + File.separator + "\\src\\main\\resources\\formdata.xlsx";
		String sheetName = "sheet1";
		ExcelReader excel = new ExcelReader(fullpath, sheetName);
		return excel.getAllData();
	}

	@Test(dataProvider = "dp3")
	public void verifyemail(String s1, String s2, String s3, String s4, String s5, String s6) {
		String actual = practise.enteremail(s3);
		String expected = constants.EMAIL;
		Assert.assertEquals(actual, expected);
	}

	@DataProvider()
	public Object[][] dp3() throws IOException {
		String path = System.getProperty("user.dir");
		String fullpath = path + File.separator + "\\src\\main\\resources\\formdata.xlsx";
		String sheetName = "sheet1";
		ExcelReader excel = new ExcelReader(fullpath, sheetName);
		return excel.getAllData();
	}

	@Test
	public void verifygender() {
		boolean actual = practise.entergender();
		Assert.assertTrue(actual);
	}

	@Test(dataProvider = "dp4")
	public void verifymobilenumber(String s1, String s2, String s3, String s4, String s5, String s6) {
		String actual = practise.entermobilenumber(s4);
		String expected = constants.MOBILE_NUMBER;
		Assert.assertEquals(actual, expected);
	}

	@DataProvider()
	public Object[][] dp4() throws IOException {
		String path = System.getProperty("user.dir");
		String fullpath = path + File.separator + "\\src\\main\\resources\\formdata.xlsx";
		String sheetName = "sheet1";
		ExcelReader excel = new ExcelReader(fullpath, sheetName);
		return excel.getAllData();
	}

	@Test(dataProvider = "dp5")
	public void verifysubject(String s1, String s2, String s3, String s4, String s5, String s6) {
		String actual = practise.entersubject(s5);
		String expected = constants.SUBJECTS;
		Assert.assertEquals(actual, expected);
	}

	@DataProvider()
	public Object[][] dp5() throws IOException {
		String path = System.getProperty("user.dir");
		String fullpath = path + File.separator + "\\src\\main\\resources\\formdata.xlsx";
		String sheetName = "sheet1";
		ExcelReader excel = new ExcelReader(fullpath, sheetName);
		return excel.getAllData();
	}

	@Test
	public void verifyhobbies() {
		boolean actual = practise.enterhobbies();
		Assert.assertTrue(actual);
	}

	@Test(dataProvider = "dp6")
	public void verifyaddress(String s1, String s2, String s3, String s4, String s5, String s6) {
		String actual = practise.enteraddress(s6);
		String expected = constants.CURRENTADDRESS;
		Assert.assertEquals(actual, expected);
	}

	@DataProvider()
	public Object[][] dp6() throws IOException {
		String path = System.getProperty("user.dir");
		String fullpath = path + File.separator + "\\src\\main\\resources\\formdata.xlsx";
		String sheetName = "sheet1";
		ExcelReader excel = new ExcelReader(fullpath, sheetName);
		return excel.getAllData();
	}

}
