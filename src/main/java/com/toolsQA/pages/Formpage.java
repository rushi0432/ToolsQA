package com.toolsQA.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Formpage {

	static Logger Log = Logger.getLogger(Formpage.class.getName());

	WebDriver driver;

	By practiseform = By.xpath("//span[text()='Practice Form']");

	public Formpage(WebDriver driver) {
		this.driver = driver;
	}

	public practiseFormpage goToPractiseformpage() {
		driver.findElement(practiseform).click();
		return new practiseFormpage(driver);
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

}
