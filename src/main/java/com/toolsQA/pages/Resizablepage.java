package com.toolsQA.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Resizablepage {

	WebDriver driver;

	public Resizablepage(WebDriver driver) {
		this.driver = driver;
	}

	By title = By.xpath("//span[text()='Resizable']");

	public String getTitle() {
		WebElement element = driver.findElement(title);
		return driver.findElement(title).getText();
	}
}
