package com.toolsQA.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Sortablepage {

	WebDriver driver;

	public Sortablepage(WebDriver driver) {
		this.driver = driver;
	}

	By title = By.xpath("//div[text()='Sortable']");

	By one = By.xpath("//div[@id='demo-tabpane-list']//div[text()='One']");

	By two = By.xpath("//div[@id='demo-tabpane-list']//div[text()='Two']");

	By three = By.xpath("//div[@id='demo-tabpane-list']//div[text()='Three']");

	By four = By.xpath("//div[@id='demo-tabpane-list']//div[text()='Four']");

	By five = By.xpath("//div[@id='demo-tabpane-list']//div[text()='Five']");

	By six = By.xpath("//div[@id='demo-tabpane-list']//div[text()='Six']");

	public String pagetitle() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		return driver.findElement(title).getText();
	}

}
