package com.toolsQA.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Interactionspageclick {
	
	WebDriver driver;	
	
	By sortable = By.xpath("//span[text()='Sortable']");
	
	By selectable = By.xpath("//span[text()='Selectable']");
	
	By Resizable = By.xpath("//span[text()='Resizable']");
	
	By Droppable = By.xpath("//span[text()='Droppable']");
	
	By Dreaggable = By.xpath("//span[text()='Dragabble']");
	
	public Interactionspageclick(WebDriver driver) {
		this.driver=driver;
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public Sortablepage intractionsortable() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)","");
		driver.findElement(sortable).click();
		return new Sortablepage(driver);
	}
	
	public Selectablepage intractionsselectable() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)","");
		driver.findElement(selectable).click();
		return  new Selectablepage(driver);
	}
	
	public Resizablepage intractionsRezisable() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)","");
		driver.findElement( Resizable).click();
		return new Resizablepage(driver);
	}
	
	public Droppablepage intractionsDroppable() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)","");
		driver.findElement(Droppable).click();
		return new Droppablepage(driver);
	}
	
	public Dreaggablepage intractionsDreaggable() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)","");
		driver.findElement(Dreaggable).click();
		return new Dreaggablepage(driver);
	}
}
