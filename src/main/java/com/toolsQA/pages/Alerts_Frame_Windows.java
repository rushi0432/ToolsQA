package com.toolsQA.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Alerts_Frame_Windows {

	WebDriver driver;

	By Alerts = By.xpath("//span[text()='Alerts']");

	By title = By.xpath("//div[text()='Alerts']");
	
	By modaltitle = By.xpath("//div[text()='Modal Dialogs']");
	
	By ModalDialogs = By.xpath("//span[text()='Modal Dialogs']");

	public Alerts_Frame_Windows(WebDriver driver) {
		this.driver = driver;
	}

	public Alerts goToAlerts() {
		driver.findElement(Alerts).click();
		return new Alerts(driver);
	}

	public String getTitle() {
		return driver.findElement(title).getText();
	}
	
	public String gettitle() {
		return driver.findElement(modaltitle).getText();
	}
	
	public ModalDialogspage gotomodalpage() {
		driver.findElement(ModalDialogs).click();
		return new ModalDialogspage(driver);
	}
	
	
}
