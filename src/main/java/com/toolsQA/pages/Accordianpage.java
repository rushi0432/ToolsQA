package com.toolsQA.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Accordianpage {

	WebDriver driver;

	public Accordianpage(WebDriver driver) {
		this.driver = driver;
	}

	By accordianpagetitle = By.xpath("//div[text()='Accordian']");

	By first = By.xpath("//div[text()='What is Lorem Ipsum?']");

	By second = By.xpath("//div[text()='Where does it come from?']");

	By third = By.xpath("//div[text()='Why do we use it?']");

	public String pagetite() {
		return driver.findElement(accordianpagetitle).getText();
	}

	public String vefifyfirstaccordian() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		WebElement ele = driver.findElement(first);
		ele.click();
		return driver.findElement(first).getText();
	}

	public String verifysecondaccordian() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		WebElement ele = driver.findElement(second);
		ele.click();
		return driver.findElement(second).getText();
	}

	public String vefifythirdaccordian() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		WebElement ele = driver.findElement(third);
		ele.click();
		return driver.findElement(third).getText();
	}

}
