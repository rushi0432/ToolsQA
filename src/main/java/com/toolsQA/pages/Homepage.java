package com.toolsQA.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
	
	static Logger Log = Logger.getLogger(Homepage.class.getName());

	WebDriver driver;
	
	
	By pagetitle = By.xpath("//title[text()='ToolsQA']");
	
	By elementtobepresent = By.xpath("//h5[text()='Elements']");
	
	By formstobepresent = By.xpath("//h5[text()='Forms']");
	
	By alertstobepresent = By.xpath("//h5[text()='Alerts, Frame & Windows']");
	
	By widgetstobepresent = By.xpath("//h5[text()='Widgets']");
	
	By intrectionstobepresent = By.xpath("//h5[text()='Interactions']");
	
	By booktobepresent = By.xpath("//h5[text()='Book Store Application']");
	
	public Homepage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getpagetitle() {
		return driver.getTitle();
	}
	
	public String getelementtobepresent() {
		return driver.findElement(elementtobepresent).getText();
	}
	
	public String getformstobepresent() {
		return driver.findElement(formstobepresent).getText();
	}
	
	public String getalertstobepresent() {
		return driver.findElement(alertstobepresent).getText();
	}
	
	public String getwidgetstobepresent() {
		return driver.findElement(widgetstobepresent).getText();
	}
	
	public String getintrectionstobepresent() {
		return driver.findElement(intrectionstobepresent).getText();
	}
	
	public String getbooktobepresent() {
		return driver.findElement(booktobepresent).getText();
	}
	
	public Elementpage goToElementPage() {
		driver.findElement(elementtobepresent).click();
		return new Elementpage(driver);
	}
	
	public Formpage gotoFormpage() {
		driver.findElement(formstobepresent).click();
		return new Formpage(driver);
	}
	
	public Alerts_Frame_Windows goToAlertsFrameWindows() {
		driver.findElement(alertstobepresent).click();
		return new Alerts_Frame_Windows(driver);
	}
	
	public Widgetspageclick gotoWidgetspage() {
		driver.findElement(widgetstobepresent).click();
		return new Widgetspageclick(driver);
	}	
	
	public Interactionspageclick gotoInteractionspage() {
		driver.findElement(intrectionstobepresent).click();
		return new Interactionspageclick(driver);	
	}
}
