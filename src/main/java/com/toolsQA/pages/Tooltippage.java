package com.toolsQA.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Tooltippage {

	WebDriver driver;

	public Tooltippage(WebDriver driver) {
		this.driver = driver;
	}

	By title = By.xpath("//div[text()='Tool Tips']");

	By buttonhover = By.xpath("//button[@id='toolTipButton']");

	By containerhover = By.xpath("//div[@id='texFieldToolTopContainer']");

	By texthover = By.xpath("//a[text()='Contrary']");

	By numberhover = By.xpath("//a[text()='1.10.32']");

	public String getpagetite() {
		return driver.findElement(title).getText();
	}

	public String verifybuttonhover() {
		WebElement ele = driver.findElement(buttonhover);
		ele.click();
		Actions act = new Actions(driver);
		act.moveToElement(ele);
		return verifybuttonhover();
	}

	public String verifycontainerhover() {
		WebElement ele = driver.findElement(containerhover);
		ele.click();
		Actions act = new Actions(driver);
		act.moveToElement(ele);
		return verifycontainerhover();
	}

	public String verifytexthover() {
		WebElement ele = driver.findElement(texthover);
		ele.click();
		Actions act = new Actions(driver);
		act.moveToElement(ele);
		return verifytexthover();
	}

	public String verifynumberhover() {
		WebElement ele = driver.findElement(numberhover);
		ele.click();
		Actions act = new Actions(driver);
		act.moveToElement(ele).click();
		return verifynumberhover();
	}

}
