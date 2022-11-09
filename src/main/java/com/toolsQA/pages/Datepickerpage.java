package com.toolsQA.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Datepickerpage {
	
	WebDriver driver;
	public Datepickerpage(WebDriver driver) {
		this.driver=driver;
	}
	
	By datepickerpagetitle = By.xpath("//div[text()='Date Picker']");
	
	public String pagetite() {
		return driver.findElement(datepickerpagetitle).getText();
	}
	
}
