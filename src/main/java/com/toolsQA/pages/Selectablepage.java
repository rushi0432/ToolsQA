package com.toolsQA.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Selectablepage {

	WebDriver driver;

	public Selectablepage(WebDriver driver) {
		this.driver = driver;
	}

	By title = By.xpath("//div[text()='Selectable']");

	By firstname = By.xpath("//li[text()='Cras justo odio']");

	By secondname = By.xpath("//li[text()='Dapibus ac facilisis in']");

	By thirdname = By.xpath("//li[text()='Porta ac consectetur ac']");

	By fourthname = By.xpath("//li[text()='Morbi leo risus']");

	public String pagetite() {
		return driver.findElement(title).getText();
	}

	public boolean firstnameselect() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		driver.findElement(firstname).click();
		return driver.findElement(firstname).isSelected();
	}

	public boolean secondnameselect() {
		driver.findElement(secondname).click();
		return driver.findElement(secondname).isSelected();
	}

	public boolean thirdnameselect() {
		driver.findElement(thirdname).click();
		return driver.findElement(thirdname).isSelected();
	}

	public boolean fourthnameselect() {
		driver.findElement(fourthname).click();
		return driver.findElement(fourthname).isSelected();
	}
}
