package com.toolsQA.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Widgetspageclick {

	WebDriver driver;

	By title = By.xpath("//div[@class='pattern-backgound playgound-header']//div[text()='Widgets']");

	By accordian = By.xpath("//span[text()='Accordian']");

	By datepicker = By.xpath("//span[text()='Date Picker']");

	By progressbar = By.xpath("//span[text()='Progress Bar']");

	By menu = By.xpath("//span[text()='Menu']");

	By tabs = By.xpath("//span[text()='Tabs']");

	By tooltip = By.xpath("//span[text()='Tool Tips']");

	By tooltiptitle = By.xpath("//div[text()='Tool Tips']");

	public Widgetspageclick(WebDriver driver) {
		this.driver = driver;
	}

	public void gettitle() {
		driver.findElement(title).getText();
	}

	public Accordianpage Widgetsaccordian() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		driver.findElement(accordian).click();
		return new Accordianpage(driver);
	}

	public Datepickerpage Widgestdatepicker() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		driver.findElement(datepicker).click();
		return new Datepickerpage(driver);
	}

	public Tabspage Widgetstab() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		driver.findElement(tabs).click();
		return new Tabspage(driver);
	}

	public Menupage Widgetsmenu() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)", "");
		driver.findElement(menu).click();
		return new Menupage(driver);
	}

	public Progressbarpage Widgetsprogressbar() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");
		driver.findElement(progressbar).click();
		return new Progressbarpage(driver);
	}

	public String gettooltippagetitle() {
		return driver.findElement(tooltiptitle).getText();
	}

	public Tooltippage Widgetstooltip() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)", "");
		driver.findElement(tooltip).click();
		return new Tooltippage(driver);
	}

}
