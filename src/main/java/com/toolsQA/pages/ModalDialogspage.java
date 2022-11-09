package com.toolsQA.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ModalDialogspage {
	
	WebDriver driver;
	
	public ModalDialogspage(WebDriver driver) {
		this.driver = driver;
	}
	
	By pagetitle = By.xpath("//div[text()='Modal Dialogs']");
	
	By smallbutton = By.xpath("//button[@id='showSmallModal']");
	
	By largebutton = By.xpath("//button[@id='showLargeModal']");
	
	public String getTitle() {
		return driver.findElement(pagetitle).getText();
	}
	
	public void clicksmallmodel() {
		WebElement ele = driver.findElement(smallbutton);
		ele.click();
		Actions act = new Actions(driver); 
		
		
	
	}
	
	

}
