package com.toolsQA.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Tabspage {

	WebDriver driver;

	public Tabspage(WebDriver driver) {
		this.driver = driver;
	}

	By tabspagetitle = By.xpath("//div[text()='Tabs']");

	By whattab = By.xpath("//a[@id='demo-tab-what']");

	By origintab = By.xpath("//a[@id='demo-tab-origin']");

	By usetab = By.xpath("//a[@id='demo-tab-use']");

	public String pagetite() {
		return driver.findElement(tabspagetitle).getText();
	}

	public String verifywhattab() {
		WebElement ele = driver.findElement(whattab);
		ele.click();
		return driver.findElement(whattab).getText();
	}

	public String verifyorigintab() {
		WebElement ele = driver.findElement(origintab);
		ele.click();
		return driver.findElement(origintab).getText();
	}

	public String verifyusertab() {
		WebElement ele = driver.findElement(usetab);
		ele.click();
		return driver.findElement(usetab).getText();
	}
}
