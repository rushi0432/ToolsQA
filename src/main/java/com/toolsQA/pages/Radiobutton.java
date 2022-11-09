package com.toolsQA.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Radiobutton {

	WebDriver driver;

	public Radiobutton(WebDriver driver) {
		this.driver = driver;
	}

	By title = By.xpath("//div[text()='Radio Button']");

	By yestext = By.xpath("//label[@for='yesRadio']");

	By impressivertext = By.xpath("//label[@for='impressiveRadio']");

	public String pagetite() {
		return driver.findElement(title).getText();
	}

	public boolean verifyyes() {
		driver.findElement(yestext).click();
		return driver.findElement(yestext).isSelected();
	}

	public boolean verifyimpressivebutton() {
		driver.findElement(impressivertext).click();
		return driver.findElement(impressivertext).isSelected();
	}
}
