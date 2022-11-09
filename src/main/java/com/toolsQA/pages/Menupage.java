package com.toolsQA.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Menupage {

	WebDriver driver;

	public Menupage(WebDriver driver) {
		this.driver = driver;
	}

	By menupagetitle = By.xpath("//div[text()='Menu']");

	By mainitem1 = By.xpath("//a[text()='Main Item 1']");

	By mainitem2 = By.xpath("//a[text()='Main Item 2']");

	By mainitem3 = By.xpath("//a[text()='Main Item 3']");

	By subsublist = By.xpath("//a[text()='SUB SUB LIST »']");

	By subsubitem1 = By.xpath("//a[text()='Sub Sub Item 1']");

	By subsubitem2 = By.xpath("//a[text()='Sub Sub Item 2']");

	public String pagetite() {
		return driver.findElement(menupagetitle).getText();
	}

	public String verifysubsubitem1() {
		WebElement ele = driver.findElement(mainitem2);
		ele.click();
		WebElement ele1 = driver.findElement(subsublist);
		ele1.click();
		WebElement ele2 = driver.findElement(subsubitem2);
		ele2.click();
		Actions act = new Actions(driver);
		act.moveToElement(ele).click();
		act.moveToElement(ele1).click();
		act.moveToElement(ele2).click();
		return ele2.getText();
	}

	public String verifysubsubitem2() {
		WebElement ele = driver.findElement(mainitem2);
		ele.click();
		WebElement ele1 = driver.findElement(subsublist);
		ele1.click();
		WebElement ele2 = driver.findElement(subsubitem1);
		ele2.click();
		Actions act = new Actions(driver);
		act.moveToElement(ele).click();
		act.moveToElement(ele1).click();
		act.moveToElement(ele2).click();
		return ele2.getText();
	}

	public String verifymainitem1() {
		WebElement ele = driver.findElement(mainitem1);
		ele.click();
		Actions act = new Actions(driver);
		act.click(ele);
		return ele.getText();
	}

	public String verifymainitem2() {
		WebElement ele = driver.findElement(mainitem2);
		ele.click();
		Actions act = new Actions(driver);
		act.click(ele);
		return ele.getText();
	}

	public String verifymainitem3() {
		WebElement ele = driver.findElement(mainitem3);
		ele.click();
		Actions act = new Actions(driver);
		act.click(ele);
		return ele.getText();
	}

}
