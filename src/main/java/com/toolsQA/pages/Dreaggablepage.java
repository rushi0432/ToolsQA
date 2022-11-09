package com.toolsQA.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dreaggablepage {

	WebDriver driver;

	public Dreaggablepage(WebDriver driver) {
		this.driver = driver;
	}

	By title = By.xpath("//div[text()='Dragabble']");

	public String getTitle() {
		WebElement element = driver.findElement(title);
		return driver.findElement(title).getText();
	}

}
