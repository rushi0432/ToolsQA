package com.toolsQA.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Droppablepage {

	WebDriver driver;

	public Droppablepage(WebDriver driver) {
		this.driver = driver;
	}

	By title = By.xpath("//div[text()='Droppable']");

	By drag = By.xpath("//div[@id='draggable']");

	By drop = By.xpath("//div[@id='simpleDropContainer']//p[text()='Drop here']");

	By Acceptlin = By.xpath("//a[@id='droppableExample-tab-accept']");

	By acceptdrag = By.xpath("//div[@id='acceptable']");

	By acceptdrop = By.xpath("//div[@id='acceptDropContainer']//p[text()='Drop here']");

	By notaccept = By.xpath("//div[@id='notAcceptable']");

	public String getTitle() {
		WebElement element = driver.findElement(title);
		return driver.findElement(title).getText();
	}

	public String performDragDrop() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		driver.navigate().refresh();
		WebElement src = driver.findElement(drag);
		WebElement droptxt1 = driver.findElement(drop);
		Actions act = new Actions(driver);
		act.dragAndDrop(src, droptxt1).perform();
		return droptxt1.getText();
	}

	public String performAcceptableDragDrop() {
		driver.findElement(Acceptlin).click();
		WebElement src = driver.findElement(acceptdrag);
		WebElement dest = driver.findElement(acceptdrop);
		Actions act = new Actions(driver);
		act.dragAndDrop(src, dest).perform();
		return dest.getText();
	}

	public String performNotAcceptableDragDrop() {
		driver.findElement(Acceptlin).click();
		WebElement src = driver.findElement(notaccept);
		WebElement dest = driver.findElement(acceptdrop);
		Actions act = new Actions(driver);
		act.dragAndDrop(src, dest).perform();
		return dest.getText();
	}
}
