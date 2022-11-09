package com.toolsQA.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Buttonspage {

	WebDriver driver;

	public Buttonspage(WebDriver driver) {
		this.driver = driver;
	}

	By title = By.xpath("//div[text()='Buttons']");

	By button1 = By.xpath("//button[@id='doubleClickBtn']");

	By button2 = By.xpath("//button[@id='rightClickBtn']");

	By button3 = By.xpath("//button[text()='Click Me']");

	public String pagetite() {
		return driver.findElement(title).getText();
	}

	public String verifybutton1() {
		WebElement ele = driver.findElement(button1);
		ele.click();
		Actions act = new Actions(driver);
		act.doubleClick();
		return driver.findElement(button1).getText();
	}

	public String verifybutton2() {
		WebElement ele = driver.findElement(button2);
		ele.click();
		Actions act = new Actions(driver);
		act.doubleClick();
		return driver.findElement(button2).getText();
	}

	public String verifybutton3() {
		WebElement ele = driver.findElement(button3);
		ele.click();
		Actions act = new Actions(driver);
		act.click();
		return driver.findElement(button3).getText();
	}

}
