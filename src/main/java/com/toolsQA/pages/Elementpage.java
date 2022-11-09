package com.toolsQA.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Elementpage {

	static Logger Log = Logger.getLogger(Elementpage.class.getName());

	WebDriver driver;

	By textbox = By.xpath("//span[text()='Text Box']");

	By buttons = By.xpath("//span[text()='Buttons']");

	By Radiobtn = By.xpath("//span[text()='Radio Button']");

	public Elementpage(WebDriver driver) {
		this.driver = driver;
	}

	public TextBoxPage textbox() {
		driver.findElement(textbox).click();
		return new TextBoxPage(driver);
	}

	public Buttonspage buttons() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		driver.findElement(buttons).click();
		return new Buttonspage(driver);
	}

	public Radiobutton Radiobtn() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		driver.findElement(Radiobtn).click();
		return new Radiobutton(driver);
	}

}
